/**
 * 
 */
package phonebookProject;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Brian Groom
 * 05/06/17
 *
 */
public class PhoneBook {
List<BookEntry> entries = new ArrayList<BookEntry>();
List<AddressClass> addresses = new ArrayList<AddressClass>();

public PhoneBook () {}

public PhoneBook (ArrayList entries, ArrayList addresses){
	this.entries = entries;
	this.addresses = addresses;
}


public List<BookEntry> getEntries() {
	return entries;
}

public void setEntries(List<BookEntry> entries) {
	this.entries = entries;
}

public List<AddressClass> getAddresses() {
	return addresses;
}

public void setAddresses(List<AddressClass> addresses) {
	this.addresses = addresses;
}

public void displayDirectory(){
	
	BookEntry be1 = new BookEntry ();
	AddressClass a1 = new AddressClass ();
	List<BookEntry> entries = getEntries();
	List<AddressClass> addresses = getAddresses();

	System.out.println( "Directory : "+this.entries 
			+"\nAddress : "+addresses);
		}
		
}
