package exercicios;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lampada led = new Lampada();
		led.setTipo("led");
		led.preco = 10;
		led.voltagem = 110;
		led.ligado = false;
		
		led.Ligar();
		led.LerProduto();
		
		System.out.println("\n");
		Livro ilhaDosBino = new Livro();
		ilhaDosBino.setAutor("Bino");
		ilhaDosBino.setNome("Ilha dos bino");
		ilhaDosBino.setNumerosPaginas(367);
		ilhaDosBino.LerLivro();
		
		System.out.println("\n");
		ContaCorrente contaDoBino = new ContaCorrente();
		contaDoBino.setSaldo(500);
		contaDoBino.Sacar(60);
		//contaDoBino.Depositar(1000);
		contaDoBino.LerConta();
	}
}
