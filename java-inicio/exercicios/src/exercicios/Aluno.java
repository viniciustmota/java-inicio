package exercicios;

public class Aluno {
	private String nome;
	private String curso;
	private int matricula;
	private String disciplina1;
	private int nota1;
	private String disciplina2;
	private int nota2;
	private String disciplina3;
	private int nota3;
	
	public String verNota() {
		if(this.nota1 >= 7) {
			return "Aprovado";
		}
		return "Reprovado";
		
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public String getDisciplina1() {
		return this.disciplina1;
	}
	
	public void setDisciplina1(String disciplina1) {
		this.disciplina1 = disciplina1;
	}
	
	public String getDisciplina2() {
		return this.disciplina2;
	}
	
	public void setDisciplina2(String disciplina2) {
		this.disciplina2 = disciplina2;
	}
	
	public String getDisciplina3() {
		return this.disciplina3;
	}
	
	public void setDisciplina3(String disciplina3) {
		this.disciplina3 = disciplina3;
	}
	
	public void lerAluno() {
		System.out.println("o aluno " + nome + " foi " + verNota() + " na matéria " + disciplina1+ ", " + verNota() + " na matéria " + disciplina2 + " e "+ verNota() + " na matéria " + disciplina3);
	};
}
