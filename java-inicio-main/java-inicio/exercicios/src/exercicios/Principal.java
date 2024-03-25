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
		
		System.out.println("\n");
		
		Aluno joao = new Aluno();
		joao.setNome("João Vitor");
		joao.setCurso("AMS");
		joao.setMatricula(256873);
		joao.setNota1(3);
		joao.setNota2(4);
		joao.setNota3(8);
		joao.setDisciplina1("Matemática");
		joao.setDisciplina2("Lingua Portuguesa");
		joao.setDisciplina3("Espanhol");
		joao.lerAluno();
		
		System.out.println("\n");
		
		ContaBancaria contaDoErick = new ContaBancaria();
		contaDoErick.setSaldo(500);
		contaDoErick.Sacar(580);
		//contaDoErick.Depositar(1000);
		contaDoErick.lerContaBancaria();
	}

}
