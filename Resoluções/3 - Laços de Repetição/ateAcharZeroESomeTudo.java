package Resolucoes;

import java.util.Scanner;

public class ateAcharZeroESomeTudo {
	
	/* Crie um programa que leia um n�mero do teclado at� que encontre um n�mero igual a zero.
	 * No final, mostre a soma dos n�meros digitados. */

	public static void main(String[] args) {
		
		double num, soma = 0;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		do {
			System.out.println("Digite um n�mero: ");
			num = input.nextDouble();
			soma += num;			
		} while (num != 0);
		
		System.out.println("\n\nA soma de todos os n�meros digitados � " + soma);
		
	}

}
