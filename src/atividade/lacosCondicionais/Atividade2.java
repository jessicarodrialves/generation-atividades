package atividade.lacosCondicionais;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		
		//Escreva um algoritmo em Java, que leia um número inteiro via teclado e
		//mostre na tela uma mensagem indicando se este número é par ou ímpar 
		//e se o número é positivo ou negativo. Veja os exemplos abaixo:

		int numero;
		
		Scanner recebeDados = new Scanner(System.in);
		
		System.out.println("Informe um número: ");
		numero = recebeDados.nextInt();
		
		if(numero % 2 == 0 && numero < 0) {
			System.out.println("Numero" + numero + "par e negativo");
		}else if (numero % 2 == 0 && numero > 0) {
			System.out.println("Numero "+ numero +" par e positivo!");
		}else if(numero % 2 != 0 && numero < 0) {
			System.out.println("Numero " + numero +" impar e negativo");
		}else if(numero % 2 != 0 && numero > 0) {
			System.out.println("Numero " + numero +" impar e positivo");

		}
		
		recebeDados.close();
		
	}
		
}
