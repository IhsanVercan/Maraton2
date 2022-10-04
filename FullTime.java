package Marathon2;

import java.time.LocalDate;

public class FullTime extends Person implements Accounting {
	
	int salary;
	@Override
	public String toString() {
		return super.toString() + String.format("Salary: %d\nInsuranceBonus: %s", salary, insuranceBonus());
	}
	public FullTime(String name, String surname, Long iD, LocalDate birthDay, LocalDate startDate, LocalDate endDate, String gender,
			WorkType job) {
		super(name, surname, iD, birthDay, startDate, endDate, gender, job);
	}

	
	public String insuranceBonus() {
		
		
		
		return "Total Salary: " + salary*1.25;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	

}
