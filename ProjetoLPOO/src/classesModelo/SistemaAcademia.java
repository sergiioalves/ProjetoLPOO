package classesModelo;

import java.util.ArrayList;

public class SistemaAcademia {
	ArrayList<Aula> aulas = new ArrayList<>();
	ArrayList<Aluno> alunos = new ArrayList<>();
	ArrayList<Pessoa> funcionarios = new ArrayList<>();
	
	public int getTotalAulas() {
		return aulas.size();
	}
	
	public int getTotalAlunos() {
		return alunos.size();
	}
	
	public int getTotalFunc() {
		return funcionarios.size();
	}
}
