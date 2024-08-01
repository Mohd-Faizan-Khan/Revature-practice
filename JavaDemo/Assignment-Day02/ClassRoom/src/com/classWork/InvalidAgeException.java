package com.classWork;

public class InvalidAgeException extends Exception{
	public String getMessage(){
		return "You are not allowed to vote";
	}
}
