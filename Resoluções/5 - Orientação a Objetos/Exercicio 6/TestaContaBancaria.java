package questao6ContaBancaria;

public class TestaContaBancaria {

	public static void main(String[] args) {

		ContaBancaria fernandaBB = new ContaBancaria("Banco do Brasil", "4076-8", "45766-X", "Conta Corrente");
		
		System.out.println(fernandaBB.getBanco() + "\n" + fernandaBB.getAgencia() + "\n" + fernandaBB.getNumeroConta());
		fernandaBB.depositar(2650);
		fernandaBB.sacar(449.40);
		fernandaBB.sacar(3000);
		
	}

}
