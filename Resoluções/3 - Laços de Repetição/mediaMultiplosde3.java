package Resolucoes;

import java.util.Scanner;

public class mediaMultiplosde3 {

	/* Escrever um programa que receba vários números inteiros no teclado. 
	 * E no final imprimir a média dos números múltiplos de 3. Para sair digitar 0 (zero). */
	
	public static void main(String[] args) {

		int num, soma = 0, qntdMult = 0;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		do {
			
			System.out.println("Digite um número: ");
			num = input.nextInt();
			if(num % 3 == 0 && num != 0) {
				soma += num;
				qntdMult++;
			}
			
		} while (num != 0);
		
		double mediaMult3 = (double) soma/qntdMult;
		
		System.out.println(soma);
		System.out.println(qntdMult);	
		System.out.println("\n\nA média dos números múltiplos de 3 é " + mediaMult3);
		
	}

}
