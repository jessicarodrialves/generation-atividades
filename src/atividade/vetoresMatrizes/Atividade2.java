package atividade.vetoresMatrizes;

import java.util.Scanner;

public class Atividade2 {
	public static void main(String[] args) {
		
		//Elabore um algoritmo que leia 10 números inteiros e armazene em um vetor. Em seguida, mostre na tela:
		//Todos os elementos dos índices ímpares do vetor 
		//Todos os elementos do vetor que são números pares
		//A Soma de todos os elementos do vetor
		//A Média de todos os elementos do vetor, armazenada em uma variável do tipo real
	
		//Ler 10 numeros inteiros(Scanner)(Sysout entrada dados)(variavel)(for) - OK
		//Vetor(variavel)
		//todos elementos dos indices impares do vetor(variavel impar)
		//todos elementos do vetor que são pares (variavel par)
		//soma de todos elementos (variavel todos elementos)
		//media de todos elementos em uma variavel do tipo real (variavel media do tipo real)
		
		int numeros= 0;
		int somaTodosNumeros = 0;
		double quantidadeTodosNumeros = 0;
		double mediaTodosNumeros = 0;
		int armazenaNumeros []= new int [5]; 
		
		Scanner recebeDados = new Scanner(System.in);
		
		for(int i = 0; i < 5;i++) {
			System.out.println("Digite um numero:");
			numeros = recebeDados.nextInt();
		    armazenaNumeros [i] = numeros;
		    
		    somaTodosNumeros = somaTodosNumeros + numeros;
		    quantidadeTodosNumeros = i+1;
		    mediaTodosNumeros = somaTodosNumeros / quantidadeTodosNumeros;
		}
		
		System.out.println("Par");
		for(int i = 0; i <3; i++) {
			numeros = armazenaNumeros[i];
			if(armazenaNumeros[i] % 2 ==0) {
			System.out.print(armazenaNumeros[i] + " ");
			}
		}
		
		System.out.println("\nImpar");
		for(int i = 0; i <3; i++) {
			if(armazenaNumeros[i] % 2 != 0) {
			System.out.print(armazenaNumeros[i] + " ");
			}
		}
		System.out.println("\nSoma: " + somaTodosNumeros);
		System.out.println("Média: " + mediaTodosNumeros);
		recebeDados.close();
	}
}
