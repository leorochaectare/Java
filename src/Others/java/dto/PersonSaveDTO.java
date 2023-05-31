package Others.java.dto;

import java.time.LocalDate;

public record PersonSaveDTO(Long id, String name, String document, LocalDate birthDate,
		String telefone, String email) {}
