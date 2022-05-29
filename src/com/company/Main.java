package com.company;

public class Main {

    public static void main(String[] args) {
        Cliente anderson = new Cliente();
        anderson.setNome("Anderson");

        Contas cc = new ContaCorrente(anderson);
        Contas poupanca = new ContaPoupanca(anderson);

        cc.depositar(100);
        cc.transferir(poupanca,100);

        cc.ImprimirExtrato();
        poupanca.ImprimirExtrato();
    }
}
