package internos;


public class Gerente extends Funcionario implements Monitoramento {
	public Gerente(String nome, double salario) {
		super(nome, salario);
	}

	double bonus;

	
//	public Gerente(double bonus) {
//		
//		this.bonus = bonus;
//		super.setSalario( -200); --> não "fura" o encapsulamento
//	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	@Override
	public int acesso() {
		// TODO Auto-generated method stub
		return 0;
	}

	

	@Override
	public void monitorar() {
		// TODO Auto-generated method stub
		
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
