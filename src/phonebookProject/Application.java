/**
 * 
 */
package phonebookProject;

import java.util.List;
import java.util.Scanner;

/**
 * @author Brian Groom 05/05/17
 *
 */
public class Application {

	/**
	 * This program will simulate the actions of a phonebook. The program is
	 * able to : •Add new entries •Search for an existing entry •Search by first
	 * name •Search by last name •Search by full name *note name is not unique
	 * therefore the result should be an array of Person Objects. •Search by
	 * telephone number •Search by city or state •Delete a record for a given
	 * telephone number •Update a record for a given telephone number •Show all
	 * records in asc order •An option to exit the program The program will
	 * operate on the console. It will display all the choices when the program
	 * loads. 1. Add new record 2. Delete a record 3. Update a record 4. Search
	 * for a record a. Search by First name b. Search by Last name c. Search by
	 * Full name (First middle last) d. Search by Phone number e. Search by City
	 * f. Search by State 5. Display all records in Directory 6. Exit Program
	 * will run until the user selects the exit option.
	 * 
	 * Program must have a minimum of 2 classes a Person class, an Address
	 * class.
	 * 
	 * Sample data: John Doe, 114 Market St, St Louis, MO, 63403, 6366435698
	 * John E Doe, 324 Main St, St Charles, MO, 63303, 8475390126 
	 * John Michael West Doe, 574 Pole ave, St. Peters, MO, 63333, 5628592375
	 * Mary Jane Smith, 22 North 38th Street, Belleville, IL, 62223, 6182335698
	 * 
	 * Searching for John should return a list of all 3 records above,
	 * displaying the telephone number in this order (636)-453-8563.
	 * 
	 * Optional - add additional features to your program, for storing cell,
	 * home, work and fax numbers. Also features for storing events like
	 * birthday, anniversary, email… etc
	 */
	public static void main(String[] args) {

		BookEntry be1 = new BookEntry(); 
		be1.Address = new Address(); 
		
		displayMenu();

	}

	public static void displayMenu() {
		
 		PhoneBook pb1 = new PhoneBook();
		
		int function = 0;

		while (function != 6) {
			System.out.println("\nYou are running the phone book application.");
			System.out.println("Available Functions:");
			System.out.println("1. Add new record");
			System.out.println("2. Remove a record");
			System.out.println("3. Update a record");
			System.out.println("4. Search for a record");
			System.out.println("5. Display all records in directory");
			System.out.println("6. Exit");
			System.out.println("Please select the number of the function you would like to perform.");
			Scanner input = new Scanner(System.in);
			function = input.nextInt();

			switch (function) {
			case 1:
				System.out.println("\nYou selected to add a record.");
				pb1.addEntry();
			break;
			case 2:
				System.out.println("\nYou selected to remove a record.");
				System.out.println("\nPlease enter the phone number (eg: (123)-456-7890) of the record to remove:");
				Scanner phoneDelete = new Scanner(System.in);
				String phone = phoneDelete.nextLine();
				//pb1.phoneList(phone);
				pb1.removeEntry(phone);
				break;
			case 3:
				System.out.println("Function 3");
				pb1.updateEntry();
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
				Scanner input4 = new Scanner(System.in);
				function2 = input4.nextInt();
				if (function2 == 1) {
					System.out.println("\nPlease enter the person's first name:");
					Scanner fNameIn = new Scanner(System.in);
					String fname = fNameIn.nextLine();
					pb1.firstNameList(fname);
				} else if (function2 == 2) {
					System.out.println("\nPlease enter the person's last name:");
					Scanner lNameIn = new Scanner(System.in);
					String lname = lNameIn.nextLine();
					pb1.lastNameList(lname);
				} else if (function2 == 3) {
					System.out.println("\nPlease enter the person's full name (eg: first middle last):");
					Scanner flNameIn = new Scanner(System.in);
					String fullname = flNameIn.nextLine();
					pb1.fullNameList(fullname);
				} else if (function2 == 4) {
					System.out.println("\nPlease enter the person's phone number (eg: (123)-456-7890):");
					Scanner phoneIn = new Scanner(System.in);
					phone = phoneIn.nextLine();
					pb1.phoneList(phone);
				} else if (function2 == 5) {
					System.out.println("\nPlease enter the person's City:");
					Scanner cityIn = new Scanner(System.in);
					String city = cityIn.nextLine();
					pb1.cityList(city);
				} else if (function2 == 6) {
					System.out.println("\nPlease enter the person's State:");
					Scanner stateIn = new Scanner(System.in);
					String state = stateIn.nextLine();
					pb1.stateList(state);
				} else {
					System.out.println("Invalid function");
				}
				break;
			case 5:
				pb1.displayDirectory();
				break;
			case 6:
				System.out.println("You chose to exit the program.");
				break;
			default:
				System.out.println("Invalid function, please try again.");
				break;
			} // End switch

		} // End while loop

		System.out.println("Exit program");
		// input.close();
	}


}
