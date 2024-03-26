package br.com.vainaweb.escola.controller;

import br.com.vainaweb.escola.dto.ColaboradorRequestDTO;
import br.com.vainaweb.escola.dto.ColaboradorResponseDTO;
import br.com.vainaweb.escola.model.ColaboradorModel;
import br.com.vainaweb.escola.service.ColaboradorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/colaborador-teste")
public class ColaboradorController {
    @Autowired
    private ColaboradorService colaboradorService;

    @GetMapping
    public List<ColaboradorModel> listarTodosColaboradores() {
        return colaboradorService.listarTodos();
    }

    @PostMapping
    public String cadastrarColaborador(@RequestBody ColaboradorRequestDTO dados) {
        colaboradorService.cadastrar(dados);
        return "Ok";
    }

}
