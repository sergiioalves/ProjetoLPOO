package classesUI;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import classesModelo.Aluno;
import classesModelo.Aula;
import classesModelo.Colaborador;
import classesModelo.Instrutor;
import classesModelo.Pessoa;

public class Menu {
		
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		ArrayList<Aula> aulas = new ArrayList<>();
		ArrayList<Aluno> alunos = new ArrayList<>();
		ArrayList<Pessoa> funcionarios = new ArrayList<>();
		int opc = 0;
		
		do {
			try {
				System.out.println("Digite a opcao desejada: ");
				System.out.println("1 - Fazer matricula de aluno.");
				System.out.println("2 - Buscar Aluno (por ID).");
				System.out.println("3 - Cadastrar uma aula.");
				System.out.println("4 - Agendar aula.");
				System.out.println("5 - Cancelar aula.");
				System.out.println("6 - Cadastrar funcionário.");
				System.out.println("7 - Buscar funcionário (por ID).");
				System.out.println("8 - Remover aluno do sistema (buscar por ID).");
				System.out.println("9 - Remover funcionário do sistema (buscar por ID).");
				System.out.println("10 - Registrar pagamento de mensalidade de aluno.");
				System.out.println("0 - Sair.");
				opc = scanner.nextInt();
				scanner.nextLine();
		
				switch(opc){
					case 1: 
						System.out.println("Digite o nome da pessoa: ");
						String nome = scanner.next();
						System.out.println("Digite a idade da pessoa: ");
						int idade = scanner.nextInt();
						System.out.println("Digite o genero da pessoa: ");
						char genero = scanner.next().charAt(0);
						System.out.println("Digite o plano de assinatura desejado: ");
						String planoAssinatura = scanner.next();
						System.out.println("Digite o id (codigo de identificacao) do novo aluno: ");
						String id_Aluno = scanner.next();
						List<Aula> aulas_Agendadas = null;
						boolean mensalidadePaga = false;
						Double valorPago = 0.0;
						System.out.println("Digite o valor da mensalidade do novo aluno: ");
						Double valorMensalidade = scanner.nextDouble();
				
						Aluno aluno = new Aluno (nome, idade, genero, planoAssinatura, id_Aluno, aulas_Agendadas, mensalidadePaga, valorMensalidade, valorPago);
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
							}else {
								System.out.println("Aluno nao encontrado no sistema.");
							}
						}
				
						break;
					
					case 3:
						int limiteParticipantes = scanner.nextInt();
						System.out.println("Descreva o tipo de aula (Ex: ginastica, musculação, etc.)");
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
						Aula aula = new Aula (tipo, data, horario, instrutor);
					
						break;
					
					case 4:
						System.out.println("Lista de alunos:");
						for (int i = 0; i < alunos.size(); i++) {
							System.out.println(i + ". " + alunos.get(i).getNome());
						}
						System.out.println("Escolha o número correspondente ao aluno desejado: ");
						int numeroAluno = scanner.nextInt();
						Aluno alunoSelecionado = alunos.get(numeroAluno);

						System.out.println("Lista de aulas disponíveis:");
						for (int i = 0; i < aulas.size(); i++) {
							System.out.println(i + ". " + aulas.get(i).getTipo());
						}
						System.out.println("Escolha o número da aula: ");
						int numeroAula = scanner.nextInt();
						Aula aulaSelecionada = aulas.get(numeroAula);
						alunoSelecionado.agendarAula(aulaSelecionada);
						System.out.println("Aula agendada com sucesso para " + alunoSelecionado.getNome() + ".");
        			
						break;
        		
					case 5:
						System.out.println("Lista de alunos:");
						for (int i = 0; i < alunos.size(); i++) {
							System.out.println(i + ". " + alunos.get(i).getNome());
						}
						System.out.println("Escolha o número do aluno para cancelar aula: ");
						int numeroAlunoCancelar = scanner.nextInt();
						Aluno alunoSelecionadoCancelar = alunos.get(numeroAlunoCancelar);

						List<Aula> aulasAgendadas = alunoSelecionadoCancelar.getAulasAgendadas();

						System.out.println("Aulas agendadas por " + alunoSelecionadoCancelar.getNome() + ":");
						for (int i = 0; i < aulasAgendadas.size(); i++) {
							System.out.println(i + ". " + aulasAgendadas.get(i).getTipo());
						}

						if (aulasAgendadas.isEmpty()) {
							System.out.println("Nenhuma aula agendada.");
						} else {
							try {
								System.out.println("Escolha o número da aula para cancelar: ");
								int numeroAulaCancelar = scanner.nextInt();
								if (numeroAulaCancelar >= 0 && numeroAulaCancelar < aulasAgendadas.size()) {
									Aula aulaCancelar = aulasAgendadas.get(numeroAulaCancelar);
									alunoSelecionadoCancelar.cancelarAula(aulaCancelar);
									System.out.println("Aula cancelada com sucesso.");
								} else {
									throw new numeroAulaInvalidoException();
								}
							}catch (AulanaoAgendadaException e) {
								System.out.println("Erro: " + e.getMessage());
							}
							catch (numeroAulaInvalidoException e) {
								System.out.println("Erro: " + e.getMessage());
							}
						}
		
						break;
				    
					case 6:
						System.out.println("Digite o nome do funcionário a ser cadastrado: ");
						String nomeFunc = scanner.next();
						System.out.println("Digite a idade do funcionário a ser cadastrado: ");
						int idadeFunc = scanner.nextInt();
						System.out.println("Digite o gênero do funcionário a ser cadastrado: ");
						char generoFunc = scanner.next().charAt(0);
						System.out.println("Para continuar o cadastro, escolha uma das opções");
						System.out.println("1 - Cadastrar instrutor: ");
						System.out.println("2 - Cadastrar colaborador: ");
						int opcad = scanner.nextInt();
						if (opcad == 1) {
							System.out.println("Digite a especialização do novo instrutor: ");
							String espcInst = scanner.next();
							System.out.println("Digite o codigo de identificação do novo instrutor: ");
							String idInst = scanner.next();
							Instrutor novoInstrutor = new Instrutor(nomeFunc, idadeFunc, generoFunc, espcInst, idInst);
							funcionarios.add(novoInstrutor);
							System.out.println("Instrutor cadastrado com sucesso!");
						}
						if (opcad == 2) {
							System.out.println("Digite a função do novo colaborador: ");
							String funcColab = scanner.next();
							System.out.println("Digite o codigo de identificação do novo colaborador: ");
							String idColab = scanner.next();
							Colaborador novoColaborador = new Colaborador(nomeFunc, idadeFunc, generoFunc, funcColab, idColab);
							funcionarios.add(novoColaborador);
							System.out.println("Colaborador cadastrado com sucesso!");
						}
					
						break;
					
					case 7:
						System.out.println("Digite o ID do funcionário que deseja buscar: ");
						String idFuncBusca = scanner.next();
						boolean funcEncontrado = false;
						for (Pessoa p:funcionarios) {
							if (p instanceof Instrutor) {
								Instrutor inst = (Instrutor) p;
								if (inst.getIdInstrutor().equalsIgnoreCase(idFuncBusca)) {
									System.out.println(p);
									funcEncontrado = true;
								}
							}
							
							if (p instanceof Colaborador) {
								Colaborador col = (Colaborador) p;
								if (col.getIdColab().equalsIgnoreCase(idFuncBusca)) {
									System.out.println(p);
									funcEncontrado = true;
								}
							}
							if (p.getNome().equalsIgnoreCase(idFuncBusca)) {
								System.out.println(p);
								funcEncontrado = true;
							}else {
								System.out.println("Funcionario não encontrado.");
							}
						}
					
						break;
					
					case 8:
						System.out.println("Digite o ID do aluno que deseja remover: ");
						String idAluRmv = scanner.next();
						boolean alunoEncontrado = false;
						for (Aluno a:alunos) {
							if (a.getIdAluno().equalsIgnoreCase(idAluRmv)) {
								System.out.println("Aluno " + a + " removido");
								alunoEncontrado = true;
								alunos.remove(a);
								System.out.println("Aluno removido do sistema.");
							}else {
								System.out.println("Aluno nao encontrado no sistema.");
							}
						}
					
						break;
					
					case 9:
						System.out.println("Digite o ID do funcionário que deseja buscar: ");
						String idFuncRmv = scanner.next();
						boolean funcRmvEncontrado = false;
						for (Pessoa f:funcionarios) {
							if (f instanceof Instrutor) {
								Instrutor inst = (Instrutor) f;
								if (inst.getIdInstrutor().equalsIgnoreCase(idFuncRmv)) {
									System.out.println("Funcionário " + f + " removido");
									funcRmvEncontrado = true;
									funcionarios.remove(f);
									System.out.println("Funcionario removido do sistema.");
								}
							}
							
							if (f instanceof Colaborador) {
								Colaborador colab = (Colaborador) f;
								if (colab.getIdColab().equalsIgnoreCase(idFuncRmv)) {
									System.out.println("Funcionario " + f + " removido");
									funcRmvEncontrado = true;
									funcionarios.remove(f);
									System.out.println("Funcionario removido do sistema.");
								}
							}
							}
						if (funcRmvEncontrado==false) {
							System.out.println("Funcionario nao encontrado no sistema.");
						}
					
						break;
				
					case 10:
						System.out.println("Lista de alunos:");
						for (int i = 0; i < alunos.size(); i++) {
							System.out.println(i + ". " + alunos.get(i).getNome());
						}
						System.out.println("Escolha o número do aluno para registrar o pagamento da mensalidade: ");
						int numeroAlunoPagmto = scanner.nextInt();

						if (numeroAlunoPagmto >= 0 && numeroAlunoPagmto < alunos.size()) {
							Aluno alunoSelecionadoPagamento = alunos.get(numeroAlunoPagmto);
							alunoSelecionadoPagamento.registrar_Pagamento();
							System.out.println("Valor total pago pelo aluno " + alunoSelecionadoPagamento.getNome() + ": " + alunoSelecionadoPagamento.getValorPago());
						} else {
							System.out.println("Numero de aluno inválido. Tente novamente.");
						}
				    
						break;
						
					case 0:
						System.out.println("Saindo do programa...");
						return;
					default:
						throw new OpcInvalidaException ("Opcao invalida. Tente novamente.");
							
				}} catch (OpcInvalidaException e) {
					System.err.println(e.getMessage());
				}
		}while(opc!=0);
		
		scanner.close();

}
}