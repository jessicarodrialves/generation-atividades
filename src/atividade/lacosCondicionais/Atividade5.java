package atividade.lacosCondicionais;

import java.util.Scanner;

public class Atividade5 {

	public static void main(String[] args) {
		
		//Com base na tabela abaixo, escreva um algoritmo em Java que leia o código de um item (número inteiro de 1 a 6) 
		//e a quantidade comprada deste item (número inteiro).
		//A seguir, mostre na tela o valor total da conta e o nome do produto que foi comprado.
		
		int codigo;
		int quantidade;
		double valorTotal;
		
		Scanner recebeDados = new Scanner(System.in);
		
		System.out.println("Informe um numero: ");
		System.out.println(" 1 - Cachorro Quente ");
		System.out.println(" 2 - X-Salada");
		System.out.println(" 3 - X-Bacon");
		System.out.println(" 4 - Bauru");
		System.out.println(" 5 - Refrigerante");
		System.out.println(" 6 - Suco de Laranja");
		codigo = recebeDados.nextInt();
		
		System.out.println("Informe a quantidade: ");
		quantidade = recebeDados.nextInt();
		
		
		switch (codigo) {
		case 1:
			valorTotal = 10.00 * quantidade;
			System.out.println("Produto: Cachorro Quente " + "\nValor Total R$"+ valorTotal);
			
			break;
		case 2:
			valorTotal = 15.00 * quantidade;
			System.out.println("Produto: X-Salada " + "\nValor Total R$"+ valorTotal);
			
			break;
		case 3:
			valorTotal = 18.00 * quantidade;
			System.out.println("Produto: X-Bacon " + "\nValor Total R$"+ valorTotal);
			
			break;
		case 4:
			valorTotal = 12.00 * quantidade;
			System.out.println("Produto: Bauru " + "\nValor Total R$"+ valorTotal);
			
			break;
		case 5:
			valorTotal = 8.00 * quantidade;
			System.out.println("Produto: Refrigerante " + "\nValor Total R$"+ valorTotal);
			
			break;
		case 6:
			valorTotal = 13.00 * quantidade;
			System.out.println("Produto: Suco de Laranja " + "\nValor Total R$"+ valorTotal);
			break;

		default:
			System.out.println("Opção inválida, informe as opções de 1 a 6");
			break;
		}

		recebeDados.close();
	}
}
