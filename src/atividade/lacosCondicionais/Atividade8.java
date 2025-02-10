package atividade.lacosCondicionais;

import java.util.Scanner;

public class Atividade8 {

	public static void main(String[] args) {
		//Desenvolva um algoritmo em Java para uma conta bancária. 
		//O programa deverá ler o tipo de operação a ser realizada com base na tabela abaixo (número inteiro entre 1 e 3) 
		//e o valor a ser depositado ou sacado (somente nas opções 2 e 3). 
		//Considere que um saque só pode ser realizado caso haja saldo suficiente.
		//Ao final de cada operação, exiba o novo Saldo na tela. A variável saldo (float), será inicializada com o valor de R$ 1000.00. 
		//Caso a operação seja diferente do intervalo 1 a 3, mostre a mensagem Operação Inválida!
		
		int numero;
		float valorSaque;
		float valorDeposito;
		float saldo = 1000.00f;
		
		Scanner recebeDados = new Scanner (System.in);
		
		System.out.println("Digite o número da opção desejada: ");
		System.out.println("1 - Saldo ");
		System.out.println("2 - Saque ");
		System.out.println("3 - Depósito ");
		numero = recebeDados.nextInt();
		
		switch (numero) {
		case 1:
			System.out.println("Saldo: R$ " + saldo);
			break;
			
		case 2:
			System.out.println("Informe o valor do saque: ");
			valorSaque = recebeDados.nextFloat();
			
			if(valorSaque <= saldo) {
				saldo = saldo - valorSaque;
				System.out.println("Novo Saldo "+ saldo);
			}else {
				System.out.println("Saldo Insuficiente!");
			}
			break;

		case 3:
			System.out.println("Informe o valor a ser depositado: ");
			valorDeposito = recebeDados.nextFloat();
			
			saldo = saldo + valorDeposito;
			System.out.println("Novo Saldo "+ saldo);
			break;

		default:
			System.out.println("Operação Inválida! Favor digitar as opções de (1 a 3)");
			break;
		}
		recebeDados.close();
	}

}
