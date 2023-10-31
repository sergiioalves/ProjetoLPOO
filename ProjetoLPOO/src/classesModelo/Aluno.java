package classesModelo;

public class Aluno extends Pessoa{
	private String planoAssinatura;//tipo de plano: mensal, anual,etc...
	
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