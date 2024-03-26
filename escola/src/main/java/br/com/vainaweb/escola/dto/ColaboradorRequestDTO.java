package br.com.vainaweb.escola.dto;

import br.com.vainaweb.escola.enums.Profession;
import br.com.vainaweb.escola.enums.Department;
import br.com.vainaweb.escola.model.Address;

public record ColaboradorRequestDTO(String name, String cpf, String email, Profession profession, Department department) {
}
