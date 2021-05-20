package aula24;

public class Conta {
	private String numConta;
	private double saldoConta;
	private double limiteConta;
	private String tipoConta;
	
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
	
	public double getLimiteConta() {
		return limiteConta;
	}
	
	public void setLimiteConta(double limiteConta) {
		this.limiteConta = limiteConta;
	}
	
	public String getTipoConta() {
		 
		return tipoConta;
	}
	
	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}
	
	void informarTipoConta(String informarTipoConta) {
		if(this.tipoConta == "Basico") {
			this.limiteConta = 50000;
			
			System.out.println("Conta Básica, seu limite é de: " + limiteConta);
		} else if(this.tipoConta == "Especial"){
			this.limiteConta = 500000;
			
			System.out.println("Conta Especial, seu limite é de: " + limiteConta);
		}
	}
}
