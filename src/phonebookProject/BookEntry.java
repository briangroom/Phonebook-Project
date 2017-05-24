/**
 * 
 */
package phonebookProject;

/**
 * @author Brian Groom 05/06/17
 *
 */
public class BookEntry {
	
	private String fullName;
	private String firstName;
	private String middleName;
	private String lastName;
	private String phone;
	Address Address;
	
	public BookEntry() {
	}

	public BookEntry(String flName, String fName, String mName, String lName, String phone, Address address) {
		this.fullName = flName;
		this.firstName = fName;
		this.middleName = mName;
		this.lastName = lName;
		this.phone = phone;
		Address = address;

	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}


	public Address getAddress() {
		return Address;
	}

	public void setAddress(Address address) {
		Address = address;
	}

	public String toString() {
		return ("\nName: " + this.fullName + "  Address: "+Address.getStreet()+
				", "+Address.getCity()+", "+Address.getState()+", "+
				Address.getZipCode()+"  Phone: " + this.phone);
	}
}


