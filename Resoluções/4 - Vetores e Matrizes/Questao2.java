package resolucoes;

import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {

		int[] vetorNum = new int[6];
		int somaPar = 0, contImpar = 0;
		@SuppressWarnings("resource")
		Scanner input =  new Scanner(System.in);
		
		for(int i = 0; i < 6; i++) {
			System.out.println("Digite um n�mero inteiro: ");
			vetorNum[i] = input.nextInt();			
		}
 		
		System.out.println("\n\nOs n�meros pares digitados s�o: ");
		for(int i : vetorNum) {
			if (i % 2 == 0) {
				somaPar+=i;
				System.out.println(i);
			}
		}
		System.out.println("A soma dos n�meros pares digitados �: " + somaPar);

		System.out.println("\n\nOs n�meros �mpares digitados s�o: ");
		for(int i : vetorNum) {
			if (i % 2 != 0) {
				System.out.println(i);
				contImpar++;
			}
		}
		if(contImpar == 1)
			System.out.printf("Foi digitado %d n�mero �mpar", contImpar);
		else
			System.out.printf("Foram digitados %d n�meros �mpares", contImpar);
		
	}

}
