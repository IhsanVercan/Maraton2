package Marathon2;

import java.text.Format;
import java.time.LocalDate;

public abstract class Person {
	private String name;
	private String surname;
	private Long ID;
	private LocalDate birthDay;
	private LocalDate startDate;
	private LocalDate endDate;
	private String gender;
	WorkType job;
	public String toString() {
		return String.format("Name: %s \nSurname: %s \nID: %d\nBirthday: %s\nStartDate: %s\nEndDate: %s\nGender: %s\n",name, surname, ID, birthDay, startDate, endDate, gender);
	} 
	
	public Person(String name, String surname, Long iD, LocalDate birthDay, LocalDate startDate, LocalDate endDate, String gender,
			WorkType job) {
		super();
		this.name = name;
		this.surname = surname;
		ID = iD;
		this.birthDay = birthDay;
		this.startDate = startDate;
		this.endDate = endDate;
		this.gender = gender;
		this.job = job;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public Person(LocalDate endDate) {
		super();
		this.endDate = endDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Long getID() {
		return ID;
	}

	public void setID(Long iD) {
		ID = iD;
	}

	public LocalDate getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(LocalDate birthDay) {
		this.birthDay = birthDay;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public WorkType getJob() {
		return job;
	}

	public void setJob(WorkType job) {
		this.job = job;
	}

	
	
}
