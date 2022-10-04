package Marathon2;

import java.time.LocalDate;

public class Hourly extends Person implements Accounting2 {
	
	double  salary;
	int hoursWorkedMonthly;
	@Override
	public String toString() {
		return super.toString() + String.format("Salary: %f\nInsuranceBonus: %s", salary, KDV());
	}

	public Hourly(String name, String surname, Long iD, LocalDate birthDay, LocalDate startDate, LocalDate endDate, String gender,
			WorkType job) {
		super(name, surname, iD, birthDay, startDate, endDate, gender, job);
		super.job=WorkType.HOURLY;
		
	}


	public String KDV() {
		
		salary = salary+(hoursWorkedMonthly*1.08);
		// TODO Auto-generated method stub
		return "Totaly Salary: " + salary+(hoursWorkedMonthly*1.08);
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getHoursWorkedMonthly() {
		return hoursWorkedMonthly;
	}

	public void setHoursWorkedMonthly(int hoursWorkedMonthly) {
		this.hoursWorkedMonthly = hoursWorkedMonthly;
	}

	
	}




