package za.co.ritzware.oasis.utils;

import java.util.Calendar;
import java.util.Random;

public class GenericUtilities {

	public static String generateUniqueRefNumber() {
		return generate3RandomLetters() + getTimestamp();	
	}

	private static String getTimestamp() {
		
		return ""+Calendar.getInstance().getTimeInMillis();
	}

	private static String generate3RandomLetters() {
		Random rand=new Random();
		int letter1= 65 + rand.nextInt(25);
		int letter2= 65 + rand.nextInt(25);
		int letter3= 65 + rand.nextInt(25);
		
		return ""+ (char)letter1+ (char)letter2+ (char)letter3;
	}
}
