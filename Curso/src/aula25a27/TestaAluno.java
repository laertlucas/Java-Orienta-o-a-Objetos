package aula25a27;

public class TestaAluno {

	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		
		aluno.setNome("Elias");
		aluno.setMatricula("00001");
		aluno.setCurso("Letras");
		aluno.setDisciplina1(5.5);
		aluno.setDisciplina2(7.5);
		aluno.setDisciplina3(7.5);
		
		System.out.println(aluno.getNome());
		System.out.println(aluno.getMatricula());
		aluno.verificarNotas();
	}
}
