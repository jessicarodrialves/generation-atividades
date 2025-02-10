package atividade.collections;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {

		//Escreva um programa Java para criar uma Collection ArrayList de Objetos da Classe String.
		//O programa deverá solicitar ao usuário, que ele digite via teclado 5 cores e
		//deverá adicioná-las individualmente no ArrayList. 
		//Em seguida, faça o que se pede:
		//Mostre na tela todas as cores que foram adicionadas. 
		//Mostre na tela todas as cores que foram adicionadas ordenadas em ordem crescente.
		
		ArrayList<String>nomeCor = new ArrayList();
		Integer numero = 5;
		Scanner recebeDados = new Scanner(System.in);
		
		try {
			for(int i = 0; i < 5;i++) {
				System.out.println("Informe a " + (i +1) +"ª" + " cor: ");
				nomeCor.add(recebeDados.next());
			}
		} catch (InputMismatchException e) {
			System.out.println("Digite um tipo de dado válido (Letra)");
		}
			Iterator<String>inome = nomeCor.iterator();
			while (inome.hasNext()) {
				System.out.println("Todas as cores = " + inome.next());
			}
			nomeCor.sort(null);
			Iterator<String>inome2 = nomeCor.iterator();
			while (inome2.hasNext()) {
				System.out.println("Todas as cores ordenadas = " + inome2.next());
			}
		recebeDados.close();
	}
}
