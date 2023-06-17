package Record.objetos;

import java.math.BigDecimal;
import java.time.LocalDate;


public record PersonDTO(Long idperson, String name, String document, BigDecimal income, LocalDate birthDate) {

	

}
