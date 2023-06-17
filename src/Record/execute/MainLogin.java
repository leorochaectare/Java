package Record.execute;

import java.math.BigDecimal;
import java.time.LocalDate;

import Record.objetos.LoginDTO;
import Record.objetos.PersonDTO;
import Record.objetos.UserDTO;

public class MainLogin {
	
	public static String teste(LoginDTO loginDTO) {
		return loginDTO.toString();
	}
	
	public static void main(String[] args) {
		PersonDTO person = new PersonDTO(null, "Seu Madruga", "45612377745", new BigDecimal(5000), LocalDate.now());
        UserDTO user = new UserDTO(null, "admin", "123");
        LoginDTO login = new LoginDTO(user, person);
        
        System.out.println(teste(login));
	}

	
}
