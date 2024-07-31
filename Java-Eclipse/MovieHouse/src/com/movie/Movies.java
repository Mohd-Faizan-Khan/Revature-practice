package com.movie;

public abstract class Movies {
	
	private String movieName;
	private String movieGenre;
	private int movieLength;
	private String performance;
	
	public Movies() {
		super();
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getMovieGenre() {
		return movieGenre;
	}
	public void setMovieGenre(String movieGenre) {
		this.movieGenre = movieGenre;
	}
	public int getMovieLength() {
		return movieLength;
	}
	public void setMovieLength(int movieLength) {
		this.movieLength = movieLength;
	}
	
	public void moviePerformance() {
		
			if (this.getPerformance().equals("Good")) {
				System.out.println("Movie is "+ this.getPerformance());
			}
			else if(this.getPerformance().equals("Super Hit")) {
				System.out.println("Movie is " + this.getPerformance());
			}
			else
				System.out.println("Movie is Poor");
		}
		

	
	
	public String getPerformance() {
		return performance;
	}
	public void setPerformance(String performance) {
		this.performance = performance;
	}
	public Movies(String movieName, String movieGenre, int movieLength, String performance) {
		super();
		this.movieName = movieName;
		this.movieGenre = movieGenre;
		this.movieLength = movieLength;
		this.performance = performance;
	}
	@Override
	public String toString() {
		return "Movies [movieName=" + movieName + ", movieGenre=" + movieGenre + ", movieLength=" + movieLength
				+ ", performance=" + performance + "]";
	}
	
	
	
	
	
}
