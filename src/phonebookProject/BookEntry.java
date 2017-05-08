/**
 * 
 */
package phonebookProject;

/**
 * @author Brian Groom
 * 05/06/17
 *
 */
public class BookEntry {
	private String fullName;
	private String firstName;
	private String middleName;
	private String lastName;
	private String phone;
	//Address A1 = new Address();
	
	public BookEntry () {}
	
	public BookEntry (String flName, String fName, String mName, String lName, String phone){
		this.fullName = flName;
		this.firstName = fName;
		this.middleName = mName;
		this.lastName = lName;
		this.phone = phone;
		
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

		public String toString(){
			return "Full Name : "+this.fullName 
					+"\nFirst Name : "+this.firstName
					+"\nMiddle Name ; "+this.middleName
					+"\nLast Name ; "+this.lastName
					+"\nPhone : "+this.phone;
		}
		public int compareTo(String phoneIn){

		    if(phoneIn == this.phone){
		        return 0;
		    }else{
		    	return 1;}
		    }
		public int fNameCompareTo(String fName){

		    if(fName == this.firstName){
		        return 0;
		    }else{
		    	return 1;}
			}
		public int lNameCompareTo(String lName){

		    if(lName == this.lastName){
		        return 0;
		    }else{
		    	return 1;}
			}
		public int flNameCompareTo(String flName){

		    if(flName == this.fullName){
		        return 0;
		    }else{
		    	return 1;}
			}
		public int phoneCompareTo(String phone){

		    if(phone == this.phone){
		        return 0;
		    }else{
		    	return 1;}
			}


}

