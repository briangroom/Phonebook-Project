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

	public int compareTo(String phoneIn) {

		if (phoneIn == this.getPhone()) {
			return 0;
		} else {
			return 1;
		}
	}

	public int fNameCompareTo(String fName) {

		PhoneBook pb1 = new PhoneBook();
		pb1.entries = pb1.getEntries();

		int foundRec = 0;

		if (pb1.entries.size()>0) {
			for (int i=0; i<pb1.entries.size(); i++) {
				if (getFirstName().equals(fName)) {
					foundRec = 1;
					System.out.println(pb1.entries);
					}
			}
		}else {
			System.out.println("No entries found.");
		}

		return foundRec;
	}

	public int lNameCompareTo(String lName) {

		if (lName == this.getLastName()) {
			return 0;
		} else {
			return 1;
		}
	}

	public int flNameCompareTo(String flName) {

		if (flName == this.getFullName()) {
			return 0;
		} else {
			return 1;
		}
	}

	public int phoneCompareTo(String phone) {

		if (phone == this.getPhone()) {
			return 0;
		} else {
			return 1;
		}
	}

}
