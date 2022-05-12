package resolucoes;

public class Cliente {

	private String nome;
	private int idade;
	private String telefone;
	private String cpf;
	private String endereco;
	private String servicoSolicitado;
		
	public Cliente(String nome, int idade, String telefone,
			String cpf, String endereco, String servicoSolicitado) {
		this.nome = nome;
		this.idade = idade;
		this.telefone = telefone;
		this.cpf = cpf;
		this.endereco = endereco;	
		this.servicoSolicitado = servicoSolicitado;
	}

	public void imprimirInfo() {
		System.out.println("\nO cliente " + nome + ", cujo telefone é "+
	telefone + " e reside na " + endereco +", solicitou o seguinte serviço: " + servicoSolicitado);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getServicoSolicitado() {
		return servicoSolicitado;
	}

	public void setServicoSolicitado(String servicoSolicitado) {
		this.servicoSolicitado = servicoSolicitado;
	}	

}
