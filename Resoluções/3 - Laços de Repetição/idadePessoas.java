package Resolucoes;

import java.util.Scanner;

public class idadePessoas {
	
	/* Solicitar a idade de várias pessoas e imprimir: 
	 * 		Total de pessoas com menos de 21 anos. 
	 * 		Total de pessoas com mais de 50 anos. 
	 * O programa termina quando idade for =-99.
	 */

	public static void main(String[] args) {
		
		int idade, abaixo21 = 0, acima50 = 0;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.println("\nInforme a idade de uma pessoa: ");
		idade = input.nextInt();
		
		while(idade != -99) {
			while(idade < 0 && idade != -99) {
				System.out.println("\nIdade informada não é válida.\nInforme novamente uma idade maior que 0: ");
				idade = input.nextInt();
			}
			if(idade < 21)
				abaixo21++;
			else if(idade > 50)
				acima50++;
			System.out.println("\nInforme a idade de uma pessoa: ");
			idade = input.nextInt();			
		}
		
		System.out.println("\n\n\nTotal de pessoas abaixo de 21 anos: " + abaixo21);
		System.out.println("Total de pessoas acima de 50 anos: " + acima50);
		
	}

}
