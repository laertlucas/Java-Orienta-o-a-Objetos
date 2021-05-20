package aula25a27;

public class TestaConta {

	public static void main(String[] args) {
		Conta c1 = new Conta();
		
		c1.setNumConta("00000-1");
		c1.setSaldoConta(10000);
		c1.especial();
		c1.informarTipoConta();
		c1.usaCheque();
		
		System.out.println(c1.getNumConta());
		System.out.println(c1.getSaldoConta());
		c1.consultarCheque();
		
		c1.depositar(2000);
		System.out.println(c1.getSaldoConta());
		
		c1.sacar(1000);
		System.out.println(c1.getConsultar(0));
		
		
	}

}
