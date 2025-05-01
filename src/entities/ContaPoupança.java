package entities;

import Exception.DomainException;

public class ContaPoupança extends Conta{
	
	

	public ContaPoupança(String name, Integer number, Double saldo) {
		super(name, number, saldo);
	}

	@Override
	public Double saque(Double value) {
		
			if (saldo >= value * 1.02) {
				saldo -= value ;
				
			}
			else {
				throw new DomainException("Valor de saque maior que o saldo");

			}
			return saldo;
	}
			
		
		
	

	@Override
	public Double deposito(Double value) {
		if(value <=0) {
			throw new DomainException("Valor de deposito maior que o saldo");
		}
		saldo += value;
		return saldo;
	}

	@Override
	public Double Transferencia(Double value, Conta conta) {
		if (value <= saldo) {
			saldo -= value ;
			Double num = conta.getSaldo();
			num += value;
			conta.setSaldo(num);
			
			
			
		}
		else {
			throw new DomainException("Valor de saque maior que o saldo");

		}
		return saldo;
	}
	}
	
	

