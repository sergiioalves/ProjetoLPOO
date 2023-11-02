package classesModelo;
import java.time.LocalDateTime;
import java.util.List;

public class Aula{
	private String descricao;//ex: ginástica, natação, dança
	private LocalDateTime data_Horario;
	private Instrutor instrutor;
	
	public Aula(String descricao, LocalDateTime data_Horario, Instrutor instrutor) {
		this.descricao = descricao;
		this.data_Horario = data_Horario;
		this.instrutor = instrutor;
	}

	public LocalDateTime getData_Horario() {
		return data_Horario;
	}

	public void setData_Horario(LocalDateTime data_Horario) {
		this.data_Horario = data_Horario;
	}

	public Instrutor getInstrutor() {
		return instrutor;
	}

	public void setInstrutor(Instrutor instrutor) {
		this.instrutor = instrutor;
	}
}	
	