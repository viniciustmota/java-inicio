package exercicios;

public class Lampada {
	
	public int preco;
	private String tipo;
	public int voltagem;
	public Boolean ligado;
	
	public String Ligar() {
		if(this.ligado) {
			return "Ligado";
		}
		return "Desligada";
		
	}
	
	public void LerProduto() {
		System.out.println("O pre�o da lampada �: " + "R$" +this.preco);
		System.out.println("O tipo da lampada �: " + this.tipo);
		System.out.println("Voltagem " + this.voltagem + "V");
		System.out.println("A lampada est� " + this.Ligar());
	}
	
	public String getTipo() {
		return this.tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}
