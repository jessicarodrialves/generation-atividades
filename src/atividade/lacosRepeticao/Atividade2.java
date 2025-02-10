package atividade.lacosRepeticao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		
		//FOR
		
		//Escreva um algoritmo em Java, que leia 10 números inteiros via teclado 
		//e mostre na tela quantos números são pares e quantos número são ímpares.
		//Veja o exemplo abaixo:
		
		int numero = 0;
		int numeroPar =0;
		int numeroImpar=0;
		int i;
		
		Scanner recebeDados = new Scanner (System.in);
		
		try {
					
			for(i = 1; i < 11; i++) {		
				System.out.print("Digite o " + i + "º"+" numero: ");
				numero = recebeDados.nextInt();
				if(numero % 2 == 0) {
					numeroPar = numeroPar + 1 ;
				}else if(numero % 2 != 0){
					numeroImpar = numeroImpar + 1;
				}
			}
			System.out.println("numero par: " + numeroPar );
			System.out.println("numero impar: " + numeroImpar );
		} catch (InputMismatchException e) {
			System.out.println("Favor inserir numero " );
		}
		recebeDados.close();
	}
}
