package atividade.lacosRepeticao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Atividade5 {

	public static void main(String[] args) {
		
	//DO WHILE
		
	//Escreva um algoritmo em Java, que leia números inteiros via teclado, até que o número zero seja digitado. 
	//Ao final, mostre na tela a soma de todos os números digitados, 
	//que sejam positivos. Veja o exemplo abaixo:

		int numero = 1;
		int somaNumero = 0;
		Scanner recebeDados = new Scanner(System.in);

		try {
			
			do {			
				System.out.print("Informe um número: ");
				numero = recebeDados.nextInt();
				if(numero > 0) {
				somaNumero = somaNumero + numero;
				}
				
			}while(numero != 0);
			
			System.out.println("Soma de todos numeros positivos é: "+ somaNumero);
		} catch (InputMismatchException e) {
			System.out.println("Favor inserir numero " );
		}
		recebeDados.close();
	}
}
