package com.exceptions.trywithresources;
	import java.io.BufferedReader;
	import java.io.FileReader;
	import java.io.IOException;

	public class TryWithResources {

	    public static void main(String[] args) {

	        //try-with-resources
	        try (BufferedReader reader = new BufferedReader(new FileReader("All-File/info.txt"))) {

	            //Read first line
	            String firstLine = reader.readLine();
	            System.out.println(firstLine);

	        } catch (IOException e) {
	            // Handles file not found or read error
	            System.out.println("File not found");
	        }
	    }
	}
