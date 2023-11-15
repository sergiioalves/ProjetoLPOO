package classesUI;

import classesModelo.SistemaAcademia;

public class EstatisticasSistema extends Estatisticas {
	
	private SistemaAcademia sistema;
	
	public EstatisticasSistema (SistemaAcademia sistema) {
		this.sistema = sistema;
	}
	
	
	public void executar() {
		imprimirCabecalho();
		
		System.out.println("Estatísticas do sistema:      ");
		System.out.println("Total de Alunos: " + sistema.getTotalAlunos());
		System.out.println("Total de Funcionários: " + sistema.getTotalFunc());
		System.out.println("Total de Aulas: " + sistema.getTotalAulas ());
		
		imprimirRodape();
	}
}
