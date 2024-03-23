package br.com.vainaweb.escola.enums;

public enum Cargo {
    PROFESSOR("Professor(a)"),
    INSPETOR("Inspetor(a)"),
    COORDENADOR("Coordernador(a) Pedagogico"),
    DIRETOR("Diretor(a)"),
    VICE_DIRETOR("Vice Diretor(a)"),
    SECRATARIA("Secretario(a)"),
    LIMPEZA("Auxiliar de Limpeza"),
    MERENDEIRO("Merendeiro(a)"),
    PORTEIRO("Porteiro(a)");

    private String nome;

    private Cargo(String nome) {
        this.nome = nome;
    }

    public String getNomeMaiusculo() {
        return nome.toUpperCase();
    }
}
