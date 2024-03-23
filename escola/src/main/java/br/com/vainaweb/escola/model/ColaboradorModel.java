package br.com.vainaweb.escola.model;

import br.com.vainaweb.escola.enums.Cargo;
import br.com.vainaweb.escola.enums.Setor;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class ColaboradorModel {

    @Id
    private Long id;
    private String nome;
    private String email;
    private String cpf;
    private Cargo cargo;
    private Setor setor;
    @Embedded
    private Endereco endereco;

}
