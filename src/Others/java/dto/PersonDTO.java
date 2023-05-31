package Others.java.dto;

import java.time.LocalDate;


public record PersonDTO (Long id, String name, String document, LocalDate birthDate) {}
