package br.com.vainaweb.escola.enums;

public enum Setor {
    GESTAO_ESCOLAR("Gestao Escolar"),
    COORDENACAO_ADMINISTRATIVA("Coordenacao Administrativo Escolar"),
    COORDERNACAO_PEDAGOGICA("Coordenacao Pedagogico Escolar"),
    ASSESSORIA_PEDAGOGICA("Assessoria Pedagogico"),
    SECRETARIA("Secretaria Escolar"),
    ADMINISTRATIVO("Administracao Escolar");

    private String nome;

    private Setor(String nome) {
        this.nome = nome;
    }

    public String getNomeMaiusculo() {
        return nome.toUpperCase();
    }
}
