package atividade.lacosCondicionais;

import java.util.Scanner;

public class Atividade6 {

	public static void main(String[] args) {

		//Com base na tabela abaixo, escreva um algoritmo em Java que leia o Nome do Colaborador (String),
		//o Código do Cargo do Colaborador (número inteiro de 1 a 6) 
		//e o Salário (número float). 
		//A seguir, mostre na tela o Nome do Colaborador, o Cargo e o novo Salário reajustado.
		
		String nomeColaborador;
		int codigoCargo;
		float salario;
		
		Scanner recebeDados = new Scanner(System.in);
		
		System.out.println("Informe seu nome: ");
		nomeColaborador = recebeDados.nextLine();
		
		System.out.println("Informe seu codigo: ");
		System.out.println("1 - Gerente ");
		System.out.println("2 - Vendedor ");
		System.out.println("3 - Supervisor ");
		System.out.println("4 - Motorista ");
		System.out.println("5 - Estoquista ");
		System.out.println("6 - Técnico de TI ");

		
		codigoCargo = recebeDados.nextInt();
		
		System.out.println("Informe seu salário:");
		salario = recebeDados.nextFloat();

		switch (codigoCargo) {
		case 1:
			System.out.println("Nome do colaborador: " + nomeColaborador);
			System.out.println("Cargo: Gerente");
			System.out.printf("Salário %.2f" ,((salario * 10 )/100 + salario));
			break;
		case 2:
			System.out.println("Nome do colaborador: " + nomeColaborador);
			System.out.println("Cargo: Vendedor");
			System.out.printf("Salário %.2f" ,((salario * 7 )/100 + salario));
					
			break;
		case 3:
			System.out.println("Nome do colaborador: " + nomeColaborador);
			System.out.println("Cargo: Supervisor");
			System.out.printf("Salário %.2f" ,((salario * 9 )/100 + salario));
					
			break;
		case 4:
			System.out.println("Nome do colaborador: " + nomeColaborador);
			System.out.println("Cargo: Motorista");
			System.out.printf("Salário %.2f" ,((salario * 6 )/100 + salario));
			
			break;
		case 5:
			System.out.println("Nome do colaborador: " + nomeColaborador);
			System.out.println("Cargo: Estoquista");
			System.out.printf("Salário %.2f" ,((salario * 5 )/100 + salario));
			
			break;
		case 6:
			System.out.println("Nome do colaborador: " + nomeColaborador);
			System.out.println("Cargo: Técnico de TI");
			System.out.printf("Salário %.2f" ,((salario * 8 )/100 + salario));
			
			break;
										
		default:
			System.out.println("Opção Inválida!");
			
		}
		recebeDados.close();
	}

}
