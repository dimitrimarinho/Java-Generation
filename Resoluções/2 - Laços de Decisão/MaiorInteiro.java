package resolucoes;
import java.util.Scanner;

public class MaiorInteiro {
	
	/* Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior. */

	public static void main(String[] args) {
		
		int n1, n2, n3, maior = 0;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o primeiro n�mero: ");
		n1 = input.nextInt();
		if(n1 > maior) {
			maior = n1;
		}
		System.out.println("Digite o segundo n�mero: ");
		n2 = input.nextInt();
		if(n2 > maior) {
			maior = n2;
		}
		System.out.println("Digite o terceiro n�mero: ");
		n3 = input.nextInt();
		if(n3 > maior) {
			maior = n3;
		}
		
		System.out.println("\n\nO maior inteiro digitado �: " + maior);

		
		
		

	}

}
