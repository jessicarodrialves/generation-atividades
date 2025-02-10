package atividade.vetoresMatrizes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		//Dado um vetor contendo 10 números inteiros não ordenadose não repetidos,
		//construa um algoritmo que consiga pesquisar dados no vetor, 
		//onde o usuário irá digitar um número e o programa deve exibir na tela a posição deste número no vetor. 
		//Caso o número não seja encontrado, a mensagem: “Não foi encontrado!” deve ser exibida na tela. Veja os exemplos abaixo:

		int numero[] = {2,5,1,3,4,9,7,8,10,6};
		int numeroUsuario;
		boolean achei = false;
		
		Scanner recebeDados = new Scanner(System.in);
		
		try {
			System.out.println("Digite um número que deseja encontrar: ");
			numeroUsuario = recebeDados.nextInt();
					
			for(int i = 0; i < 10; i++) {			
				if(numeroUsuario == numero[i] ) {
					System.out.println("O numero: "+ numero[i]+ " está localizado na posição: " + (i+1));
					achei = true;
				}
			}
			if(achei == false) {
			System.out.println("Não foi encontrado!");
			}
			
		} catch (InputMismatchException e) {
			System.out.println("Tipo de dado inválido, favor informar numero");
		}
		recebeDados.close();
	}
}
