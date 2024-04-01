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
	
	public String verNota1() {
		if(this.nota1 >= 7) {
			return "Aprovado";
		}
		return "Reprovado";
		
	}
	
	public String verNota2() {
		if(this.nota2 >= 7) {
			return "Aprovado";
		}
		return "Reprovado";
		
	}
	
	public String verNota3() {
		if(this.nota3 >= 7) {
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
	
	public int getNota1() {
		return this.nota1;
	}
	
	public void setNota1(int nota1) {
		this.nota1 = nota1;
	}
	
	
	public int getNota2() {
		return this.nota2;
	}
	
	public void setNota2(int nota2) {
		this.nota2 = nota2;
	}
	
	public int getNota3() {
		return this.nota3;
	}
	
	public void setNota3(int nota3) {
		this.nota3 = nota3;
	}
	
	public String getCurso() {
		return this.curso;
	}
	
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	public int getMatricula() {
		return this.matricula;
	}
	
	public void setMatricula(int matricula) {
		this.matricula = matricula;
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
		System.out.println("Curso: " + curso);
		System.out.println("Matricula: " + matricula);
		System.out.println("o aluno " + nome + " foi " + verNota1() + " na matéria " + disciplina1+ ", " + verNota2() + " na matéria " + disciplina2 + " e "+ verNota3() + " na matéria " + disciplina3);
	};
}
