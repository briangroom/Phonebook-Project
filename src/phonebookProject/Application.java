/**
 * 
 */
package phonebookProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Brian Groom
 * 05/05/17
 *
 */
public class Application {
	BookEntry be1 = new BookEntry ();
	AddressClass a1 = new AddressClass ();
	PhoneBook pb1 = new PhoneBook ();
	List<BookEntry> entries = pb1.getEntries();
	List<AddressClass> addresses = pb1.getAddresses();


	/**
	 * This program will simulate the actions of a phonebook.
	 * The program is able to :
	 * •Add new entries
	 * •Search for an existing entry
	 * •Search by first name 
	 * •Search by last name 
	 * •Search by full name *note name is not unique therefore the result should be an array of Person Objects.
	 * •Search by telephone number
	 * •Search by city or state
	 * •Delete a record for a given telephone number
	 * •Update a record for a given telephone number
	 * •Show all records in asc order
	 * •An option to exit the program
	 * The program will operate on the console. It will display all the choices when the program loads. 
	 *    1. Add new record
	 *    2. Delete a record
	 *    3. Update a record
	 *    4. Search for a record
	 *    		a. Search by First name
	 *    		b. Search by Last name
	 *    		c. Search by Full name (First middle last)
	 *    		d. Search by Phone number
	 *    		e. Search by City
	 *    		f. Search by State
	 *    5. Display all records in Directory
	 *    6. Exit
	 * Program will run until the user selects the exit option.
	 * 
	 * Program must have a minimum of 2 classes a Person class, an Address  class.
	 * 
	 * Sample data:
	 * John Doe, 114 Market St, St Louis, MO, 63403, 6366435698
	 * John E Doe, 324 Main St, St Charles, MO, 63303, 8475390126
	 * John Michael West Doe, 574 Pole ave, St. Peters, MO, 63333, 5628592375
	 * 
	 * Searching for John should return a list of all 3 records above, 
	 * displaying the telephone number in this order (636)-453-8563.
	 * 
	 * Optional - add additional features to your program, for storing cell, home, work and fax numbers.
	 *            Also features for storing events like birthday, anniversary, email… etc   
	 */
	public static void main(String[] args) {

		displayMenu();
		
	}
	
		
	public static void displayMenu() {
 
	     BookEntry myBookEntry = new BookEntry();
		int function = 0;
		
		while (function != 6)  {
		     System.out.println("\nYou are running the phone book application.");
		     System.out.println("Available Functions:");
		     System.out.println("1. Add new record");
		     System.out.println("2. Delete a record");
		     System.out.println("3. Update a record");
		     System.out.println("4. Search for a record");
		     System.out.println("5. Display all records in directory");
		     System.out.println("6. Exit");
		     System.out.println("Please select the number of the function you would like to perform.");
		     Scanner input = new Scanner (System.in);
		     function = input.nextInt();

		        switch (function) { 
		        	case 1: 
		        		System.out.println("Funtion 1"); 
		   		     	System.out.println("\nYou selected to add a record.");
		   		     	System.out.println("Please enter the new record in the following format:");
		   		     	System.out.println("John Michael West Doe, 574 Pole ave, St. Peters, MO, 63333, 5628592375");
		   		     	Scanner String = new Scanner (System.in);
		   		     	String record = String.nextLine();
		   		     	String[] newEntry = breakdownRecord(record);
		   		     	createEntries(newEntry);
			        		break; 
		        	case 2: 
		        		System.out.println("Function 2"); 
		        		break; 
		        	case 3: 
		        		System.out.println("Function 3"); 
		        		break; 
		        	case 4: 
		   		     	System.out.println("\nPlease choose the number of the method you want to use to search:");
		   		     	System.out.println("1. Search by First name");
		   		    	System.out.println("2. Search by Last name");
		   		    	System.out.println("3. Search by Full name (First middle last)");
		   		    	System.out.println("4. Search by Phone number");
		   		    	System.out.println("5. Search by City");
		   		    	System.out.println("6. Search by State");
		   				int function2 = 0;
		   				Scanner input4 = new Scanner (System.in);
		   		    	function2 = input4.nextInt();
		   		    	if (function2 == 1){
			   		     	System.out.println("\nPlease enter the person's first name:");
			   		     	Scanner fNameIn = new Scanner (System.in);
			   		     	String fname = fNameIn.nextLine();
			   		     	firstNameList(fname);
		   		    	}else if (function2 == 2){
			   		     	System.out.println("\nPlease enter the person's last name:");
			   		     	Scanner lNameIn = new Scanner (System.in);
			   		     	String lname = lNameIn.nextLine();
			   		     	lastNameList(lname);
		   		    	}else if (function2 == 3){
			   		     	System.out.println("\nPlease enter the person's full name (eg: first middle last):");
			   		     	Scanner flNameIn = new Scanner (System.in);
			   		     	String fullname = flNameIn.nextLine();
			   		     	fullNameList(fullname);
		   		    	}else if (function2 == 4){
			   		     	System.out.println("\nPlease enter the person's phone number (eg: (123)-456-7890) name:");
			   		     	Scanner phoneIn = new Scanner (System.in);
			   		     	String phone = phoneIn.nextLine();
			   		     	phoneList(phone);
		   		    	}else if (function2 == 5){
			   		     	System.out.println("\nPlease enter the person's City:");
			   		     	Scanner cityIn = new Scanner (System.in);
			   		     	String city = cityIn.nextLine();
			   		     	cityList(city);
		   		    	}else if (function2 == 6){
			   		     	System.out.println("\nPlease enter the person's State:");
			   		     	Scanner stateIn = new Scanner (System.in);
			   		     	String state = stateIn.nextLine();
			   		     	stateList(state);
		   		    	}else{
		   		    		System.out.println("Invalid function");
		   		    	}
		   		   		break; 
		   		    case 5: 
		   		 	PhoneBook pb1 = new PhoneBook ();
		   			//List<BookEntry> entries = pb1.getEntries();
		   			//List<AddressClass> addresses = pb1.getAddresses();
		   		    	pb1.displayDirectory();
		        		break; 
		        	case 6: 
		        		System.out.println("You chose to exit the program."); 
		        		break; 
		        	default: 
		        		System.out.println("Invalid function, please try again."); 
		        		break; 
		        }  // End switch
		     
		
		}  //  End while loop
		 
		System.out.println("Exit program"); 
	  //	 input.close();

		}                              

	public static String[] breakdownRecord(String record){
		
		String[] myArray = new String[9];
		String fullName = "";
		String street = "";
		String city = "";
		String state = "";
		String zip = "";
		String phone = "";

		String[] ss=record.split(", ");
		for(int i=0;i<6;i++)
		{
		switch (i) {
		case 0:
			fullName = ss[0]; 
		    System.out.println("Full name = "+fullName);
		    // parse FullName
			String[] ns=fullName.split(" ");
			
			String firstName = ns[0];
			String middleName = ns[1];
			String lastName = ns[ns.length-1];
				
			for(int j=2;j<ns.length-1;j++) {
				middleName = middleName + " " + ns[j];
				}
			if (middleName.equals (lastName)) {
					middleName = "";
				
			}
			myArray[0] = fullName;
			myArray[1] = firstName;
			myArray[2] = middleName;
			myArray[3] = lastName;

		    System.out.println("First name = "+firstName);
		    System.out.println("Middle name = "+middleName);
		    System.out.println("Last name = "+lastName);
			break;
		case 1:
			street = ss[1]; 
			myArray[4] = street;
		    System.out.println("Street = "+street);
			break;
		case 2:
			city = ss[2]; 
			myArray[5] = city;
		    System.out.println("City = "+city);
			break;
		case 3:
			state = ss[3]; 
			myArray[6] = state;
		    System.out.println("State = "+state);
			break;
		case 4:
			zip = ss[4]; 
			myArray[7] = zip;
		    System.out.println("Zip code = "+zip);
			break;
		case 5:
			String phn = ss[5]; 
			phone = ("("+phn.substring(0,3)+")-"+phn.substring(3,6)+"-"+phn.substring(6,10));
			myArray[8] = phone;
		    System.out.println("Phone = "+phone);
			break;
		default:
		    System.out.println("Error - "+ss[i]);
			break;

		}
		}	
			return myArray;

		}  // End Method


	public static void createEntries(String[] myArray){
		
		String[] myString = myArray;
		BookEntry be1 = new BookEntry ();
		AddressClass a1 = new AddressClass ();
		PhoneBook pb1 = new PhoneBook ();
		List<BookEntry> entries = pb1.getEntries();
		List<AddressClass> addresses = pb1.getAddresses();
	
		be1.setFullName(myString[0]);
		be1.setFirstName(myString[1]);
		be1.setMiddleName(myString[2]);
		be1.setLastName(myString[3]);
		be1.setPhone(myString[8]);
		entries.add(be1);
		
		a1.setStreet(myString[4]);
		a1.setCity(myString[5]);
		a1.setState(myString[6]);
		a1.setZipCode(myString[7]);
		be1.setPhone(myString[8]);
		addresses.add(a1);

	}
	public static void firstNameList(String fName){
		BookEntry be1 = new BookEntry ();
		AddressClass a1 = new AddressClass ();
		PhoneBook pb1 = new PhoneBook ();
		List<BookEntry> entries = pb1.getEntries();
		List<AddressClass> addresses = pb1.getAddresses();
		int foundRec = 0;

	     	for (int i=1;i<entries.size();i++){
	    		int fn1 = be1.fNameCompareTo(fName);
	    		if (fn1 == 0){
	    			foundRec = 1;
	     			String phIn = be1.getPhone();
	     			int addr1 = a1.compareTo(phIn);
	     			for (int j=0;j<addresses.size();j++){
	     				if (addr1 == 0) {
	     					// print record
	     					System.out.println(be1.getFirstName()+" "+be1.getMiddleName()+" "+
	     					be1.getLastName()+", "+a1.getStreet()+", "+a1.getCity()+", "+
	     					a1.getState()+", "+a1.getZipCode()+", "+a1.getPhone());
	     				}
	     			}
	     		}
	     	}
	     	if (foundRec == 0) {
	     		System.out.println("No records found for name entered.");
	     	}
	     	}
	    	public static void lastNameList(String lName){
	    		BookEntry be1 = new BookEntry ();
	    		AddressClass a1 = new AddressClass ();
	    		PhoneBook pb1 = new PhoneBook ();
	    		List<BookEntry> entries = pb1.getEntries();
	    		List<AddressClass> addresses = pb1.getAddresses();
	    		int foundRec = 0;

	    	     	for (int i=1;i<entries.size();i++){
	    	    		int ln1 = be1.lNameCompareTo(lName);
    	     		if (ln1 == 0){
    	     			foundRec = 1;
 	    	     			String phIn = be1.getPhone();
	    	     			int addr1 = a1.compareTo(phIn);
	    	     			for (int j=0;j<addresses.size();j++){
	    	     				if (addr1 == 0) {
	    	     					// print record
	    	     					System.out.println(be1.getFirstName()+" "+be1.getMiddleName()+" "+
	    	     					be1.getLastName()+", "+a1.getStreet()+", "+a1.getCity()+", "+
	    	     					a1.getState()+", "+a1.getZipCode()+", "+a1.getPhone());
	    	     				}
	    	     			}
	    	     			
	    	     		}
	    	     	}
	    	     	if (foundRec == 0) {
	    	     		System.out.println("No records found for name entered.");
	    	     	}

}
	    	public static void fullNameList(String flName){
	    		BookEntry be1 = new BookEntry ();
	    		AddressClass a1 = new AddressClass ();
	    		PhoneBook pb1 = new PhoneBook ();
	    		List<BookEntry> entries = pb1.getEntries();
	    		List<AddressClass> addresses = pb1.getAddresses();
	    		int foundRec = 0;

	    	     	for (int i=1;i<entries.size();i++){
	    	    		int fln1 = be1.flNameCompareTo(flName);
	    	     		if (fln1 == 0){
	    	     			foundRec = 1;
	    	    			String phIn = be1.getPhone();
	    	     			int addr1 = a1.compareTo(phIn);
	    	     			for (int j=0;j<addresses.size();j++){
	    	     				if (addr1 == 0) {
	    	     					// print record
	    	     					System.out.println(be1.getFullName()+", "+a1.getStreet()+", "
	    	     					+a1.getCity()+", "+a1.getState()+", "+a1.getZipCode()+", "
	    	     					+a1.getPhone());
	    	     				}
	    	     			}
	    	     			
	    	     		}
	    	     	}
	    	     	if (foundRec == 0) {
	    	     		System.out.println("No records found for name entered.");
	    	     	}
}
	    	public static void phoneList(String phone){
	    		BookEntry be1 = new BookEntry ();
	    		AddressClass a1 = new AddressClass ();
	    		PhoneBook pb1 = new PhoneBook ();
	    		List<BookEntry> entries = pb1.getEntries();
	    		List<AddressClass> addresses = pb1.getAddresses();
	    		int foundRec = 0;
	    		
	    	     	for (int i=1;i<entries.size();i++){
	    	    		int ph1 = be1.phoneCompareTo(phone);
	    	     		if (ph1 == 0){
	    	     			foundRec = 1;
	    	    			String phIn = be1.getPhone();
	    	     			int addr1 = a1.compareTo(phIn);
	    	     			for (int j=0;j<addresses.size();j++){
	    	     				if (addr1 == 0) {
	    	     					// print record
	    	     					System.out.println(be1.getFullName()+", "+a1.getStreet()+", "
	    	     					+a1.getCity()+", "+a1.getState()+", "+a1.getZipCode()+", "
	    	     					+a1.getPhone());
	    	     				}
	    	     			}
	    	     			
	    	     		}
	    	     	}
	    	     	if (foundRec == 0) {
	    	     		System.out.println("No records found for phone number entered.");
	    	     	}
}
	    	public static void cityList(String city){
	    		BookEntry be1 = new BookEntry ();
	    		AddressClass a1 = new AddressClass ();
	    		PhoneBook pb1 = new PhoneBook ();
	    		List<BookEntry> entries = pb1.getEntries();
	    		List<AddressClass> addresses = pb1.getAddresses();
	    		int foundRec = 0;

	    	     	for (int i=1;i<addresses.size();i++){
	    	    		int city1 = a1.cityCompareTo(city);
	    	     		if (city1 == 0){
	    	     			foundRec = 1;
	    	    			String phIn = a1.getPhone();
	    	     			int entry1 = a1.compareTo(phIn);
	    	     			for (int j=0;j<entries.size();j++){
	    	     				if (entry1 == 0) {
	    	     					// print record
	    	     					System.out.println(be1.getFullName()+", "+a1.getStreet()+", "
	    	     					+a1.getCity()+", "+a1.getState()+", "+a1.getZipCode()+", "
	    	     					+a1.getPhone());
	    	     				}
	    	     			}
	    	     			
	    	     		}
	    	     	}
	    	     	if (foundRec == 0) {
	    	     		System.out.println("No records found for city entered.");
	    	     	}
}
	    	public static void stateList(String state){
	    		BookEntry be1 = new BookEntry ();
	    		AddressClass a1 = new AddressClass ();
	    		PhoneBook pb1 = new PhoneBook ();
	    		List<BookEntry> entries = pb1.getEntries();
	    		List<AddressClass> addresses = pb1.getAddresses();
	    		int foundRec = 0;

	    	     	for (int i=1;i<addresses.size();i++){
	    	    		int state1 = a1.stateCompareTo(state);
	    	     		if (state1 == 0){
	    	     			foundRec = 1;
	    	    			String phIn = a1.getPhone();
	    	     			int entry1 = a1.compareTo(phIn);
	    	     			for (int j=0;j<entries.size();j++){
	    	     				if (entry1 == 0) {
	    	     					// print record
	    	     					System.out.println(be1.getFullName()+", "+a1.getStreet()+", "
	    	     					+a1.getCity()+", "+a1.getState()+", "+a1.getZipCode()+", "
	    	     					+a1.getPhone());
	    	     				}
	    	     			}
	    	     			
	    	     		}
	    	     	}
	    	     	if (foundRec == 0) {
	    	     		System.out.println("No records found for state entered.");
	    	     	}
}
	
}
