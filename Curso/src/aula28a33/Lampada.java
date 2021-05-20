package aula28a33;

public class Lampada {
	private boolean ligada;
	
	public boolean isLigada() {
		return ligada;
	}

	public void setLigada(boolean ligada) {
		this.ligada = ligada;
	}

//	void ligar() {
//		ligada = true;
//	}
//	
//	void desligar() {
//		ligada = false;
//	}
	
	void mostrarEstadoLampada() {
		if(ligada) {
			System.out.println("Lampada está ligada!");
		} else {
			System.out.println("Lampada está desligada!");
		}
	}
}
