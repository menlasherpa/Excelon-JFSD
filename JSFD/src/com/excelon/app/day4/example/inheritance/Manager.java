package com.excelon.app.day4.example.inheritance;

public class Manager extends Employee {
	   private String desig;

	   public Manager(String desig) {
	   	super(101,"Ramana",10000);
	   	this.desig = desig;
	   }

	   @Override
	   public String toString() {
	   	return "Manager [desig=" + desig + ", toString()=" + super.toString() + "]";
	   }

}
