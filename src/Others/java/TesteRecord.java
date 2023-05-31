package Others.java;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

import Others.java.dto.Person;
import Others.java.dto.PersonDTO;
import Others.java.dto.PersonSaveDTO;


public class TesteRecord {
	
	static final List<Person> list = new LinkedList<>();
	
	public static List<PersonDTO> findAll() {
		return list.stream().map(p -> new PersonDTO(p.getId(), p.getName(), p.getDocument(), p.getBirthDate())).toList();
	}
	
	public static PersonDTO findById(Long id) {
		return list.stream()
				.filter(p -> p.getId().equals(id))
				.map(p -> new PersonDTO(p.getId(), p.getName(), p.getDocument(), p.getBirthDate()))
				.findFirst().orElse(null);
	}
	
	public static Person save(PersonSaveDTO personSaveDTO) {
		Person person = new Person(personSaveDTO.id(), personSaveDTO.name(), 
				personSaveDTO.document(), personSaveDTO.birthDate(), personSaveDTO.telefone(),
				personSaveDTO.email());
		list.add(person);
		return person;
	}
	
	
	public static void main(String[] args) {
		
		PersonSaveDTO person = new PersonSaveDTO(1L, "Seu Madruga", "123.123.777-56", LocalDate.now(), "35988774455", "contato@hotmail.com");
		save(person);
		
		PersonSaveDTO person2 = new PersonSaveDTO(2L, "Chaves", "123.123.777-10", LocalDate.of(1980,02,01), "35988556633", "contato2@hotmail.com");
		save(person2);
		
//		System.out.println(findAll());
		System.out.println(findById(2L));
	}
}
