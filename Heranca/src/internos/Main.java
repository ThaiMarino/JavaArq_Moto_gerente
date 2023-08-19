package internos;

import externos.Cliente;
import externos.Fornecedor;
import syspagamento.SysPag;

public class Main {

	public static void main(String[] args) {
		Gerente g1 =  new Gerente ("Ana", 100);
		
		//g1.setSalario ( -100);
		System.out.println("Gerente- " + g1.getNome() +
				" " + g1.getSalario() + " Total Fun=" + g1.getTotalFun());
		
		Motorista m1 =  new Motorista("Zé", -200);
		System.out.println("Motorista- " + m1.getNome() +
				" " + m1.getSalario() + " Total Fun=" + m1.getTotalFun());
		
		Motorista m2 =  new Motorista("Ian", 300);
		System.out.println("Motorista- " + m2.getNome() +
				" " + m2.getSalario() + " Total Fun=" + m2.getTotalFun());
		//SysPag.imprimirPessoa(g1);
		
		Fornecedor f1 = new Fornecedor();
		//SysPag.imprimirPessoa(f1);
		
		Cliente c1 = new Cliente();
		c1.nome = "Maria";
		
//		SysPag.imprimirPessoa(c1);
//		SysPag.adicionarPedido(c1);
		

	}

	

}
