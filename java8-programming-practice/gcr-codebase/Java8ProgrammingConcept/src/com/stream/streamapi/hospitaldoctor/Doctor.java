package com.stream.streamapi.hospitaldoctor;

public class Doctor {

	boolean availability;
	String speciality;
	
	Doctor(boolean availability,String speciality){
		this.availability = availability;
		this.speciality = speciality;
	}

	public boolean isAvailability() {
		return availability;
	}

	public String getSpeciality() {
		return speciality;
	}

	@Override
	public String toString() {
		return "Doctor [availability=" + availability + ", speciality=" + speciality + "]";
	}
	
	
}
