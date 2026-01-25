package com.streams.inputfromconsole;

import java.io.*;

public class ReadUserInputFromConsole {

	public static void main(String[] args) {
		
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			FileWriter fw = new FileWriter("All-File/data.txt")){
			
			    System.out.print("Enter your name: ");
	            String name = br.readLine();

	            System.out.print("Enter your age: ");
	            String age = br.readLine();

	            System.out.print("Enter your favorite programming language: ");
	            String language = br.readLine();

	            fw.write("Name: " + name + "\n");
	            fw.write("Age: " + age + "\n");
	            fw.write("Favorite Language: " + language + "\n");

	            System.out.println("User information saved successfully.");
		}catch(IOException e) {
			e.getStackTrace();
		}
	}
	
}
