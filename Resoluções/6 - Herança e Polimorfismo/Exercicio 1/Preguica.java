package resolucoes;

public class Preguica extends Animal {

	public Preguica(String nome, int idade) {
		super(nome, idade);
	}
	
	public void emiteSom() {
		System.out.println("Aaaaa aaa...");
	}
	
	public void sobeArvore() {
		int alturaRefSolo = 0;
		alturaRefSolo += 3;
		System.out.println("Altura da preguiça na árvore (referencial solo): " + alturaRefSolo);
	}

}
