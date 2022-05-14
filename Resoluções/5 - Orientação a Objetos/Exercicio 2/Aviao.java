package questao2Aviao;

public class Aviao {

	private int id;
	private String modelo;
	private String companhiaAerea;
	private int quantidadeAssentos;
	private boolean manutencaoEmDia;
	
	public Aviao (int id, String modelo, String companhiaAerea,
			int quantidadeAssentos, boolean manutencaoEmDia) {
		this.id = id;
		this.modelo = modelo;
		this.companhiaAerea = companhiaAerea;
		this.quantidadeAssentos = quantidadeAssentos;
		this.manutencaoEmDia = manutencaoEmDia;		
	}
	
	public void mostrarInfo() {
		if(manutencaoEmDia)
			System.out.printf("O avi�o, modelo %s, da companhia A�rea '%s'"
				+ " com capacidade para %d pessoas est� pronto para uso,"
				+ " pois a manuten��o est� em dia !",
				modelo, companhiaAerea, quantidadeAssentos);
		else
			System.out.printf("O avi�o, modelo %s, da companhia A�rea '%s'"
					+ " com capacidade para %d pessoas"
					+ " n�o pode ser utilizado no momento, pois � necess�rio"
					+ " realizar a manuten��o preventiva.",
					modelo, companhiaAerea, quantidadeAssentos);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCompanhiaAerea() {
		return companhiaAerea;
	}

	public void setCompanhiaAerea(String companhiaAerea) {
		this.companhiaAerea = companhiaAerea;
	}

	public int getQuantidadeAssentos() {
		return quantidadeAssentos;
	}

	public void setQuantidadeAssentos(int quantidadeAssentos) {
		this.quantidadeAssentos = quantidadeAssentos;
	}

	public boolean isManutencaoEmDia() {
		return manutencaoEmDia;
	}

	public void setManutencaoEmDia(boolean manutencaoEmDia) {
		this.manutencaoEmDia = manutencaoEmDia;
	}
		
}
