package atividade.estruturaDeDados;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Stack;

public class Atividade2 {

	public static void main(String[] args) {
		
		//Escreva um programa contendo uma Collection Stack (Pilha) de Objetos string,para organizar a retirada de livros de uma pilha. 
		//O programa deverá ter um Menu que aceitará as opções 0, 1, 2 e 3:
		//	1: Adicionar um novo livro na pilha. Deve solicitar o nome do livro.
		//	2: Listar todos os livros da Pilha
		//	3: Retirar um livro da pilha 
		//	0: O programa deve ser finalizado. 
		//	Caso a pilha esteja vazia, ao tentar retirar um livro da pilha, o programa deverá informar que a pilha está vazia.
		
		int opcao = 0;
		String nomeLivro = "";
		Stack<String> pilha = new Stack<String>();
		Scanner recebeDados = new Scanner (System.in);
		
		try {
			do {
				System.out.println("*******************************************************");
				System.out.println("1 - Adicionar Livro na Fila");
				System.out.println("2 - Listar todos os os Livros");
				System.out.println("3 - Retirar Livro da Fila");
				System.out.println("0 - Sair");
				System.out.println("*******************************************************\n");
				System.out.println("Entre com a opção desejada: ");
				opcao = recebeDados.nextInt();
				switch (opcao) {
				case 1:
					recebeDados.nextLine();
					System.out.println("Informe o nome do Livro: ");
					nomeLivro = recebeDados.nextLine();
					pilha.push(nomeLivro);
					System.out.println("Pilha:");
					for(String ipilha : pilha) {
						System.out.println(ipilha);
					}
					System.out.println("Livro adicionado!!");
					break;
				case 2:
					System.out.println("Lista de Livros na Pilha: ");
					for(String ilistaPilha : pilha){
						for(int i = 0; i <= pilha.size(); i ++) {
						}
						System.out.println(ilistaPilha);
					}
					break;
				case 3:
						if(pilha.isEmpty()) {
							System.out.println("A Pilha está vazia!!");
						}else {
							pilha.pop();
							System.out.println("Pilha: ");
							for(String ipilha : pilha) {
								System.out.println(ipilha);
								}
							System.out.println("Um Livro foi retirado da pilha!");
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
