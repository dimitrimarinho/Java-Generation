package questao3ProdutoEletronico;

public class ProdutoEletronico {
	
	private String nomeEletronico;
	private int anoFabricacao;
	private int garantiaEmMeses;
	private String marca;
	private String sistemaOperacional;
	private boolean ligandoNoTeste;
	
	public ProdutoEletronico(String nomeEletronico, int anoFabricacao, int garantiaEmMeses,
			String marca, String sistemaOperacional, boolean ligandoNoTeste) {
		this.setNomeEletronico(nomeEletronico);
		this.anoFabricacao = anoFabricacao;
		this.garantiaEmMeses = garantiaEmMeses;
		this.marca = marca;
		this.sistemaOperacional = sistemaOperacional;
		this.ligandoNoTeste = ligandoNoTeste;
	}
	
	public void mostrarInfo() {
		
		if(ligandoNoTeste)
			System.out.printf("O produto eletrônico %s da marca '%s'"
				+ " possui %d meses de garantia. Foi fabricado em %d"
				+ " e, conforme verificado, foi ligado sem problemas no teste da loja.",
				nomeEletronico, marca, garantiaEmMeses, anoFabricacao);
		else
			System.out.printf("O produto eletrônico %s da marca '%s'"
					+ " possui %d meses de garantia. Fabricado em %d,"
					+ " será trocado pela loja, pois o mesmo não está"
					+ " ligando no momento da venda.",
					nomeEletronico, marca, garantiaEmMeses, anoFabricacao);
		
	}

	public String getNomeEletronico() {
		return nomeEletronico;
	}

	public void setNomeEletronico(String nomeEletronico) {
		this.nomeEletronico = nomeEletronico;
	}

	public int getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	public int getGarantiaEmMeses() {
		return garantiaEmMeses;
	}

	public void setGarantiaEmMeses(int garantiaEmMeses) {
		this.garantiaEmMeses = garantiaEmMeses;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getSistemaOperacional() {
		return sistemaOperacional;
	}

	public void setSistemaOperacional(String sistemaOperacional) {
		this.sistemaOperacional = sistemaOperacional;
	}

	public boolean isLigandoNoTeste() {
		return ligandoNoTeste;
	}

	public void setLigandoNoTeste(boolean ligandoNoTeste) {
		this.ligandoNoTeste = ligandoNoTeste;
	}
		
}
