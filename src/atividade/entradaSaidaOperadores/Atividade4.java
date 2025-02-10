package atividade.entradaSaidaOperadores;

import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {

		float numero1;
		float numero2;
		float numero3;
		float numero4;
		float diferenca; 

		Scanner recebeDados = new Scanner (System.in);
		
		System.out.println("Digite a numero1: ");
		numero1 = recebeDados.nextFloat();
		
		System.out.println("Digite a numero2: ");
		numero2 = recebeDados.nextFloat();
		
		System.out.println("Digite a numero3: ");
		numero3 = recebeDados.nextFloat();
		
		System.out.println("Digite a numero4: ");
		numero4 = recebeDados.nextFloat();
			
		diferenca= (numero1*numero2) - (numero3*numero4);
		
		System.out.println("\n=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=");
		System.out.printf("A diferença é: %.1f",diferenca);
		System.out.println("\n=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=");

		recebeDados.close();
	}

}
