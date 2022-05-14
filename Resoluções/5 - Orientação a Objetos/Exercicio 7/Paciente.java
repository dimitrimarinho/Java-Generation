package questao7Paciente;

public class Paciente {
	
	private String nome;
	private int idade;
	private String anamneseBreve;
	private String ocorrencia;
	private String prescricao;
	private boolean internadoNoHospital;
	
	public Paciente(String nome, int idade, String anamneseBreve, String ocorrencia) {
		this.nome = nome;
		this.idade = idade;
		this.anamneseBreve = anamneseBreve;
		this.ocorrencia = ocorrencia;
		this.prescricao = "Ainda não avaliado";
		this.internadoNoHospital = false;
	}
	
	public void preescreverMedicamento(String prescricao) {
		setPrescricao(prescricao);
		System.out.printf("\n\nAqui está a sua prescrição: %s", prescricao);
	}
	
	public void internarPaciente() {
		setInternadoNoHospital(true);
		System.out.println("\n\nPaciente apresentou piora no quadro.\nEncaminhando para internação...");
	}
	
	public void receberAlta() {
		setInternadoNoHospital(false);
		System.out.println("\n\nPaciente melhorou muito. Pode receber alta e ir para casa.");
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

	public String getAnamneseBreve() {
		return anamneseBreve;
	}

	public void setAnamneseBreve(String anamneseBreve) {
		this.anamneseBreve = anamneseBreve;
	}

	public String getOcorrencia() {
		return ocorrencia;
	}

	public void setOcorrencia(String ocorrencia) {
		this.ocorrencia = ocorrencia;
	}

	public String getPrescricao() {
		return prescricao;
	}

	public void setPrescricao(String prescricao) {
		this.prescricao = prescricao;
	}

	public boolean isInternadoNoHospital() {
		return internadoNoHospital;
	}

	public void setInternadoNoHospital(boolean internadoNoHospital) {
		this.internadoNoHospital = internadoNoHospital;
	}
	
}
