package br.com.vainaweb.escola.service;

import br.com.vainaweb.escola.dto.ColaboradorResponseDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Service
public class ColaboradorService {
    private List<ColaboradorService> lista = new ArrayList<>();
    private Long id;
    private String nome;
    private String cpf;
    private String endereco;

    public ColaboradorService(Long id, String nome, String cpf, String endereco) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    public boolean cadastrarColaborador(ColaboradorResponseDTO dados) {
        return lista.add(new ColaboradorService(dados.id(), dados.nome(), dados.cpf(), dados.cpf())) ;
    }

    public List<ColaboradorService> listarColaboradores() {
        return lista;
    }
}
