package com.methodreference.hospitalpatientidprinting;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		List<Patient> patients = new ArrayList<>(List.of(new Patient(101,"saurav"),
		           new Patient(102,"vikash"),
		           new Patient(102,"raghav"),
		           new Patient(102,"Teja")));
		
		patients.forEach(Patient::displayName);
		patients.forEach(Patient::displayId);
		}

}
