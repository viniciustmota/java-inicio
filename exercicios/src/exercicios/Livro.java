package exercicios;

public class Livro {
	private String nome;
	private String autor;
	private int numerosPaginas;
	
	
	public String getNome() {
		return this.nome;
	}
	
	public String getAutor() {
		return this.autor;
	}
	
	public int getNumerosPaginas() {
		return this.numerosPaginas;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public void setNumerosPaginas(int nPaginas) {
		this.numerosPaginas = nPaginas;
	}
	
	public void LerLivro() {
		System.out.println("O nome do livro é: "  + this.getNome());
		System.out.println("O autor do livro é: " + this.getAutor());
		System.out.println("Números de páginas é " + this.getNumerosPaginas());
	}
}
