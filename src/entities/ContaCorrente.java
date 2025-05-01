package entities;

import Exception.DomainException;

public class ContaCorrente extends Conta {

    public ContaCorrente(String name, Integer number, Double saldo) {
        super(name, number, saldo);
    }

    @Override
    public Double saque(Double value) {
        // Verificando se o saldo é suficiente para o saque
        if (saldo >= value) {
            saldo -= value;
        } else {
            // Lançando uma exceção se o valor do saque for maior que o saldo
            throw new DomainException("Valor de saque maior que o saldo");
        }
        return saldo;
    }

    @Override
    public Double Transferencia(Double value, Conta conta) {
        // Verificando se o saldo é suficiente para a transferência
        if (value <= saldo) {
            saldo -= value;
            Double num = conta.getSaldo();
            num += value;
            conta.setSaldo(num);
        } else {
            // Lançando uma exceção se o valor da transferência for maior que o saldo
            throw new DomainException("Valor de saque maior que o saldo");
        }
        return saldo;
    }

    @Override
    public Double deposito(Double value) {
        // Realizando o depósito
        saldo += value;
        return saldo;
    }
}
