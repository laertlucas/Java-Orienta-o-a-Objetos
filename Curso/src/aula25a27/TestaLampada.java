package aula25a27;

public class TestaLampada {

	public static void main(String[] args) {
		Lampada lampada = new Lampada();
		
		lampada.ligar();
		lampada.mostrarEstadoLampada();
		
		lampada.desligar();
		lampada.mostrarEstadoLampada();
		
	}

}
