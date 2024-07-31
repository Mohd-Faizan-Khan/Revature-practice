package com.movie;

public class MovieWorld {
	public static void main(String[] args) {
		Movie2D movie2d = new Movie2D("Dune", "Si Fi", 180, "Good");
		Movie3D movie3d = new Movie3D("Avatar", "Si Fi", 200, "Super Hit");
		
		System.out.println(movie2d);
		System.out.println(movie3d);
		
		movie2d.moviePerformance();
		movie3d.moviePerformance();
	}
	
}
