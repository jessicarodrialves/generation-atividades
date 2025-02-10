package atividade.collections;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
	//Escreva um programa Java para criar uma Collection ArrayList de Objetos da Classe Wrapper Integer, inicializada com 10 valores inteiros. - ok
	//O programa deverá solicitar ao usuário, que ele digite via teclado 1 número inteiro e caso ele seja encontrado no ArrayList,
	//exiba na tela a posição deste número na Collection. - ok
	//Caso o número não seja encontrado, ele deverá exibir na tela a mensagem: O número NN não foi encontrado! - ok
		
		ArrayList <Integer> numeros = new ArrayList();
		Scanner recebeDados = new Scanner(System.in);
		
		int numeroUsuario = 0;
		int criaNumeros = 0 ;
		
		for(int i = 0; i < 10;i++) {
			criaNumeros = criaNumeros + 1;
			numeros.add(criaNumeros);
		}
		try {
			System.out.println("Digite um número que deseja encontrar: ");
			numeroUsuario = recebeDados.nextInt();
			
			if(numeros.indexOf(numeroUsuario) == -1) {
				System.out.println("O número " + numeroUsuario +" não existe na lista");
			}else {
				System.out.println("O número " + numeroUsuario+" está na posição: "+ numeros.indexOf(numeroUsuario));  
			}
			} catch (InputMismatchException e) {
				System.out.println("Digite um tipo de dado válido (Número)");
			}
		System.out.println(numeros);
		recebeDados.close();
	}
}
