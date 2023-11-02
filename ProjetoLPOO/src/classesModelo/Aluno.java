package classesModelo;

public class Aluno extends Pessoa implements Agendament{
	private String planoAssinatura;
	private String id_Aluno;
	
	public Aluno (String nome, int idade, char genero, String planoAssinatura, String id_Aluno) {
		super(nome,idade,genero);
		this.planoAssinatura = planoAssinatura;
		this.id_Aluno = id_Aluno;
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
	
	
	public boolean agendarAula(Aula aula) {
		if (atividadesemvagas(aula)) {
			throw new IllegalArgumentException("Não há vagas para essa aula/atividade.");
		}
		else {
			return true;
		}
		
	};
	
	public boolean atividadesemvagas(Aula aula) {
		// TODO Auto-generated method stub
		return false;
	};
	

	public boolean cancelarAula(Aula aula) {
		return true;
	};

}