package resolucoes;

import java.util.Scanner;

public class calculeExpressaoD {

	public static void main(String[] args) {
		
		int A, B, C;
		double D, somAB, somBC, R, S;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe três números inteiros: ");		
		System.out.print("\n\nA: ");
		A = input.nextInt();
		System.out.print("B: ");
		B = input.nextInt();
		System.out.print("C: ");
		C = input.nextInt();
		somAB = (A + B);
		R = Math.pow(somAB, 2.0);
		somBC = (B + C);
		S = Math.pow(somBC, 2.0);
		D = (R + S) / 2;
		System.out.print("\nO resultado da expressão é: " + D);	
		
	}

}