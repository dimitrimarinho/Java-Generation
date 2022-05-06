package resolucoes;

import java.util.Scanner;

public class IdadeEmDias {

	public static void main(String[] args) {
		
		int anos, meses, dias, idadeEmDias;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe a sua idade em anos, meses e dias");
		System.out.print("\n\nEntre com a sua idade em anos: ");
		anos = input.nextInt();		
		System.out.print("Entre com a sua idade em meses: ");
		meses = input.nextInt();		
		System.out.print("Entre com a sua idade em dias: ");
		dias = input.nextInt();
		idadeEmDias = (anos * 365) + (meses * 30) + dias;
		System.out.print("\nA sua idade expressa em dias é: " + idadeEmDias);	
	}
	
}
