package za.co.ritzware.oasis.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Application {
	private String id;
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

}
