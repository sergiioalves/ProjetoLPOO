package classesUI;

import java.util.ArrayList;
import java.util.Scanner;

import classesModelo.Aluno;
import classesModelo.Aula;
import classesModelo.Instrutor;
import classesModelo.Pessoa;

public class Menu {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		ArrayList<Aula> aulas = new ArrayList<>();
		ArrayList<Aluno> alunos = new ArrayList<>();
		ArrayList<Pessoa> funcionarios = new ArrayList<>();
		
		System.out.println("Digite a opção desejada: ");
		System.out.println("1 - Fazer matrícula de aluno.");
		System.out.println("2 - Buscar Aluno (por ID).");
		System.out.println("3 - Agendar aula.");
		System.out.println("4 - Cancelar aula.");
		System.out.println("5 - Cadastrar funcionário.");
		System.out.println("6 - Buscar funcionário (por ID).");
		System.out.println("7 - Remover aluno do sistema (buscar por ID).");
		System.out.println("8 - Remover funcionário do sistema (buscar por ID).");
		System.out.println("9 - Registrar pagamento de mensalidade.");
		System.out.println("0 - Sair.");
		int opc = scanner.nextInt();
		
		try {
		
			switch(opc){
				case 1: 
					System.out.println("Digite o nome da pessoa: ");
					String nome = scanner.next();
					System.out.println("Digite a idade da pessoa: ");
					int idade = scanner.nextInt();
					System.out.println("Digite o gênero da pessoa: ");
					char genero = scanner.next().charAt(0);
					System.out.println("Digite o plano de assinatura desejado: ");
					String planoAssinatura = scanner.next();
					System.out.println("Digite o id (codigo de identificação) do novo aluno: ");
					String id_Aluno = scanner.next();
				
					Aluno aluno = new Aluno (nome, idade, genero, planoAssinatura, id_Aluno);
					alunos.add(aluno);
					System.out.print("Aluno cadastrado com sucesso! ");
			
				break;
				
				case 2:
					boolean alunoEcontrado = false;
					System.out.println("Digite o Id do aluno que deseja buscar: ");
					String id_AlunoBusca = scanner.next();
					for (Aluno a:alunos) {
						if (a.getIdAluno().equalsIgnoreCase(id_AlunoBusca)) {
							System.out.println(a);
							alunoEcontrado = true;
					}if (alunoEcontrado=false){
							System.out.println("Aluno não encontrado no sistema.");
						}
					}
					
				case 3:
					int limiteParticipantes = scanner.nextInt();
					System.out.println("Descreva o tipo de aula (Ex: ginástica, musculação, etc.)");
					String tipo = scanner.next();
					System.out.println("Digite a data desejada.)");
					String data = scanner.next();
					System.out.println("Digite o horário desejado.)");
					String horario = scanner.next();
					System.out.println("Digite os atributos do instrutor que irá ministrar a aula.)");
					String nomeinst = scanner.next();
					int idadeinst =  scanner.nextInt();
					char generoinst = scanner.next().charAt(0);
					String especializacao = scanner.next();
					String id_Instrutor = scanner.next();
					Instrutor instrutor = new Instrutor (nomeinst, generoinst, generoinst, especializacao, id_Instrutor);
					if (tipo == "musculação") {
						//if tal condição:
							Aula aula = new Aula (tipo, data, horario, instrutor);
							boolean agendarAula = aluno.agendarAula(aula);
					}
					if (tipo == "ginástica") {
						//if numparticipantes < 10:
							Aula aula = new Aula (tipo, data, horario, instrutor);
							boolean agendarAula = aluno.agendarAula(aula);
					}
					if (tipo == "dança") {
						//if numparticipantes < 10:
							Aula aula = new Aula (tipo, data, horario, instrutor);
							boolean agendarAula = aluno.agendarAula(aula);
					}	
					
				
				case 0:
					System.out.println("Saindo do programa...");
					return;
				default:
					throw new OpcInvalidaException ("Opção inválida. Tente novamente.");
							
		}} catch (OpcInvalidaException e) {
			System.err.println(e.getMessage());
		}
		
}
}