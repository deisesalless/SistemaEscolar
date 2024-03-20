package br.com.vainaweb.escola.controller;

import br.com.vainaweb.escola.dto.ColaboradorResponseDTO;
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
    public List<ColaboradorService> listarTodosColaboradores() {
        return colaboradorService.listarColaboradores();
    }

    @PostMapping
    public String cadastrarColaborador(@RequestBody ColaboradorResponseDTO dados) {
        colaboradorService.cadastrarColaborador(dados);
        return "Ok";
    }
}
