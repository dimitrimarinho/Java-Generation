package questao7Paciente;

public class TestaPaciente {

	public static void main(String[] args) {
		
		Paciente Andrei = new Paciente("Andrei", 29,
				"Paciente sofre de Gigantismo, n�o para de crescer. BIG!",
				"Ocorr�ncia Grave");
		
		System.out.println(Andrei.getPrescricao());
		Andrei.preescreverMedicamento("Dipirona de 4 em 4 horas para parar de crescer");
		
		Andrei.internarPaciente();
		
		Andrei.receberAlta();
		System.out.println("\nGra�as a Deus parou de crescer tomando Dipirona.\n"
				+ "Paciente tem 11 anos e parou de crescer com 1,93 m de altura");

	}

}
