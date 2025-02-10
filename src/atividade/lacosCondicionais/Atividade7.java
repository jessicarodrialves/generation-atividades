package atividade.lacosCondicionais;

import java.util.Scanner;

public class Atividade7 {
	
	public static void main(String[] args) {
		
	    //Com base na tabela abaixo, escreva um algoritmo em Java, que simule uma Calculadora simples. 
		//O programa deverá ler dois números float: numero1 e numero2,
		//e na sequência ler o Código da operação matemática (número inteiro de 1 a 4).
		//A seguir, mostre na tela o resultado da operação entre os 2 números.
		//Caso a operação seja diferente do intervalo 1 a 4, mostre a mensagem Operação Inválida

		
		float numero1;
		float numero2;
		int operacaoMatematica;
		float calculo;
		
		Scanner recebeDados = new Scanner (System.in);
		
		System.out.println("Digite o 1º número: ");
		numero1 = recebeDados.nextFloat();
		
		System.out.println("Digite o 2º número: ");
		numero2 = recebeDados.nextFloat();
		
		System.out.println("Digite o número da operação: ");
		
		System.out.println("1 - Soma");
		System.out.println("2 - Subtração");
		System.out.println("3 - Multiplicação");
		System.out.println("4 - Divisão");
		operacaoMatematica = recebeDados.nextInt();
		
		switch (operacaoMatematica) {
		case 1:
			calculo = numero1 + numero2;
			System.out.println(numero1 + " + " + numero2 +" = " + calculo);
			break;
			
		case 2:
			calculo = numero1 - numero2;
			System.out.println(numero1 + " + " + numero2 +" = " + calculo);
			
			break;
		case 3:			
			calculo = numero1 * numero2;
			System.out.println(numero1 + " + " + numero2 +" = " + calculo);
		
			break;
		case 4:
			calculo = numero1 / numero2;
			System.out.println(numero1 + " + " + numero2 +" = " + calculo);
			break;

		default:
			System.out.println("Opção inválida! Favor digitar um número válido (1 a 4)");
			break;
		}
		
		recebeDados.close();
	}

}
