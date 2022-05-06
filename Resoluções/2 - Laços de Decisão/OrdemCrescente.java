package resolucoes;
import java.util.Arrays;
import java.util.Scanner;

public class OrdemCrescente {
	
	/* Faça um programa que entre com três números e coloque em ordem crescente. */

	public static void main(String[] args) {
		
		double[] vetorOrdenacao = new double[3];
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		
		for(int i = 0; i < 3; i++) {
			System.out.println("Digite o " + (i+1) + "º número: ");
			vetorOrdenacao[i] = input.nextDouble();
		}
		
		Arrays.sort(vetorOrdenacao);
		
		System.out.println("\n\nA ordem crescente é: ");
		for(int i = 0; i < 3; i++) {
			System.out.print(vetorOrdenacao[i] + " ");
		}
			System.out.println();	
			
		/* Somente com laço de decisão é possível fazer da seguinte forma: 
		 
		double n1, n2, n3;
		double[] ordena = new double[3];
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		n1 = input.nextDouble();	
		System.out.println("Digite o segundo número: ");
		n2 = input.nextDouble();	
		System.out.println("Digite o terceiro número: ");
		n3 = input.nextDouble();
		
		ordena[0] = n1;
		ordena[1] = n2;
		ordena[2] = n3;
		
		if(n1 > n2 && n1 > n3){
			ordena[2] = n1;
			ordena[0] = n3;
			if(n3 > n2){
				ordena[0] = n2;
				ordena[1] = n3;
			}
		}
		else if(n2 > n3 && n2 > n1){
			ordena[2] = n2;
			ordena[1] = n3;
			if(n3 < n1){
				ordena[1] = n1;
				ordena[0] = n3;
			}
		}
		else if(n1 > n2){
			ordena[0] = n2;
			ordena[1] = n1;
		}
		
		System.out.println("\n\nA ordem crescente é: ");
		System.out.print(ordena[0] + " " + ordena[1] + " " + ordena[2]);
		System.out.println(); */
	}
}
