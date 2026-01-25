package com.streams.bytearray;

import java.io.*;

public class ImageToByteArray {

	public static void main(String[] args) {

		try(ByteArrayOutputStream bos = new ByteArrayOutputStream();
				FileInputStream fis = new FileInputStream("All-File/bird.png");
				FileOutputStream fos = new FileOutputStream("All-File/par.jpg")
            ){
			
			byte[] buffer = new byte[4096];
			int byteRead;
			
			while((byteRead = fis.read(buffer)) != -1) {
				bos.write(buffer, 0 , byteRead);
			}
			
			byte[] imageBytes = bos.toByteArray();
			
			
			ByteArrayInputStream bis = new ByteArrayInputStream(imageBytes);
			while((byteRead = bis.read(buffer)) != -1)
			{
				fos.write(buffer, 0 , byteRead);
			}
			
			bis.close();	
			
            System.out.println("Image copied successfully using ByteArray Streams");

		}catch(IOException e) {
			e.getStackTrace();
		}
		
	}

}
