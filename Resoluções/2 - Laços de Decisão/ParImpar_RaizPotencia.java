package resolucoes;

import java.util.Scanner;

public class ParImpar_RaizPotencia {

	public static void main(String[] args) {
		
		double number;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		number = input.nextDouble();
		if(number % 2 == 0) {
			double raiz = Math.sqrt(number);
			System.out.println("\n\nO número é par e sua raiz quadrada é " + raiz);
		}
		else {
			double potencia = Math.pow(number, 2);
			System.out.println("\n\nO número é ímpar e sua potência ao quadrado é " + potencia);
		}

	}

}
