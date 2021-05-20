package aula24;

public class TestaConta {

	public static void main(String[] args) {
		Conta conta1 = new Conta();
		conta1.setNumConta("00000-1");
		conta1.setSaldoConta(21000);
		conta1.setTipoConta("Basica");
		//conta1.setTipoConta("Especial");
		
		System.out.println(conta1.getNumConta());
		System.out.println(conta1.getSaldoConta());
	}

}
