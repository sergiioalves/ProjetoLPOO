package classesUI;

import java.util.ArrayList;
import java.util.Scanner;

import classesModelo.Aluno;
import classesModelo.Aula;
import classesModelo.Pessoa;

public class Menu {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		ArrayList<Aula> aulas = new ArrayList<>();
		ArrayList<Aluno> alunos = new ArrayList<>();
		ArrayList<Pessoa> funcionarios = new ArrayList<>();
		
		System.out.print("Digite a opção desejada: ");
		System.out.print("1 - Fazer matrícula de aluno.");
		System.out.print("2 - Agendar aula.");
		System.out.print("3 - Buscar Aluno (por ID).");
		System.out.print("4 - Cadastrar funcionário.");
		System.out.print("5 - Buscar funcionário (por ID).");
		System.out.print("6 - Remover aluno do sistema (buscar por ID).");
		System.out.print("7 - Remover funcionário do sistema (buscar por ID).");
		System.out.print("0 - Sair.");
		
	}

}
