package Entities;
import java.time.LocalDate;

import Abstract.Entity;

public class Gamer implements Entity {
	
	public Gamer() {
		System.out.println("Oyuncular");
	}
	
	private int id;
	private String firstName;
	private String lastName;
	private LocalDate birthDate;
	private String nationalityId;

	public Gamer(int id, String firstName, String lastName, LocalDate birthDate, String nationalityId) {

		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.nationalityId = nationalityId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public String getNationalityId() {
		return nationalityId;
	}

	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}

}
