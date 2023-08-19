package internos;

public class Funcionario {
	private String nome;
	private String fone;
	private double salario;
	static int totalFun=0;
	
	public Funcionario(String nome,  double salario) {
		super();
		setNome(nome);
		setSalario(salario); 
		contarFun();
	}
	
	public static int getTotalFun() {
		return totalFun;
	}
	public static void contarFun() {
		totalFun++;
	}
	
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		if (salario> 0) this.salario = salario;
		else this.salario = 0;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getFone() {
		return fone;
	}
	public void setFone(String fone) {
		this.fone = fone;
	}
	
	
	

}
