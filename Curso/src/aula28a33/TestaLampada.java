package aula28a33;

public class TestaLampada {

	public static void main(String[] args) {
		Lampada lamp = new Lampada();
		
		lamp.setLigada(false);
		lamp.mostrarEstadoLampada();
		
		lamp.setLigada(true);
		lamp.mostrarEstadoLampada();
	}

}
