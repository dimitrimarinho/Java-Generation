package questao5Patinete;

public class Patinete {

		private String modelo;
		private String cor;
		private int velocidade;
		
		public Patinete(String modelo, String cor) {
			this.modelo = modelo;
			this.cor = cor;
			this.velocidade = 0;
		}
		
		public void aumentarVelocidade() {
			this.velocidade += 5;
			setVelocidade(velocidade);
		}
		
		public void freiarLevemente() {
			if(this.velocidade != 0)
				velocidade = velocidade - (velocidade/4);
			setVelocidade(velocidade);
		}
		
		public void freiarParaParar() {
			setVelocidade(0);
		}
		
		public String getModelo() {
			return modelo;
		}

		public void setModelo(String modelo) {
			this.modelo = modelo;
		}

		public String getCor() {
			return cor;
		}

		public void setCor(String cor) {
			this.cor = cor;
		}

		public int getVelocidade() {
			return velocidade;
		}

		public void setVelocidade(int velocidade) {
			this.velocidade = velocidade;
		}
		
		
		
}
