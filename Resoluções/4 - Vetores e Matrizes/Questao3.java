package resolucoes;

import java.util.Scanner;

public class Questao3 {

	public static void main(String[] args) {

		double[][] M = new double[3][3];
		int MaiorQue10 = 0;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		for (int line = 0; line < 3; line++) {
			for (int column = 0; column < 3; column++) {
				System.out.printf("Digite um número para inserir na posição M[%d][%d] da matriz: ", line, column);
				M[line][column] = input.nextDouble();
				if(M[line][column] > 10)
					MaiorQue10++;
			}			
		}
		
		if(MaiorQue10 == 1)
			System.out.printf("\n\nA matriz possui %d valor maior que 10", MaiorQue10);
		else
			System.out.printf("\n\nA matriz possui %d valores maiores que 10", MaiorQue10);

		
		/* Caso tivesse que ler novamente a matriz para calcular os números maiores que 10
		MaiorQue10 = 0;
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if(M[i][j] > 10)
					MaiorQue10++;
			}			
		}
		if(MaiorQue10 == 1)
			System.out.printf("\n\nA matriz possui %d valor maior que 10", MaiorQue10);
		else
			System.out.printf("\n\nA matriz possui %d valores maiores que 10", MaiorQue10);

		*/
		
	}

}
