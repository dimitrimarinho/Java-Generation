package resolucoes;

import java.util.Scanner;

public class ParImpar_RaizPotencia {

	public static void main(String[] args) {
		
		double number;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		number = input.nextDouble();
		if(number % 2 == 0) {
			double raiz = Math.sqrt(number);
			System.out.println("\n\nO n�mero � par e sua raiz quadrada � " + raiz);
		}
		else {
			double potencia = Math.pow(number, 2);
			System.out.println("\n\nO n�mero � �mpar e sua pot�ncia ao quadrado � " + potencia);
		}

	}

}
