package com.stream.streamapi.top5trendingmovies;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TrendingMovies {

	public static void main(String[] args) {
	List<Movie> moviesList = new ArrayList<>(List.of(new Movie(4.2,2004),
			new Movie(4.0,2025),
			new Movie(4.0,2026),
			new Movie(2.2,2024),
			new Movie(4.2,2024),
			new Movie(5.0,2014),
			new Movie(4.2,2016)));
	
	List<Movie> top5 = moviesList.stream()
	.filter(m -> m.rating >= 4)
	.sorted(Comparator.comparing(Movie::getRating).reversed()
			.thenComparing(Movie::getReleaseYear).reversed())
	.limit(5).toList();
	
	top5.forEach(m ->
    System.out.println(m.getRating() + " " + m.getReleaseYear()));
	}
}
