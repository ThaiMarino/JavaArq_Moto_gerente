package externos;

import internos.Acessivel;

public class Cliente implements Acessivel{
	public String nome;

	@Override
	public int acesso() {
		System.out.println("Nome : " + this.nome);
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
