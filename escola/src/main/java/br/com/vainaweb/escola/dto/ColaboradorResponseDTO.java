package br.com.vainaweb.escola.dto;

import br.com.vainaweb.escola.enums.Profession;
import br.com.vainaweb.escola.enums.Department;
import br.com.vainaweb.escola.model.Address;

public record ColaboradorResponseDTO(Long id, String nome, String email, String cpf, Address address,
                                     Profession profession, Department department) {
}
