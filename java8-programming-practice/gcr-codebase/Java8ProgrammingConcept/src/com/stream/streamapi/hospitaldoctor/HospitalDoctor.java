package com.stream.streamapi.hospitaldoctor;

import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;


public class HospitalDoctor {

	public static void main(String[] args){
		List<Doctor> list = new ArrayList<>(List.of(new Doctor(true,"Dentist"),
				                                new Doctor(false,"Neuro"),
				                                new Doctor(true,"Cardio"),
				                                new Doctor(true,"Ortho"),
				                                new Doctor(true,"Dermologist")));
		
	List<Doctor> availableDoctorList = list.stream()
				.filter(d -> d.isAvailability())
				.sorted(Comparator.comparing(Doctor::getSpeciality))
		        .toList();
		
		availableDoctorList.forEach(d ->System.out.println(d));
	}
}
