package aula25a27;

public class Lampada {
	boolean ligada;
	
	void ligar() {
		ligada = true;
	}
	
	void desligar() {
		ligada = false;
	}
	
	void mostrarEstadoLampada() {
		if(ligada) {
			System.out.println("Lampada est� ligada!");
		} else {
			System.out.println("Lampada est� desligada!");
		}
	}
}
