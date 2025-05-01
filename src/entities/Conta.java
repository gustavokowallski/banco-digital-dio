package entities;

import java.util.Objects;

import Exception.DomainException;

public abstract class Conta {
	protected String name;
	protected Integer number;
	protected Double saldo;
	
	
	
	public Conta(String name, Integer number, Double saldo) {
		
		if (number < 0) {
			throw new DomainException("Numero da Conta não pode ser negativo.");
		}
		if (saldo < 0) {
			throw new DomainException("Saldo não pode ser negativo");
		}
		this.name = name;
		this.number = number;
		this.saldo = saldo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
	public void visualizarSaldo() {
	}
	
	abstract public Double saque(Double value);
	
	
	abstract public Double deposito(Double value);
	
	abstract public Double Transferencia(Double valuem, Conta conta);
	
	@Override
	public String toString() {
		return String.format("Conta {nome: '%s', número: %d, saldo: R$ %.2f}", name, number, saldo);

	}
	
	@Override
	public int hashCode() {
		return Objects.hash(number);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		return Objects.equals(number, other.number);
	}
	
	
	
	
}
