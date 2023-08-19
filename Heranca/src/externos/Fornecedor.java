package externos;

import internos.Acessivel;

public class Fornecedor implements Acessivel{
	String nome;

	@Override
	public int acesso() {
		System.out.println("Passando Fornecedor");
		return 0;
	}

	@Override
	public void login() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void logout() {
		// TODO Auto-generated method stub
		
	}
	

}
