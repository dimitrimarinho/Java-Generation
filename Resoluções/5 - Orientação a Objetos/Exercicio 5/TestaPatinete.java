package questao5Patinete;

public class TestaPatinete {

	public static void main(String[] args) {

		Patinete maxSteel = new Patinete("Max Steel Patinete Estrela", "Verde");
		
		System.out.println("Velocidade do Patinete: " + maxSteel.getVelocidade());
		maxSteel.aumentarVelocidade();
		maxSteel.aumentarVelocidade();
		maxSteel.aumentarVelocidade();
		maxSteel.aumentarVelocidade();
		maxSteel.aumentarVelocidade();		
		System.out.println("Velocidade do Patinete: " + maxSteel.getVelocidade());
		maxSteel.freiarLevemente();
		System.out.println("Velocidade do Patinete: " + maxSteel.getVelocidade());
		maxSteel.freiarParaParar();
		System.out.println("Velocidade do Patinete: " + maxSteel.getVelocidade());
		
	}

}
