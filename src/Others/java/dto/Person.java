package Others.java.dto;

import java.time.LocalDate;

public class Person {
	private Long id;
	private String name;
	private String document;
	private LocalDate birthDate;
	private String telefone;
	private String email;
	
//	public Person(PersonDTO person) {
//		this.id = person.id();
//		this.name = person.name();
//		this.document = person.document();
//		this.birthDate = person.birthDate();
//	}
	
	public Person(Long id, String name, String document, LocalDate birthDate, String telefone, String email) {
		this.id = id;
		this.name = name;
		this.document = document;
		this.birthDate = birthDate;
		this.telefone = telefone;
		this.email = email;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDocument() {
		return document;
	}
	public void setDocument(String document) {
		this.document = document;
	}
	public LocalDate getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
