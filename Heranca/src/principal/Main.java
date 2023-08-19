package principal;

import externos.Cliente;
import externos.Fornecedor;
import internos.Funcionario;
import internos.Gerente;
import syspagamento.SysPag;

public class Main {

	public static void main(String[] args) {
		Gerente g1 = new Gerente ();
		
		SysPag.imprimirPessoa(g1);
		
		Fornecedor f1 = new Fornecedor();
		SysPag.imprimirPessoa(f1);
		
		Cliente c1 = new Cliente();
		c1.nome = "Maria";
		
		SysPag.imprimirPessoa(c1);
		SysPag.adicionarPedido(c1);
		

	}

	

}
