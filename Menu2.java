package Marathon2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu2 {
	public static Scanner scanner = new Scanner(System.in);
	public static List<Person> People = new ArrayList<Person>();
	
	public static void main(String[] args) {
		defaultPerson();
	    System.out.println("PAYROLL SYSTEM MENU");
	    menu();
}
	public static void defaultPerson () {
	   
		LocalDate birthDay = LocalDate.of(1990, 04, 10);
		
		Hourly hourly1 = new Hourly("Okan","Demirbilek", 5l, LocalDate.of(1998,1,2), LocalDate.of(2022,02,05), null, "Male", WorkType.HOURLY);
		hourly1.setSalary(20);
		Hourly hourly2 = new Hourly("Ugur","Tas", 6l, LocalDate.of(1999,4,2), LocalDate.of(2022,01,03), LocalDate.of(2022, 05, 05), "Male", WorkType.HOURLY);
		hourly2.setSalary(22);
		Hourly hourly3 = new Hourly("Beren","Beliz", 7l, LocalDate.of(1997,1,6), LocalDate.of(2022,03,9), null, "Female", WorkType.HOURLY);
		hourly3.setSalary(23);
		People.add(hourly1);
		People.add(hourly2);
		People.add(hourly3);
		
		
		FullTime fulltime1 = new FullTime("Ihsan","Vercan", 1l, LocalDate.of(1997,4,6), LocalDate.of(2022,03,03), LocalDate.of(2022, 05, 05), "Male", WorkType.FULLTIME);
		fulltime1.setSalary(10000);
		FullTime fulltime2 = new FullTime("LeventCan", "Biber", 2l, LocalDate.of(1999, 10, 5), LocalDate.of(2005,10, 20), null, "Male", WorkType.FULLTIME);
		fulltime2.setSalary(11000);	
		FullTime fulltime3 = new FullTime("Cara", "Lewis", 3l, LocalDate.of(1997, 1, 5), LocalDate.of(2022,10, 20), null, "Female", WorkType.FULLTIME);
		fulltime3.setSalary(21000);
		FullTime fulltime4 = new FullTime("Arda", "Erdem", 4l, LocalDate.of(1991, 10, 12), LocalDate.of(2014,10, 2), null, "Male", WorkType.FULLTIME);
		fulltime4.setSalary(30000);
		People.add(fulltime1);
		People.add(fulltime2);
		People.add(fulltime3);
		People.add(fulltime4);
		
		
	}
	

public static void menu() {
		
		boolean isContinue;
		do {
			System.out.println("(1) Add new worker\n(2) Detail of Workers\n(3) Exit from payroll system");
			int userChoice = scanner.nextInt();
			scanner.nextLine();
			switch (userChoice) {
			case 1:
			
				int count = 1;
				for (Person person : People) {
					System.out.println(count +". Person is added to the list.");
					count++;
				}
		           break;
			case 2:     
			{for (Person person : People) {
				System.out.println("------------------------------------------------------------------------------------------");
				System.out.println(person.toString());
			}
			}
			
		           
			case 3:
			System.exit(0);
			
			default:
				System.out.println("Coming soon...");
	
}
			System.out.println("Do you want to continue (y,n)");
			String want2Continue = scanner.nextLine();
			if(want2Continue.equalsIgnoreCase("y")) {
				isContinue = true;
			}
			else if (want2Continue.equalsIgnoreCase("n")) {
				isContinue = false;
			}
			else {
				System.out.println("Please enter y or n");
				isContinue = true;
			}
		} while (isContinue == true);
				
}
public static void showMenu() {
	
	System.out.println("---PAYROLL SYSTEM MENU---");
	System.out.println();
	System.out.println("(1) Add New Worker\n"
			+ "(2) Details of Workers\n"
			+ "(0) Exit");
	scanner.nextInt();
	
}
public static void personWageList (List<Person> list) {
	for (Person temp : list) {
		if (temp.getEndDate() == null)
		System.out.println(temp);
	}

}



}
