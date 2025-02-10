package atividade.entradaSaidaOperadores;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {

		float abono;
		float salario;
		float novoSalario;
		
		Scanner recebeDados = new Scanner (System.in);
		
		System.out.println("Digite o Salário: ");
		salario = recebeDados.nextFloat();		
			
		System.out.println("Digite o Abono: ");
		abono = recebeDados.nextFloat();
		
		novoSalario = salario + abono;

		System.out.println("\n=======================================================");
		System.out.printf("O Salário informado foi: R$ %.2f ", salario);
		System.out.printf("\nO valor do Abono informado foi: R$ %.2f ", abono);
		System.out.printf("\nO valor do novo Salário é de: R$ %.2f ", novoSalario);
		System.out.println("\n=======================================================");

		recebeDados.close();
		
	}
}
