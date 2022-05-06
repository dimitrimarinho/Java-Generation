package resolucoes;

import java.util.Scanner;

public class DistanciaEntre2PontosNoPlano {

	public static void main(String[] args) {
		
		double x1, y1, x2, y2, radicando, d;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe as coordenadas dos pontos P1(x1,y1) e P2(x2,y2): ");
		System.out.print("\n\nP1(x1): ");
		x1 = input.nextDouble();
		System.out.print("P1(y1): ");
		y1 = input.nextDouble();
		System.out.print("\nP2(x2): ");
		x2 = input.nextDouble();
		System.out.print("P2(y2): ");
		y2 = input.nextDouble();	
		radicando = (Math.pow((x2-x1), 2.0) + Math.pow((y2-y1), 2.0));
		d = Math.sqrt(radicando);
		System.out.print("\nA distância no plano entre os dois pontos informados é: " + d + "\n");

	}

}
