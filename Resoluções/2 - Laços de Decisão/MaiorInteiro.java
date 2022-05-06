package resolucoes;
import java.util.Scanner;

public class MaiorInteiro {
	
	/* Faça um programa que receba três inteiros e diga qual deles é o maior. */

	public static void main(String[] args) {
		
		int n1, n2, n3, maior = 0;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		n1 = input.nextInt();
		if(n1 > maior) {
			maior = n1;
		}
		System.out.println("Digite o segundo número: ");
		n2 = input.nextInt();
		if(n2 > maior) {
			maior = n2;
		}
		System.out.println("Digite o terceiro número: ");
		n3 = input.nextInt();
		if(n3 > maior) {
			maior = n3;
		}
		
		System.out.println("\n\nO maior inteiro digitado é: " + maior);

		
		
		

	}

}
