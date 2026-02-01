package com.resumeanalyzer;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.*;

public class ResumeManager extends ResumeData{
	
	public static void main(String[] args) {
		Map<String,ResumeData> map= new HashMap<>();
		List<ResumeData> candidates = new ArrayList<>();

		File folder = new File("C:\\Users\\saura\\OneDrive\\Desktop\\New folder");
		File[] files = folder.listFiles();
		
		for(File file: files)
		{
			if(file.isFile() && (file.getName().endsWith(".txt")|| file.getName().endsWith(".pdf"))) {
			try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file))){
				
				StringBuilder content = new StringBuilder();
				
				int ch;
				String resumeText = "";
				while((ch = bis.read()) != -1) {
					content.append((char)ch);
				}
				    resumeText = content.toString();
					ResumeData resume = extractDetails(resumeText);
			
					if(resume.email != null) {
					    map.put(resume.email, resume);
					    candidates.add(resume);
					
				}
			}catch(IOException e) {
		       System.out.println("Skipping file: " + file.getName());
			}
		}
	}
		Collections.sort(candidates,(a, b) -> 
        Integer.compare(b.keywordCount, a.keywordCount));
		
		for (ResumeData r : candidates) {
		    r.display();;
		}
}
	
	private static ResumeData extractDetails(String text) {
		
		ResumeData data = new ResumeData();
		
		String emailRegex = "\\b[a-zA-z_.0-9]+@[a-zA-z_.0-9]+\\.[a-zA-z]{2,}\\b";
		String phoneRegex =  "(?:\\+91[- ]?)?\\b\\d{10}\\b";
		
		Pattern emailPattern = Pattern.compile(emailRegex);
		Pattern phonePattern= Pattern.compile(phoneRegex);
		
		Matcher emailmatcher = emailPattern.matcher(text);
		Matcher phonematcher = phonePattern.matcher(text);

		if(emailmatcher.find()){
			 data.email = emailmatcher.group();
		}
		if(phonematcher.find()){
			 data.phone = phonematcher.group();
		}
		
		String[] keywords = {"java", "python", "Spring"};
		
		    int count = 0;
	        for (String key : keywords) {

	            Pattern p = Pattern.compile("\\b" + key + "\\b", Pattern.CASE_INSENSITIVE);
	            Matcher m = p.matcher(text);

	            while (m.find()) {
	                count++;
	            }
	        }

	        data.keywordCount = count;

	        return data;
	}
	
}
