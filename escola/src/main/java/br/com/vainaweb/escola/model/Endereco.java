package br.com.vainaweb.escola.model;

import br.com.vainaweb.escola.enums.EstadoBrasileiro;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Endereco {
    private String cep;
    private String lougradouro;
    private String bairro;
    private String cidade;
    private String complemento;
    private Integer numero;
    private EstadoBrasileiro uf;

}
