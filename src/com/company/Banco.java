package com.company;

import java.util.List;

public class Banco {
    private String nome;
    private List <Contas> conta;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Contas> getConta() {
        return conta;
    }

    public void setConta(List<Contas> conta) {
        this.conta = conta;
    }
}
