package classesModelo;

import java.util.List;

import classesUI.AulanaoAgendadaException;

public class Aluno extends Pessoa implements Pagamento{
	private String planoAssinatura;
	private String id_Aluno;
	private List<Aula> aulasAgendadas;
	private boolean mensalidadePaga;
	private double valorMensalidade;
	private double valorPago;
	
	public Aluno (String nome, int idade, char genero, String planoAssinatura, String id_Aluno, List<Aula> aulasAgendadas, boolean mensalidadePaga, Double valorMensalidade, Double valorPago) {
		super(nome,idade,genero);
		this.planoAssinatura = planoAssinatura;
		this.id_Aluno = id_Aluno;
		this.aulasAgendadas = aulasAgendadas;
		this.mensalidadePaga = false;
		this.valorMensalidade = valorMensalidade;
		this.valorPago = 0.0;
	}

	public String getPlanoAssinatura() {
		return planoAssinatura;
	}
	
	public String getIdAluno() {
		return id_Aluno;
	}

	public void setPlanoAssinatura(String planoAssinatura) {
		this.planoAssinatura = planoAssinatura;
	}
	
	
	public List<Aula> getAulasAgendadas() {
        return aulasAgendadas;
    }

    public void agendarAula(Aula aula) {
        aulasAgendadas.add(aula);
    }
    
    public Double getValorPago() {
		return valorPago;
	}

	public void cancelarAula(Aula aula) throws AulanaoAgendadaException{
		 if (!aulasAgendadas.contains(aula)) {
		        throw new AulanaoAgendadaException();
		    }
		    aulasAgendadas.remove(aula);
	};
	
	public String toString() {
		return "Aluno(a): " + nome + "," + " Id: " + id_Aluno;
	}

	public void registrar_Pagamento() {
		if (mensalidadePaga) {
			System.out.println("A mensalidade já foi paga por o aluno: " + nome);
		}else {
			mensalidadePaga = true;
			valorPago += valorMensalidade;
			System.out.println("Pagamento da mensalidade registrado para o aluno: " + nome);
		}
    }

}