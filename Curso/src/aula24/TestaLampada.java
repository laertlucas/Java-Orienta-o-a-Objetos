package aula24;

public class TestaLampada {

	public static void main(String[] args) {
		
		Lampada lampada = new Lampada();
		
		lampada.setProduto("Lâmpada Smart");
		lampada.setTipo("LED Inteligente");
		lampada.setTensao("Bivolt");
		lampada.setPotencia(10);
		lampada.setModelo("Smart");
		lampada.setMarca("Elgin");
		lampada.setGarantia(12);
		lampada.setPreco(99.90);
		lampada.setEstoque(1);
		
		System.out.println(lampada.getProduto());
		System.out.println(lampada.getPreco());
		System.out.println(lampada.getTipo());
		System.out.println(lampada.getTensao());
		System.out.println(lampada.getPotencia() + "W");
		System.out.println(lampada.getModelo());
		System.out.println(lampada.getGarantia() + " Meses");
		
		if(lampada.getEstoque() <= 0) {
			System.out.println("Produto Indisponível!");
			
		} else {
			
			System.out.println("Produto Disponível: " + lampada.getEstoque() + " no estoque!");
		}
	}

}
