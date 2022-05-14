package questao6ContaBancaria;

public class ContaBancaria {
	
	private String banco;
	private String agencia;
	private String numeroConta;
	private String tipo;
	private double saldo;
	
	public ContaBancaria(String banco, String agencia, String numeroConta, String tipo) {
		this.banco = banco;
		this.agencia = agencia;
		this.numeroConta = numeroConta;
		this.tipo = tipo;
		this.saldo = 0;
	}
	
	public void depositar(double quantia) {
		this.saldo += quantia;
		System.out.printf("\n\nO saldo atual da sua conta bancária é de R$ %.2f", saldo);		
	}
	
	public void sacar(double quantia) {
		if(saldo - quantia >= 0) {
			this.saldo -= quantia;
			System.out.printf("\n\nVocê sacou R$ %.2f.\n"
					+ "O saldo atual da sua conta bancária é de R$ %.2f", quantia, saldo);
		}
		else
			System.out.println("\n\nSaldo insuficiente. Não é possível sacar a quantia pretendida.");			
	}
	
	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	
}
