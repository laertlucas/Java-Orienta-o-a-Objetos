package aula25a27;

public class Aluno {
	
	private String nome;
	private String matricula;
	private String curso;
	private double disciplina1;
	private double disciplina2;
	private double disciplina3;
	
	public double getDisciplina1() {
		return disciplina1;
	}

	public void setDisciplina1(double disciplina1) {
		this.disciplina1 = disciplina1;
	}

	public double getDisciplina2() {
		return disciplina2;
	}

	public void setDisciplina2(double disciplina2) {
		this.disciplina2 = disciplina2;
	}

	public double getDisciplina3() {
		return disciplina3;
	}

	public void setDisciplina3(double disciplina3) {
		this.disciplina3 = disciplina3;
	}

//	public double getNotas() {
//		return notas;
//	}
//	
//	public void setNotas(double notas) {
//		this.notas = notas;
//	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	void verificarNotas() {
		if(disciplina1 >= 7) {
			System.out.println("Disciplina 1 Aprovado");
		} else {
			System.out.println("Disciplina 1 Reprovado");
		}
		
		if(disciplina2 >= 7) {
			System.out.println("Disciplina 2 Aprovado");
		} else {
			System.out.println("Disciplina 2 Reprovado");
		}
		
		if(disciplina3 >= 7) {
			System.out.println("Disciplina 3 Aprovado");
		} else {
			System.out.println("Disciplina 3 Reprovado");
		}
	}
}
