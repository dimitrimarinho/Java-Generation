package resolucoes;
import java.util.Scanner;

public class CategoriaIdade {
	
	/* Faça um programa que receba a idade de uma pessoa e mostre na saída em qual categoria ela se encontra */

	public static void main(String[] args) {
		
		int idade;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("Informe a idade do participante: ");
		idade = input.nextInt();
				
		if(idade >= 10 && idade <= 14) {
			System.out.println("\nO participante encontra-se na categoria Infantil");
		}
		else if(idade >= 15 && idade <= 17) {
			System.out.println("\nO participante encontra-se na categoria Juvenil");
		}			
		else if(idade >= 18 && idade <= 25) {
			System.out.println("\nO participante encontra-se na categoria Adulto");
		}
		else {
			System.out.println("\nNão há categoria para este participante ou você digitou a idade incorretamente");
		}
	}	
}
