package za.co.ritzware.oasis.utils;

import java.util.Date;

import za.co.ritzware.oasis.dao.RegisterDAO;
import za.co.ritzware.oasis.dao.jdbc.RegisterDAOJDBC;
import za.co.ritzware.oasis.model.RegistrationBean;

public class DatabaseTester {

	public static void main(String args []) {
		RegisterDAO register=new RegisterDAOJDBC();
		
		RegistrationBean application= new RegistrationBean();
		
		application.setCellNumber("01111");
		application.setCompanyName("CompanyName");
		application.setDateOfBirth(new Date());
		application.setEmail("me@me.com");
		application.setEmploymentPeriod("12 Months");
		application.setFirstName("Jimzo");
		application.setGender("Male");
		application.setId("7864955");
		application.setIncomeTaxNumber("AAAXCER");
		application.setLastName("Ritzo");
		application.setLengthOfStay("3 Years");
		application.setMaritalStatus("Married");
		application.setMethodOfContact("Email");
		application.setMonthlyIncome(28000);
		application.setOccupation("Programmer");
		application.setTypeOfPlace("Apartment");
		application.setWorkPhone("0110000");
		
		String refNum= register.save(application);
		
		System.out.println(refNum);
	}
}
