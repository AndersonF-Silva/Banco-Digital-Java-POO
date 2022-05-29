package com.company;

public class ContaCorrente extends Contas {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void ImprimirExtrato() {
        System.out.println(" === Extrato Conta Corrente === ");
        super.imprimirInfosComuns();
    }
}
