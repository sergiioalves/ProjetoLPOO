package classesUI;

public abstract class Estatisticas {
	public abstract void executar();
	
	public void imprimirCabecalho() {
		System.out.println("====== Estatísticas do sistema ======");
	}
	
	public void imprimirRodape() {
		System.out.println("=====================================");
	}
}
