package Resolucoes;

import java.util.Scanner;

public class caracteristicasPsicologicas {
	
	/* Uma empresa desenvolveu uma pesquisa para saber as características psicológicas dos indivíduos de uma região.
	 * Para tanto, a cada uma das pessoas era perguntado: 
	 * 			idade,
	 * 			sexo (1 - feminino / 2 - masculino / 3 - Outros),
	 * 			e as opções (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva).
	 * Pede-se para elaborar um sistema que permita ler os dados de 150 pessoas, calcule e mostre:
	 */

	public static void main(String[] args) {

		int numEntrevistados = 0, idade, sexo, caractPsicologica;
		int quantCalmas = 0, quantFemNervosa = 0, quantMascAgress = 0, quantOutrosCalm = 0, quantNervMais40 = 0, quantCalmMenos18 = 0;
				
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
				
		System.out.println("Insira os dados da pessoa entrevistada: Idade, Sexo e Característica Psicológica."
				+ "\nCaso tenha encerrado a entrada de dados digite uma idade <= 0");
		
		System.out.println("\nIdade: ");
		idade = input.nextInt();
				
		while(numEntrevistados <= 150 && idade > 0) 
		{
			
			System.out.println("\nSexo: ");
			sexo = input.nextInt();
			while(sexo != 1 && sexo != 2 && sexo != 3 && sexo != -1) 
			{
				System.out.println("\nSexo não identificado na base de dados."
						+ "\nDigite 1 para feminino, 2 para masculino ou 3 para outros.");
				sexo = input.nextInt();
			}
			
			System.out.println("\nCaracterística Psicológica: ");
			caractPsicologica = input.nextInt();
			while(caractPsicologica != 1 && caractPsicologica != 2 && caractPsicologica != 3) 
			{
				System.out.println("\nCaracterística Psicológica não identificada na base de dados."
						+ "\nDigite 1 se a pessoa é calma, 2 para nervosa ou 3 para agressiva.");
				caractPsicologica = input.nextInt();
			}
			
			numEntrevistados++;
			if(caractPsicologica == 1)
				quantCalmas++;
			if(sexo == 1 && caractPsicologica == 2)
				quantFemNervosa++;
			if(sexo == 2 && caractPsicologica == 3)
				quantMascAgress++;
			if(sexo == 3 && caractPsicologica == 1)
				quantOutrosCalm++;
			if(idade > 40 && caractPsicologica == 2)
				quantNervMais40++;
			if(idade < 18 && caractPsicologica == 1)
				quantCalmMenos18++;
			
			System.out.println("\nIdade: ");
			idade = input.nextInt();
						
		}
		
		System.out.printf("\n\nForam entrevistadas %d pessoas e foram obtidas as seguintes informações: "
				+ "\n\n%d pessoa(s) entrevistadas era(m) calmas"
				+ "\n%d pessoa(s) entrevistada(s) era(m) mulheres nervosas"
				+ "\n%d pessoa(s) entrevistada(s) era(m) homens agressivos"
				+ "\n%d pessoa(s) entrevistada(s) era(m) outros calmos"
				+ "\n%d pessoa(s) entrevistada(s) era(m) pessoas nervosas com mais de 40 anos"
				+ "\n%d pessoa(s) entrevistada(s) era(m) pessoas calmas com menos de 18 anos",
				numEntrevistados, quantCalmas, quantFemNervosa, quantMascAgress, quantOutrosCalm, quantNervMais40, quantCalmMenos18);
		
	}

}
