package classesModelo;

public class Colaborador extends Pessoa{
	private String funcao;
	
	public Colaborador (String nome, int idade, char genero, String funcao) {
		super(nome,idade,genero);
		this.setFuncao(funcao);
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
}