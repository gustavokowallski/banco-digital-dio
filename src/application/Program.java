package application;

import Exception.DomainException;
import entities.Banco;
import entities.Conta;
import entities.ContaCorrente;
import entities.ContaPoupança;

public class Program {
	public static void main(String[] args) {
		
		try {
			
			Banco banco = new Banco();
			Conta conta = new ContaCorrente("Gustavo", 2020, 4500.0);
			Conta conta2 = new ContaCorrente("Gustavo", 3020, 200.0);
			Conta conta3 = new ContaPoupança("Gustavo", 4020, 400.0);
			
			conta.saque(4000.0);
			System.out.println("Teste Saque");
			System.out.println(conta.getSaldo());
			
			
			System.out.println("Teste Depósito");
			
			conta.deposito(4000.0);
			System.out.println(conta.getSaldo());
			
			
			
			System.out.println();
			
			System.out.println("Teste Transferencia");
			
			conta.Transferencia(3000.0, conta2);
			
			System.out.println("Transferencia concluida");
			
			System.out.println(conta.getSaldo());
			System.out.println(conta2.getSaldo());
			
			
			
			System.out.println();
			banco.addConta(conta);
			banco.addConta(conta2);
			
			banco.exibirContas();
			
			conta3.saque(399.0);
			
		}
		catch (DomainException e) {
			System.out.println(e.getMessage());
		}
		
		
		
		
		
	}
}
