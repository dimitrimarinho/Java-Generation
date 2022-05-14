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
			System.out.printf("O avião, modelo %s, da companhia Aérea '%s'"
				+ " com capacidade para %d pessoas está pronto para uso,"
				+ " pois a manutenção está em dia !",
				modelo, companhiaAerea, quantidadeAssentos);
		else
			System.out.printf("O avião, modelo %s, da companhia Aérea '%s'"
					+ " com capacidade para %d pessoas"
					+ " não pode ser utilizado no momento, pois é necessário"
					+ " realizar a manutenção preventiva.",
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
