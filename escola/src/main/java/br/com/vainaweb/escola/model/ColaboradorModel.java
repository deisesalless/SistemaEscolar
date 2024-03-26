package br.com.vainaweb.escola.model;

import br.com.vainaweb.escola.enums.Profession;
import br.com.vainaweb.escola.enums.Department;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.br.CPF;

@Entity
@Table(name = "tb_employee")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ColaboradorModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(unique = true, name = "email")
    @Email
    private String email;

    @Column(unique = true)
    @CPF
    private String cpf;

    @Embedded
    private Address address;

    private Profession profession;

    private Department department;

    public ColaboradorModel(String name, String cpf, String email, Profession profession, Department department) {
        this.name = name;
        this.cpf = cpf;
        this.email = email;
        this.profession = profession;
        this.department = department;
    }
}
