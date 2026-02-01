package com.stream.streamapi.top5trendingmovies;

public class Movie {

	double rating;
	int releaseYear;
	

	Movie(double rating, int releaseYear){
		this.rating = rating;
		this.releaseYear = releaseYear;
	}


	public double getRating() {
		return rating;
	}

	public int getReleaseYear() {
		return releaseYear;
	}
}
