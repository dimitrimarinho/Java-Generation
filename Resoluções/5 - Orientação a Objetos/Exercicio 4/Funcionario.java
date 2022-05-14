package questao4Funcionario;

public class Funcionario {

	private String nome;
	private String cpf;
	private int idade;
	private String cargo;
	private double salario;
	
	public Funcionario(String nome, String cpf, int idade, String cargo, double salario) {
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
		this.cargo = cargo;
		this.salario = salario;
	}
	
	public void mostrarInfo() {
		System.out.printf("\nO funcionário %s tem %d anos"
				+ ", ocupa o cargo de %s e possui um salário de R$ %.2f.",
				nome, idade, cargo, salario);
	}
	
	public void promovido(String cargo, double salario) {
		setCargo(cargo);
		setSalario(salario);
		System.out.printf("\n\nO funcionário %s foi promovido para o cargo de %s"
				+ " e receberá um salário de R$% .2f !!!",
				getNome(), cargo, salario);
	}
	
	public void demitido() {
		setSalario(0);
		System.out.printf("\nO funcionário %s foi desligado do cargo de %s.",
				getNome(), getCargo());		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
		
}
