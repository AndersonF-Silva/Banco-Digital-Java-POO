package com.company;

public interface IConta {

    void sacar(double valor);

    void depositar(double valor);

    void transferir(Contas contaDestino, double valor);
}
