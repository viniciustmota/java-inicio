package exercicios;

public class ContaCorrente {
	private float saldo;
	private int numero;
	private float limite = 10000;
	private boolean especial;
	
	
	public float getSaldo() {
		return this.saldo;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public float getLimite() {
		return this.limite;
	}
	
	public boolean getEspecial() {
		return this.especial;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public void setEspecial(boolean especial) {
		this.especial = especial;
	}
	
	public void Sacar(float saque) {
		if (!(this.saldo <= 0) && !(saque > this.saldo)) {
			this.setSaldo(this.saldo - saque);
		}
	}
	
	public void Depositar(float dep) {
		
		if(!(this.saldo >= this.limite) && !(dep + this.saldo > this.limite)) {
			this.setSaldo(this.saldo + dep);
		}
	}
	
	public void LerConta() {
		System.out.println("O saldo da conta é  " + "R$" + this.getSaldo());
		System.out.println("O numero da conta é: " + this.getNumero());
		System.out.println("O limite da conta é  " + this.getLimite());
		System.out.println("Está conta é especial " + this.getEspecial());
	}
	
}
