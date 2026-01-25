package com.streams.filterstreams;

import java.io.*;

public class ConvertUppercaseToLowercase {

	public static void main(String[] args) {

		try(FileReader fr = new FileReader("All-File/data.txt");
			BufferedReader br = new BufferedReader(fr);
			
			FileWriter fw = new FileWriter("All-File/dataa.txt");	
		    BufferedWriter bw = new BufferedWriter(fw))
		{
			
			String line;
			while((line = br.readLine()) != null)
			{
				bw.write(line.toLowerCase());
				bw.newLine();
			}
			
			System.out.println("File copied successfully with buffering.");
		}catch(IOException e){
			e.getStackTrace();
		}
	}

}
