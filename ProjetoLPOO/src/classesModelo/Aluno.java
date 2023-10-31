package classesModelo;

public class Aluno extends Pessoa{
	private String planoAssinatura;
	
	public Aluno (String nome, int idade, char genero, String planoAssinatura) {
		super(nome,idade,genero);
		this.setPlanoAssinatura(planoAssinatura);
	}

	public String getPlanoAssinatura() {
		return planoAssinatura;
	}

	public void setPlanoAssinatura(String planoAssinatura) {
		this.planoAssinatura = planoAssinatura;
	}
}