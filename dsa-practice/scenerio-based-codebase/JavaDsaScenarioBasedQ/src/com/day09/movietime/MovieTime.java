package com.day09.movietime;

public class MovieTime {
	 public static int convertToMinutes(String time) {
	        String[] t = time.split(":");
	        int hours = Integer.parseInt(t[0]);
	        int minutes = Integer.parseInt(t[1]);
	        return hours * 60 + minutes;
	 }

	    
	 public static Movie[] insertionSort(Movie[] shows) {
	        int n = shows.length;

	        for (int i = 1; i < n; i++) {
	            Movie key = shows[i];
	            int keyTime = convertToMinutes(key.showTime);
	            int j = i - 1;

	            while (j >= 0 && convertToMinutes(shows[j].showTime) > keyTime) {
	                shows[j + 1] = shows[j];  
	                j--;
	            }
	            shows[j + 1] = key;   
	        }
	        return shows;
	}
	 
	public static void main(String[] args) {
		Movie[] shows = {
	            new Movie("Morning Show", "09:30"),
	            new Movie("Tiger Returns 2", "12:45"),
	            new Movie("The Tiger Returns", "16:40"),
	            new Movie("Kabhi Khushi Kabhi Gam", "19:00")
	        };

	        System.out.println("====== Movie Theatre Show Listings ======\n");

	        insertionSort(shows);

	        System.out.printf("%-30s %-10s%n", "Movie Name", "Show Time");
	        System.out.println("------------------------------------------");

	        for (Movie m : shows) {
	            System.out.printf("%-30s %-10s%n", m.movieName, m.showTime);
	        }
	        System.out.println("\n====== Thank You for Visiting ======");
       
	}

}