package Resolucoes;

import java.util.Scanner;

public class ateAcharZeroESomeTudo {
	
	/* Crie um programa que leia um número do teclado até que encontre um número igual a zero.
	 * No final, mostre a soma dos números digitados. */

	public static void main(String[] args) {
		
		double num, soma = 0;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		do {
			System.out.println("Digite um número: ");
			num = input.nextDouble();
			soma += num;			
		} while (num != 0);
		
		System.out.println("\n\nA soma de todos os números digitados é " + soma);
		
	}

}
