package za.co.ritzware.oasis.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class RegistrationBean {
	
	//Personal Details 
	private String firstName;
	private String lastName;
	private String id;
	private String gender;
	private Date dateOfBirth;
	private String maritalStatus;
	private String cellNumber;
	private String email;
	
	//Employment Details
	private String occupation;
	private String companyName;
	private double monthlyIncome;
	private String employmentPeriod;
	private String workPhone;
	private String incomeTaxNumber;
	
	//Communication Preference
	private String methodOfContact;
	
	//Application Specific Fields
	private String typeOfPlace;
	private String lengthOfStay;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTypeOfPlace() {
		return typeOfPlace;
	}

	public void setTypeOfPlace(String typeOfPlace) {
		this.typeOfPlace = typeOfPlace;
	}

	public String getLengthOfStay() {
		return lengthOfStay;
	}

	public void setLengthOfStay(String lengthOfStay) {
		this.lengthOfStay = lengthOfStay;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getCellNumber() {
		return cellNumber;
	}

	public void setCellNumber(String cellNumber) {
		this.cellNumber = cellNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public double getMonthlyIncome() {
		return monthlyIncome;
	}

	public void setMonthlyIncome(double monthlyIncome) {
		this.monthlyIncome = monthlyIncome;
	}

	public String getEmploymentPeriod() {
		return employmentPeriod;
	}

	public void setEmploymentPeriod(String employmentPeriod) {
		this.employmentPeriod = employmentPeriod;
	}

	public String getWorkPhone() {
		return workPhone;
	}

	public void setWorkPhone(String workPhone) {
		this.workPhone = workPhone;
	}

	public String getIncomeTaxNumber() {
		return incomeTaxNumber;
	}

	public void setIncomeTaxNumber(String incomeTaxNumber) {
		this.incomeTaxNumber = incomeTaxNumber;
	}

	public String getMethodOfContact() {
		return methodOfContact;
	}

	public void setMethodOfContact(String methodOfContact) {
		this.methodOfContact = methodOfContact;
	}

	
}
