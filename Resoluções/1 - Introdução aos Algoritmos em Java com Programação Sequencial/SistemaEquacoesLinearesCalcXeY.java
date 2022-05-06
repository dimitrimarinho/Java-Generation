package resolucoes;

import java.util.Scanner;

public class SistemaEquacoesLinearesCalcXeY {

	public static void main(String[] args) {
		
		double a, b, c, d, var_e, f, ce, bf, ae, bd, af, cd, x, y;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe os coeficientes a, b, c, d, e, f:\n");
		System.out.print("\na: ");
		a = input.nextDouble();
		System.out.print("b: ");
		b = input.nextDouble();
		System.out.print("c: ");
		c = input.nextDouble();
		System.out.print("d: ");
		d = input.nextDouble();
		System.out.print("e: ");
		var_e = input.nextDouble();
		System.out.print("f: ");
		f = input.nextDouble();
		
		ce = c * var_e;
		bf = b * f;
		ae = a * var_e;
		bd = b * d;
		af = a * f;
		cd = c * d;
		x = ((ce - bf) / (ae - bd));
		y = ((af - cd) / (ae - bd));

		if((ae -bd) == 0){
			System.out.print("\nErro ! O denominador da fração não pode ser 0. Este não é um sistema de equações lineares válido.\n");
		}
		else{				
			System.out.print("\nAs variáveis x e y do sistema de equação lineares são: ");
			System.out.print("x = " + x);
			System.out.print("\ty = " + y + "\n");
		}
	
	}

}
