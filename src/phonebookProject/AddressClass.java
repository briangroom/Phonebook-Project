/**
 * 
 */
package phonebookProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Brian Groom
 * 05/02/17
 *
 */
public class AddressClass {
	
	private String street;
	private String city;
	private String state;
	private String zipCode;
	private String phone;
		
	public AddressClass (){}
	
	public AddressClass (String street, String city, String state, String zipCode, String phone){
		this.street = street;
		this.city =city;
		this.state = state;
		this.zipCode = zipCode;
		this.phone = phone; 
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
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int compareTo(String phoneIn){

	    if(phoneIn == this.phone){
	        return 0;
	    }else{
	    	return 1;
	    }
	}
	public int cityCompareTo(String city){

	    if(city == this.city){
	        return 0;
	    }else{
	    	return 1;}
		}
	public int stateCompareTo(String state){

	    if(state == this.state){
	        return 0;
	    }else{
	    	return 1;}
		}

}