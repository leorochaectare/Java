package Record.objetos;

public record LoginDTO(UserDTO user, PersonDTO person) {

	public LoginDTO(UserDTO user, PersonDTO person) {
		this.user = user;
		this.person = person;
	}
}
