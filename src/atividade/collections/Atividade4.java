package atividade.collections;

import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

public class Atividade4 {

	public static void main(String[] args) {

		//Escreva um programa Java para criar uma Collection Set de Objetos da Classe Wrapper Integer, inicializada com 10 valores inteiros. - ok
		//O programa deverá solicitar ao usuário, que ele digite via teclado 1 número inteiro e - ok
		//caso ele seja encontrado no Set, exiba na tela a mensagem: Número 00 Encontrado! -ok
		//Caso o número não seja encontrado, ele deverá exibir na tela a mensagem: O número NN não foi encontrado! - ok
		
		int criaNumeros = 0;
		int numeroUsuario = 0;
		Set<Integer> numeros = new HashSet<Integer>();
		Scanner recebeDados = new Scanner(System.in);
		
		for(int i = 0; i < 10; i++) {
			criaNumeros = criaNumeros + 1;
			numeros.add(criaNumeros);
		}
		
		try {
			System.out.println("Digite o numero que deseja encontrar: ");
			numeroUsuario = recebeDados.nextInt();
			
		} catch (InputMismatchException e) {
			System.out.println("Digite um tipo de dado válido (Número)");
		}
		
		if(numeros.contains(numeroUsuario)) {
			System.out.println("O número " + numeroUsuario + " foi encontrado");
		}else {
			System.out.println("O número " + numeroUsuario + " não foi encontrado");
		}
		recebeDados.close();
	}
}
