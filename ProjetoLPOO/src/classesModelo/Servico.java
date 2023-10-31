package classesModelo;
import java.util.List;

public class Servico{
	private String nome_Servico;//Ex: musculacao, danca, etc
	private Instrutor instrutor;
	private List<Aluno> matriculados;
	
	public Servico(String nome_Servico, Instrutor instrutor, List<Aluno> matriculados) {
		this.setNome_Servico(nome_Servico);
		this.setInstrutor(instrutor);
		this.setMatriculados(matriculados);
	}

	public String getNome_Servico() {
		return nome_Servico;
	}

	public void setNome_Servico(String nome_Servico) {
		this.nome_Servico = nome_Servico;
	}

	public Instrutor getInstrutor() {
		return instrutor;
	}

	public void setInstrutor(Instrutor instrutor) {
		this.instrutor = instrutor;
	}

	public List<Aluno> getMatriculados() {
		return matriculados;
	}

	public void setMatriculados(List<Aluno> matriculados) {
		this.matriculados = matriculados;
	}
}	