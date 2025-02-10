package atividade.lacosCondicionais;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		
		//Faça um algoritmo em Java que leia 3 valores inteiros A, B e C
		//e imprima na tela se a soma de A + B é maior, menor ou igual a C.
		
		Scanner recebeDados = new Scanner(System.in);
		int a;
		int b;
		int c;
		int soma;
				
		try {
					
			System.out.println("Digite o numero da opção A: ");
			a = recebeDados.nextInt();
			
			System.out.println("Digite o numero da opção B: ");
			b = recebeDados.nextInt();
			
			System.out.println("Digite o número da opção C: ");
			c = recebeDados.nextInt();
			
			soma = a + b;				
			
			if (soma > c) {
				System.out.println(b + "+"+ a +"=" + soma + ">" +  c );
				System.out.println("A Soma de A + B é Maior do que C");
			}else if(soma < c) {
				System.out.println(b + "+"+ a +"=" + soma + "<" +  c );
				System.out.println("A Soma de A + B é Menor do que C ");
			}else {
				System.out.println(b + "+"+ a +"=" + soma + "=" +  c );
				System.out.println("A soma de A + B é Igual a C " + soma);
			}
		} catch (InputMismatchException e) {
			System.out.println("Tipo de dado inválido, informe apenas números");
		}
				
		recebeDados.close();
		
	}
}
