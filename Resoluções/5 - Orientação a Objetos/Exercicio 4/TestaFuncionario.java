package questao4Funcionario;

public class TestaFuncionario {
	
	public static void main(String[] args) {

		Funcionario luis = new Funcionario("Luis Guerreiro", "411.972.460-37", 25, "Programador Java", 3000.50);
		
		luis.mostrarInfo();
		luis.promovido("Professor da Generation Brasil", 8000.80);
	
	}
	
}
