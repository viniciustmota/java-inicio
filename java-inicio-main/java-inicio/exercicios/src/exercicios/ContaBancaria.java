package exercicios;

public class ContaBancaria {
 private String nomeCliente;
 private int numConta;
 private float saldo;

public String getNomeCliente() {
	return this.nomeCliente;
}

public void setNomeCliente(String nomeCliente) {
	this.nomeCliente = nomeCliente;
}

public int getNumConta() {
	return this.numConta;
}

public void setNumConta(int numConta) {
	this.numConta = numConta;
}

public float getSaldo() {
	return this.saldo;
}

public void setSaldo(float saldo) {
	this.saldo = saldo;
}

public void Sacar(float saque) {
	if (!(this.saldo <= 0) && !(saque > this.saldo)) {
		this.setSaldo(this.saldo - saque);
	}
}

public void Depositar(float dep) {
		this.setSaldo(this.saldo + dep);
}

public void lerContaBancaria() {
	System.out.println("O saldo da conta é  " + "R$" + this.getSaldo());
}

public void lerContaBancaria() {
	
	
}

}