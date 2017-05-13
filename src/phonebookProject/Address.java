/**
 * 
 */
package phonebookProject;

import java.util.List;

/**
 * @author Brian Groom 05/02/17
 *
 */
public class Address {

	private String street;
	private String city;
	private String state;
	private String zipCode;
	
	public Address() {}

	public Address(String street, String city, String state, String zipCode) {
		this.street = street;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	
/*	public int compareTo(String phoneIn) {

		if (phoneIn == this.phone) {
			return 0;
		} else {
			return 1;
		}
	}
*/
	public int cityCompareTo(String city) {

		if (city == this.city) {
			return 0;
		} else {
			return 1;
		}
	}

	public int stateCompareTo(String state) {

		if (state == this.state) {
			return 0;
		} else {
			return 1;
		}
	}

}