package br.com.vainaweb.escola.service;

import br.com.vainaweb.escola.dto.ColaboradorResponseDTO;
import br.com.vainaweb.escola.model.ColaboradorModel;
import br.com.vainaweb.escola.repository.ColaboradorRepository;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ColaboradorService {

    @Autowired
    private ColaboradorRepository colaboradorRepository;

    public List<ColaboradorModel> listarTodos() {
        return colaboradorRepository.findAll();
    }
}
