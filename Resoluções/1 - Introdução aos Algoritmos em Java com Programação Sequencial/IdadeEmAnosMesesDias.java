package resolucoes;

import java.util.Scanner;

public class IdadeEmAnosMesesDias {

	public static void main(String[] args) {
		int anos, meses, dias, idadeEmDias, temp;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe a sua idade expressa em dias");
		System.out.print("\n\nEntre com a sua idade expressa em dias: ");
		idadeEmDias = input.nextInt();
		anos = idadeEmDias / 365;
		temp = idadeEmDias % 365;
		meses = temp / 30;
		temp = temp % 30;
		dias = temp;
		System.out.print("\nSua idade é de: ");
		System.out.print("\n\t\t" + anos + " ano(s)");	
		System.out.print("\n\t\t" + meses + " mes(es)");
		System.out.print("\n\t\t" + dias + " dia(s)");		

	}

}
