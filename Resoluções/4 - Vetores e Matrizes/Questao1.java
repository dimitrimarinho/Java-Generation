package resolucoes;

public class Questao1 {

	public static void main(String[] args) {

		int[] A = {1, 0, 5, -2, -5, 7}; // letra (a)
		int soma = A[0] + A[1] + A[5]; // letra (b)
		System.out.println("A soma de A[0], A[1] e A[5] é " + soma + "\n\n"); // letra (b)
		A[3] = 100; // letra (c)
		
		int cont = 0;
		for(int i: A) {
			System.out.println("Posição A[" + cont + "] é: "+ i); // letra (d)
			cont++;
		}
		
	}

}
