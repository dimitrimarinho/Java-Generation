package resolucoes;

import java.util.Scanner;

public class CustoConsumidorCarro {

	public static void main(String[] args) {
		
		double custoFabrica, custoConsumidor;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe o custo de f�brica do carro\n");
		System.out.print("Custo de f�brica � de: R$");
		custoFabrica = input.nextDouble();		
		// Considerando que os impostos n�o acumulam com o custo final do distribuidor, apenas incidem sobre o custo de f�brica
		custoConsumidor = ((1.28 * custoFabrica) + (1.45 * custoFabrica));		
		System.out.print("\nO custo ao consumidor deste carro novo � de: R$" + custoConsumidor + "\n");

	}

}
