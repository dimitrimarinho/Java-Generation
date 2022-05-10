package resolucoes;

import java.util.Scanner;

public class Questao4 {

	public static void main(String[] args) {
		
		double[][] M1 = new double[2][2];
		double[][] M2 = new double[2][2];
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		System.out.println("Preencha a matriz 1(M1): \n");
		for(int l = 0; l < 2; l++) {
			for(int c = 0; c < 2; c++) {
				System.out.printf("M1[%d][%d]: ", l, c);
				M1[l][c] = input.nextDouble();
			}
		}
		
		System.out.println("\n\nPreencha a matriz 2(M2): \n");
		for(int l = 0; l < 2; l++) {
			for(int c = 0; c < 2; c++) {
				System.out.printf("M2[%d][%d]: ", l, c);
				M2[l][c] = input.nextDouble();
			}
		}
		
		int opcaoEscolhida;
		@SuppressWarnings("resource")
		Scanner escolha = new Scanner(System.in);
		
		System.out.println("\n\n******* \t Menu de Opções \t *******");
		System.out.println("1 - Somar as duas matrizes");
		System.out.println("2 - Subtrair a primeira matriz da segunda");
		System.out.println("3 - Adicionar uma constante às duas matrizes");
		System.out.println("4 - Imprimir as matrizes");
		System.out.println("\nDigite a opção desejada: ");
		opcaoEscolhida = escolha.nextInt();
		
		while(opcaoEscolhida != 1 && opcaoEscolhida != 2 && opcaoEscolhida != 3 && opcaoEscolhida != 4) {
			System.out.println("\nOpção Escolhida não existe.\nDigite um dos números mostrados no Menu de Opções.\n");
			System.out.println("\n\n******* \t Menu de Opções \t *******");
			System.out.println("1 - Somar as duas matrizes");
			System.out.println("2 - Subtrair a primeira matriz da segunda");
			System.out.println("3 - Adicionar uma constante às duas matrizes");
			System.out.println("4 - Imprimir as matrizes");
			System.out.println("\nDigite a opção desejada: ");
			opcaoEscolhida = escolha.nextInt();
		}
		
		switch (opcaoEscolhida) {
			case 1:
				
				double[][] Msoma = new double[2][2];
				System.out.println("\nOpção 1 escolhida.\nImprimindo matriz da soma de M1 + M2: \n");
				for(int l = 0; l < 2; l++) {
					for(int c = 0; c < 2; c++) {
						Msoma[l][c] = M1[l][c] + M2[l][c];
						System.out.print(Msoma[l][c] + "    ");						
					}
					System.out.println();	
				}
				break;
				
			case 2:
				
				double[][] Msub = new double[2][2];
				System.out.println("\nOpção 2 escolhida.\nImprimindo matriz da subtração M1 - M2: \n");
				for(int l = 0; l < 2; l++) {
					for(int c = 0; c < 2; c++) {
						Msub[l][c] = M1[l][c] - M2[l][c];
						System.out.print(Msub[l][c] + "    ");						
					}
					System.out.println();	
				}
				break;
				
			case 3:
				
				final double constante;
				System.out.println("\nOpção 3 escolhida.\nAdicionando uma constante às duas matrizes: \n");
				System.out.println("Informe o valor da constante: ");
				constante = input.nextDouble();
				
				System.out.println("\nImprimindo matriz M1 após adição da constante: \n");				
				for(int l = 0; l < 2; l++) {
					for(int c = 0; c < 2; c++) {
						M1[l][c] = M1[l][c] + constante;
						System.out.print(M1[l][c] + "    ");						
					}
					System.out.println();	
				}
				
				System.out.println("\nImprimindo matriz M2 após adição da constante: \n");
				for(int l = 0; l < 2; l++) {
					for(int c = 0; c < 2; c++) {
						M2[l][c] = M2[l][c] + constante;
						System.out.print(M2[l][c] + "    ");						
					}
					System.out.println();	
				}				
				break;
				
			case 4:
				
				System.out.println("\nOpção 4 escolhida.\nImprimindo as duas matrizes ... \n");
							
				System.out.println("\nImprimindo a matriz M1: \n");				
				for(int l = 0; l < 2; l++) {
					for(int c = 0; c < 2; c++) {			
						System.out.print(M1[l][c] + "    ");						
					}
					System.out.println();	
				}
				
				System.out.println("\nImprimindo a matriz M2: \n");
				for(int l = 0; l < 2; l++) {
					for(int c = 0; c < 2; c++) {					
						System.out.print(M2[l][c] + "    ");						
					}
					System.out.println();	
				}				
				break;
		}
		
		System.out.println("\n\nPROGRAMA FINALIZADO\n\n");
		
	}
	
}
