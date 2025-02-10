package atividade.entradaSaidaOperadores;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		
		Scanner recebeDados = new Scanner (System.in);
		
		float nota1;
		float nota2;
		float nota3;
		float nota4;
		float media;
		
		System.out.println("Digite a nota1: ");
		nota1 = recebeDados.nextFloat();
		
		System.out.println("Digite a nota2: ");
		nota2 = recebeDados.nextFloat();
		
		System.out.println("Digite a nota3: ");
		nota3 = recebeDados.nextFloat();
		
		System.out.println("Digite a nota4: ");
		nota4 = recebeDados.nextFloat();
		
		media= (nota1 + nota2 + nota3 + nota4)/ 4;
		System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=");
		System.out.printf("Média: %.1f", media);
		System.out.println("\n=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=");

		recebeDados.close();
		
	}

}
