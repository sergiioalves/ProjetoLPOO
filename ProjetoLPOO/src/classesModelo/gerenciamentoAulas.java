package classesModelo;
import java.util.ArrayList;
import java.util.List;

public class gerenciamentoAulas{
	private String nome_Servico;//Ex: musculacao, danca, etc.
	private Instrutor instrutor;
	private ArrayList<Aula> aulasAgendadas;
	
	public gerenciamentoAulas(String nome_Servico, Instrutor instrutor, ArrayList<Aula> aulasAgendadas) {
		this.nome_Servico = nome_Servico;
		this.instrutor = instrutor;
		this.aulasAgendadas = aulasAgendadas;
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

	public List<Aula> getAulasAgendadas() {
		return aulasAgendadas;
	}

	public void setAulasAgendadas(ArrayList<Aula> aulasAgendadas) {
		this.aulasAgendadas = aulasAgendadas;
	}
	
	public boolean marcarAula(Aula aula) {
		if (verificarDisponibilidade(aula)) {
			aulasAgendadas.add(aula);
			return true;
		}
		return false;
	}
	
	public boolean cancelarAula(Aula aula) {
		if (aulasAgendadas.contains(aula)) {
			aulasAgendadas.remove(aula);
			return true;
		}
		return false;
	}
	
	public boolean verificarDisponibilidade (Aula aula) {
		for (Aula auladata: aulasAgendadas) {
			if (aula.getData_Horario().equals(auladata.getData_Horario()) && aula.getInstrutor().equals(auladata.getInstrutor())) {
				return false;
			}
		}return true;
	}
}	