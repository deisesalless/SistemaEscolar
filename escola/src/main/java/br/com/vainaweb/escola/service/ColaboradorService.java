package br.com.vainaweb.escola.service;

import br.com.vainaweb.escola.dto.ColaboradorResponseDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ColaboradorService {
    private List<ColaboradorService> lista = new ArrayList<>();
    private Long id;
    private String nome;
    private String cpf;
    private String endereco;
}
