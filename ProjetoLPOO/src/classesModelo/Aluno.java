package classesModelo;

import java.util.List;

public class Aluno extends Pessoa{
	private String planoAssinatura;
	private String id_Aluno;
	private List<Aula> aulasAgendadas;
	
	public Aluno (String nome, int idade, char genero, String planoAssinatura, String id_Aluno, List<Aula> aulasAgendadas) {
		super(nome,idade,genero);
		this.planoAssinatura = planoAssinatura;
		this.id_Aluno = id_Aluno;
		this.aulasAgendadas = aulasAgendadas;
	}

	public String getPlanoAssinatura() {
		return planoAssinatura;
	}
	
	public String getIdAluno() {
		return id_Aluno;
	}

	public void setPlanoAssinatura(String planoAssinatura) {
		this.planoAssinatura = planoAssinatura;
	}
	
	
	public List<Aula> getAulasAgendadas() {
        return aulasAgendadas;
    }

    public void agendarAula(Aula aula) {
        aulasAgendadas.add(aula);
    }

//	public boolean atividadesemvagas(Aula aula) {
//		// TODO Auto-generated method stub
//		return true;
//	};
	

	public void cancelarAula(Aula aula) {
		aulasAgendadas.remove(aula);
	};
	
	public String toString() {
		return "Aluno(a): " + nome + "," + " Id: " + id_Aluno;
	}

}