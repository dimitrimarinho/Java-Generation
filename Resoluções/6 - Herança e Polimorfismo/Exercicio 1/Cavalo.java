package questao1Lista6;

public class Cavalo extends Animal {
	
	public Cavalo(String nome, int idade) {
		super(nome, idade);
	}
	
	public void emiteSom() {
		System.out.println("Hinn in in!!");
	}
	
	public void corre() {
		int velocidade = 0;
		velocidade += 30;
		System.out.println("Velocidade da corrida: " + velocidade);
	}

}
