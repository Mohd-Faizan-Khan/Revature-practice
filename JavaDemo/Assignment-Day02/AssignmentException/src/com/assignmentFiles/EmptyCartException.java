package com.assignmentFiles;

public class EmptyCartException extends Throwable{
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "The cart is Empty!";
	}
}
