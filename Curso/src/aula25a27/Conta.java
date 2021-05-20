package aula25a27;

public class Conta {
	private String numConta;
	private double saldoConta;
	private double limiteConta;
	private boolean especial;
	private boolean chequeEspecial;
	
	public boolean isEspecial() {
		return especial;
	}

	public boolean isChequeEspecial() {
		return chequeEspecial;
	}

	public void setChequeEspecial(boolean chequeEspecial) {
		this.chequeEspecial = chequeEspecial;
	}

	public void setEspecial(boolean especial) {
		this.especial = especial;
	}

	public String getNumConta() {
		return numConta;
	}
	
	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}
	
	public double getSaldoConta() {
		return saldoConta;
	}
	
	public void setSaldoConta(double saldoConta) {
		this.saldoConta = saldoConta;
	}
	
	void especial() {
		especial = true;
	}
	
	void basica() {
		especial = false;
	}
	
	void informarTipoConta() {
		if(especial) {
			this.limiteConta = 50000;
			System.out.println("Conta ESPECIAL");
			System.out.println("Limite: " + limiteConta);
		} else {
			this.limiteConta = 10000;
			System.out.println("Conta BASICA");
			System.out.println("Limite: " + limiteConta);
		}
	}
	
	
	void sacar(double sacar) {
		if(this.saldoConta >= sacar) {
		this.saldoConta -= sacar; 
		} else {
			System.out.println("Saldo Insulficiente!");
		}
	}
	
	void depositar(double depositar) {
		this.saldoConta += depositar;
	}
	
	public double getConsultar(double consultar) {
		return this.saldoConta;
	}
	
	void usaCheque() {
		chequeEspecial = true;
	}
	
	void semCheque() {
		chequeEspecial = false;
	}
	
	void consultarCheque() {
		if(chequeEspecial) {
			System.out.println("Usa cheque especial!");
		} else {
			System.out.println("Não usa cheque!");
		}
	}
}
