package internos;


public class Gerente extends Funcionario implements Monitoramento {
	double bonus;

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
