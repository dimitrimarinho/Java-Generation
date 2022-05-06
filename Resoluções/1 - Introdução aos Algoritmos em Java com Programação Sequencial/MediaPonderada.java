package resolucoes;

import java.util.Scanner;

public class MediaPonderada {

	public static void main(String[] args) {
		
		double nota1, nota2, nota3, mediaPonderada;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
					
		System.out.print("Informe as três notas do aluno: ");	
		System.out.print("\n\nNota 1: ");
		nota1 = input.nextDouble();
		System.out.print("Nota 2: ");
		nota2 = input.nextDouble();
		System.out.print("Nota 3: ");
		nota3 = input.nextDouble();
		mediaPonderada = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5))/10;
		System.out.print("\nA média ponderada é: " + mediaPonderada);

	}

}
