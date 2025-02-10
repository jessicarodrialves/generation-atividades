package atividade.estruturaDeDados;

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {

		//Escreva um programa contendo uma Collection Queue (Fila) de Objetos do tipo string, 
		//para organizar uma fila por ordem de chegada dos Clientes de um Banco.
		//O programa deverá ter um Menu que aceitará as opções 0, 1, 2 e 3: (Scanner/Variavel Menu/Estrutura de repetição)
		//	1: Adicionar um novo Cliente na fila. Deve solicitar o nome do Cliente.
		//	2: Listar todos os Clientes na fila
		//	3: Chamar (retirar) uma pessoa da fila 
		//	0: O programa deve ser finalizado. 
		//	Caso a fila esteja vazia, o programa deverá informar que a fila está vazia ao tentar retirar (chamar) um cliente da fila.

		int opcao = 0;
		String nome = "";
		Queue<String> fila = new LinkedList<String>();
		Scanner recebeDados = new Scanner(System.in);
		
		try {
			do {
				System.out.println("*******************************************************");
				System.out.println("1 - Adicionar Cliente na Fila");
				System.out.println("2 - Listar todos os Clientes");
				System.out.println("3 - Retirar Cliente da Fila");
				System.out.println("0 - Sair");
				System.out.println("*******************************************************\n");
		
				System.out.println("Entre com a opção desejada: ");
				opcao = recebeDados.nextInt();
				
				switch (opcao) {
				case 1:
					recebeDados.nextLine();
					System.out.println("Informe o nome: ");
					nome = recebeDados.nextLine();
					fila.add(nome);
					System.out.println("Fila: ");
					for (int i = 0; i <= fila.size(); i ++) {
					}
					for (String ifila : fila) {
						System.out.println(ifila);
					}
						System.out.println("\nCliente Adicionado! ");
					break;
				case 2:
					if(fila.isEmpty()) {
						System.out.println("A Fila está vazia, favor informar um nome!");
					}else {
						System.out.println("Lista de Clientes na Fila: ");
						for (String ifila : fila) {
							System.out.println(ifila);
						}
					}
					break;
				case 3:
					if(fila.isEmpty()) {
						System.out.println("A Fila está vazia, favor informar um nome!");
					}else {
						fila.poll();
						System.out.println("Fila: ");
						for (String ifila : fila) {
							System.out.println(ifila);
						}
						System.out.println("O cliente foi Chamado!");
					}
					break;
				case 0:
					System.out.println("Sistema finalizado");
					break;
				default:
				System.out.println("Opção inválida!, Favor informar as opções de 0 até 3");
					break;
				}
			} while (opcao != 0);
		
		} catch (InputMismatchException e) {
			System.out.println("Favor informar um tipo de dado válido");
		}
		recebeDados.close();
	}
}
