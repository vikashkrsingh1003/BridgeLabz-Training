package com.collections.insurancepolicymanagementsystem;

import java.util.*;
import java.time.LocalDate;

public class PolicyManager {

	Map<Integer,Policy> mapByNumber = new HashMap<>();
	Map<Integer,Policy> linkedHashMap = new LinkedHashMap<>();
	TreeMap<LocalDate,List<Policy>> treeMap = new TreeMap<>();

	public void addPolicy(Policy p) {
		mapByNumber.put(p.getPolicyNumber(), p);
		linkedHashMap.put(p.getPolicyNumber(), p);
		treeMap.computeIfAbsent(p.getExpiryDate(), k -> new ArrayList<>()).add(p);	
	}
	
	public Policy getPolicy(int policyNumber)
	{
		if(mapByNumber.containsKey(policyNumber))
		   return mapByNumber.get(policyNumber);
		
		return null;		
	}
	
	public void getSpecificPolicyHolder(String name) {
		for(Policy p : mapByNumber.values()) {
			if(p.getName().equalsIgnoreCase(name)) {
				System.out.println(p);
			}
		}
	}
	
	public void getPoliciesExpiringInNext30Days() {

        LocalDate today = LocalDate.now();
        LocalDate next30Days = today.plusDays(30);

        for (Map.Entry<LocalDate, List<Policy>> entry :
                treeMap.subMap(today, true, next30Days, true).entrySet()) {

            for (Policy p : entry.getValue()) {
                System.out.println(p);
            }
        }
    }
	
	 public void removeExpiredPolicies() {

	        LocalDate today = LocalDate.now();
	        List<Policy> expired = new ArrayList<>();

	        for (Map.Entry<LocalDate, List<Policy>> entry :
	                treeMap.headMap(today, false).entrySet()) {
	            expired.addAll(entry.getValue());
	        }

	        for (Policy p : expired) {
	            mapByNumber.remove(p.getPolicyNumber());
	            linkedHashMap.remove(p.getPolicyNumber());
	        }

	        treeMap.headMap(today, false).clear();
	    }
}
