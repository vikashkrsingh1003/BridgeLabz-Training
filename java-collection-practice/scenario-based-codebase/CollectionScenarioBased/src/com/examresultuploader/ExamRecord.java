package com.examresultuploader;

public class ExamRecord <T>{
	    String roll;
	    String name;
	    String subject;
	    T marks;

	    public ExamRecord(String roll, String name, String subject, T marks) {
	        this.roll = roll;
	        this.name = name;
	        this.subject = subject;
	        this.marks = marks;
	    }
}
