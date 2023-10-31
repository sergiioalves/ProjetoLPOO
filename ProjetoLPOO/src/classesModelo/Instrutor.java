package classesModelo;

public class Instrutor extends Pessoa{
	private String especializacao;
	
	public Instrutor (String nome, int idade, char genero, String especializacao) {
		super(nome,idade,genero);
		this.setEspecializacao(especializacao);
	}

	public String getEspecializacao() {
		return especializacao;
	}

	public void setEspecializacao(String especializacao) {
		this.especializacao = especializacao;
	}
}