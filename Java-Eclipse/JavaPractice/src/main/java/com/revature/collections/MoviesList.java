package com.revature.collections;
import java.util.*;

public class MoviesList {
	public static void main(String[] args) {
		ArrayList<String> myMovies = new ArrayList<String>();
		
		myMovies.add("Avengers Infinity War");
		myMovies.add("Avatar");
		myMovies.add("The Persuit of Happiness");
		myMovies.add("Tick Tick Boom!");
		myMovies.add("Liberal Arts");
		
		for (Iterator iterator = myMovies.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println(string);
		}
		
		Collections.sort(myMovies);
		System.out.println(myMovies);
	}
}
