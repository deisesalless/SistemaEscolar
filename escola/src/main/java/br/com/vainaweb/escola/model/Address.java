package br.com.vainaweb.escola.model;

import br.com.vainaweb.escola.enums.BrazilianStates;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Address {
    private String zipcode;
    private String street;
    private String neighborhood;
    private String city;
    private String complement;
    private Integer number;
    private BrazilianStates uf;

}
