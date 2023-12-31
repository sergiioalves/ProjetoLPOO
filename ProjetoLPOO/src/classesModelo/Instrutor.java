package classesModelo;

public class Instrutor extends Pessoa{
	private String especializacao;
	private String id_Instrutor;
	
	public Instrutor (String nome, int idade, char genero, String especializacao, String id_Instrutor) {
		super(nome,idade,genero);
		this.especializacao = especializacao;
		this.id_Instrutor = id_Instrutor;
	}

	public String getEspecializacao() {
		return especializacao;
	}
	
	public String getIdInstrutor() {
		return id_Instrutor;
	}

	public void setEspecializacao(String especializacao) {
		this.especializacao = especializacao;
	}
	
	public String toString() {
		return "Instrutor(a): " + nome + ", " + "Id: " + id_Instrutor + ", " + "especialização: " + especializacao;
	}
}