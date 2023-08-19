package internos;

public class Engenheiro extends Funcionario {
	
	public Engenheiro(String nome, double salario) {
		super(nome, salario);
		
	}

	int CREA;

	public int getCREA() {
		return CREA;
	}

	public void setCREA(int cREA) {
		CREA = cREA;
	}
	

}
