package resolucoes;

import java.util.Scanner;

public class DuracaoEvento {

	public static void main(String[] args) {
		
		int evento_segundos, horas, minutos, segundos, temp;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe a duração do evento em segundos: ");
		evento_segundos = input.nextInt();
		horas = evento_segundos / 3600;
		temp = evento_segundos % 3600;
		minutos = temp / 60;
		temp = temp % 60;
		segundos = temp;
		System.out.print("A duração do evento é de: ");
		System.out.print("\n\t\t" + horas + " hora(s)");		
		System.out.print("\n\t\t" + minutos + " minuto(s)");
		System.out.print("\n\t\t" + segundos + " segundo(s)");

	}

}
