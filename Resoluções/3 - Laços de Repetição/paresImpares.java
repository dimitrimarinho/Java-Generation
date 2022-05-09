package Resolucoes;

import java.util.Scanner;

public class paresImpares {
	
	// Ler 10 números e imprimir quantos são pares e quantos são ímpares.

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int num, quantPar = 0, quantImpar = 0;
		
		for(int i = 0; i < 10; i++) {
			System.out.println("\nDigite um número: ");
			num = input.nextInt();
			if(num % 2 == 0)
				quantPar++;
			else
				quantImpar++;			
		}
		
		System.out.printf("\n\nForam digitados %d números pares e %d números ímpares", quantPar, quantImpar);

	}

}
