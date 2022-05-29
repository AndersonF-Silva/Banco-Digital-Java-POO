package com.company;

public class ContaPoupanca extends Contas {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }
    @Override
    public void ImprimirExtrato() {
        System.out.println(" === Extrato Conta Poupanca === ");
        imprimirInfosComuns();
    }


}
