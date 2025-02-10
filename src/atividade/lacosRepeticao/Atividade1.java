package atividade.lacosRepeticao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		
		//FOR
		
		//Escreva um algoritmo em Java, que leia 2 números inteiros via teclado,
		//onde o primeiro número deve ser menor do que o segundo número. 
		//Caso contrário, deve ser exibida uma mensagem na tela informando que o intervalo é inválido e sair do programa.
		//No intervalo informado, mostre na tela todes os números que são múltiplos de 3 e 5. Veja os exemplos abaixo:

		int numero1;
		int numero2;
		int i;
		
		Scanner recebeDados = new Scanner(System.in);
		
		try {
			System.out.println("Digite o primeiro numero:");
			numero1 = recebeDados.nextInt();
			
			System.out.println("Digite o segundo numero:");
			numero2 = recebeDados.nextInt();
			
			if(numero1 < numero2) {
				for(i = numero1; i < numero2; i ++) {
					if(i % 3 == 0 && i % 5 == 0) {
						System.out.println( i + " É multiplo de 3 e 5");
					}
				}
				System.out.println("Intervalo inválido!!");
			}
		} catch (InputMismatchException e) {
			System.out.println("Tipo de dado inválido, favor informar um número!");
		}
		recebeDados.close();
	}
}
