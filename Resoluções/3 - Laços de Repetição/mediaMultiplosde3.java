package Resolucoes;

import java.util.Scanner;

public class mediaMultiplosde3 {

	/* Escrever um programa que receba v�rios n�meros inteiros no teclado. 
	 * E no final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar 0 (zero). */
	
	public static void main(String[] args) {

		int num, soma = 0, qntdMult = 0;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		do {
			
			System.out.println("Digite um n�mero: ");
			num = input.nextInt();
			if(num % 3 == 0 && num != 0) {
				soma += num;
				qntdMult++;
			}
			
		} while (num != 0);
		
		double mediaMult3 = (double) soma/qntdMult;
		
		System.out.println(soma);
		System.out.println(qntdMult);	
		System.out.println("\n\nA m�dia dos n�meros m�ltiplos de 3 � " + mediaMult3);
		
	}

}
