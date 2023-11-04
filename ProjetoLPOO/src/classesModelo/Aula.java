package classesModelo;
import java.time.LocalDateTime;
import java.util.List;

public class Aula{
	private String tipo;//ex: ginástica, natação, dança
	private String data;
	private String horario;
	private Instrutor instrutor;
	
	public Aula(String tipo, String data, String horario, Instrutor instrutor) {
		this.tipo = tipo;
		this.data = data;
		this.horario = horario;
		this.instrutor = instrutor;
	}

	public String getTipo() {
		return tipo;
	}
	
	public String getData() {
		return data;
	}
	
	public String getHorario() {
		return horario;
	}
	
	public Instrutor getInstrutor() {
		return instrutor;
	}

	public void setInstrutor(Instrutor instrutor) {
		this.instrutor = instrutor;
	}
	public boolean atividadesemvagas() {
		// TODO Auto-generated method stub
		return true;
	}

	public int get() {
		// TODO Auto-generated method stub
		return 0;
	};
}	
	