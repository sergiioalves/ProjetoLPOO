package classesModelo;

public class Colaborador extends Pessoa{
	private String funcao;
	private String id_Colaborador;
	
	public Colaborador (String nome, int idade, char genero, String funcao, String id_Colaborador) {
		super(nome,idade,genero);
		this.setFuncao(funcao);
		this.id_Colaborador = id_Colaborador;
	}

	public String getFuncao() {
		return funcao;
	}
	
	public String getIdColab() {
		return id_Colaborador;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	
	public String toString() {
		return "Colaborador(a): " + nome + ", " + "Id: " + id_Colaborador + ", " + "especialização: " + funcao;
	}
}