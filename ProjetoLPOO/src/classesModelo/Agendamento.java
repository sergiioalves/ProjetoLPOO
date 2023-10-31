package classesModelo;
import java.time.LocalDateTime;
import java.util.List;

public class Agendamento extends Servico{
	private LocalDateTime data_Horario;
	private int tempo_Duracao;
	public Agendamento(String nome_Servico, Instrutor instrutor, List<Aluno> matriculados) {
		super(nome_Servico, instrutor, matriculados);
		this.data_Horario  = data_Horario;
		this.tempo_Duracao = tempo_Duracao;
	}//
	
	public LocalDateTime getdataHorario() {
		return data_Horario;
	}

	public void setdataHorario (LocalDateTime data_Horario) {
		this.data_Horario = data_Horario;
	}
	
	public int gettempoDuracao() {
		return tempo_Duracao;
	}

	public void settempoDuracao (int tempo_Duracao) {
		this.tempo_Duracao = tempo_Duracao;
	}
}