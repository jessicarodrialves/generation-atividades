package atividade.collections;

import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Atividade3 {

	public static void main(String[] args) {
		
		//Escreva um programa Java para criar uma Collection Set de Objetos da Classe Wrapper Integer.
		//O programa deverá solicitar ao usuário, que ele digite via teclado 10 valores inteiros não repetidos
		//e adicione-os individualmente na Collection Set.
		//Em seguida, faça o que se pede:
		//Mostre na tela todos os elementos da Collection Set, utilizando a Classe Iterator. 
		//Veja o exemplo abaixo:
		
		
		Set<Integer> numeros = new HashSet<Integer>();
		Scanner recebeDados = new Scanner (System.in);
		
		try {
			for (int i = 0; i < 10; i++) {
				System.out.print("Digite um número não repetido: ");
				numeros.add(recebeDados.nextInt());
			}
		} catch (InputMismatchException e) {
			System.out.println("Digite um tipo de dado válido (Número)");
		}
		
		Iterator<Integer>inumeros = numeros.iterator();

		while(inumeros.hasNext()) {
			System.out.println("Numeros da lista : " + inumeros.next());
		}
		recebeDados.close();
	}
}
