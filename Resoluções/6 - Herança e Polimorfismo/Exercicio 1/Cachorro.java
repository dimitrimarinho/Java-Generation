package questao1Lista6;

public class Cachorro extends Animal {
	
	public Cachorro(String nome, int idade) {		
		super(nome, idade);		
	}
	
	public void emiteSom() {
		System.out.println("AU AU");
	}
	
	public void corre() {
		int velocidade = 0;
		velocidade += 10;
		System.out.println("Velocidade da corrida: " + velocidade);
	}

}
