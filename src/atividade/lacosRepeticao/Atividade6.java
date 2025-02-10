package atividade.lacosRepeticao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Atividade6 {

	public static void main(String[] args) {
		
		//DO WHILE
		
		//Escreva um algoritmo em Java, que leia números inteiros via teclado, até que o número zero seja digitado.
		//Ao final, mostre na tela a média de todos os números digitados, que sejam múltiplos de 3. Veja o exemplo abaixo:
		
		int numero = 0;
		double soma = 0;
		double media = 0;
		int quantidadeNumero = 0;
		
		Scanner recebeDados = new Scanner(System.in);
		try {
			do {
				System.out.println("Informe um numero: ");
				numero = recebeDados.nextInt();
				
				if (numero % 3 == 0 && numero != 0) {
					soma = soma + numero;
					quantidadeNumero = quantidadeNumero + 1;
					media = soma / quantidadeNumero;
				}
			} while (numero != 0);
		
			System.out.println(" Média: " + media);
		
		} catch (InputMismatchException e) {
			System.out.println("Tipo de dado inválido, favor informar um número!");	
		}
		recebeDados.close();
	}
}
