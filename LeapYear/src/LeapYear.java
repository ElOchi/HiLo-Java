
public class LeapYear {

	public static void main(String[] args) {
		/*
		 * File: LeapYear.java
		 * 
		 * This program reads in a year and determines whether it is a leap year.
		 * A year is a leap year if it is divisible by four, unless it is divisible by 100.
		 * Years divisible by 100 are leap years only if divisible by 400.
		 * 
		 */

		



		
		
				println("This program checks for leap years.");
				int year = readInt("Enter year: ");
				boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
				
				if(isLeapYear) {
					println(year + " is a leap year.");
				}	else {
					println(year + " is not a leap year.");
				}
			}
		

	

	private static int readInt(String string) {
		// TODO Auto-generated method stub
		return 0;
	}

	private static void println(String string) {
		// TODO Auto-generated method stub
		
	}

}
