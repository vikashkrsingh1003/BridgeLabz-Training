package com.streams.bufferedstreams;

import java.io.*;

public class BufferedStreams {

	public static void main(String[] args) {

		try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream("All-File/input.txt"));
			BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("All-File/output.txt"))){
			
			byte[] buffer = new byte[4096];
			int byteRead;
			
			long startTime = System.nanoTime();
			
			while((byteRead = bis.read(buffer)) != -1)
			{
				bos.write(buffer, 0 , byteRead);
			}
			
			long endTime = System.nanoTime();
			
			System.out.println("File copied successfully with buffering");
			System.out.println("Time consumed (ms):" + (endTime - startTime)/1_000_000);

		}catch(IOException e) {
			e.getStackTrace();
		}
	}

}
