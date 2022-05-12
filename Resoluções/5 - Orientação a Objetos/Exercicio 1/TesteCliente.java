package resolucoes;

public class TesteCliente {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente("David Lucas", 18,
			"(17) 9 9116 2657", "832.218.830-72",
			"Praça Joaquim Carlos Garcia, 384",
			"Conserto de Cooler do Notebook");
		
		cliente1.imprimirInfo();
		System.out.println("\n*************Alteração de Endereço*************");
		cliente1.setEndereco("Rua Quatro, 245");
		cliente1.imprimirInfo();
		
	}

}
