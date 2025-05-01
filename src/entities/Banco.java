package entities;

import java.util.ArrayList;
import java.util.List;



public class Banco {
	private List<Conta> listconta = new ArrayList<>();

	public Banco() {
	}
	
	public void addConta(Conta conta) {
		if(!listconta.contains(conta)) {
			listconta.add(conta);
		}
		else {
			System.out.println("A conta " + conta + "já existe");
		}
	}
	
	public void removeConta(Conta conta) {
		if(listconta.contains(conta)) {
			listconta.remove(conta);
		}
		else {
			System.out.println("Essa conta " + conta + "não existe");
		}
	}
	
	public void exibirContas() {
		if(listconta.isEmpty()) {
			System.out.println("Nenhuma conta adicionada ainda");
		}
		else {
			listconta.forEach(conta -> {
                System.out.println(conta);
			});
	}
	

}
}
