package atividade.entradaSaidaOperadores;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		
		float salarioBruto;
		float adicionalNoturno;
		float horaExtra;
		float descontos;
		float salarioLiquido;
		
		Scanner recebeDados = new Scanner (System.in);
	
		System.out.println("Digite o Salário Bruto: ");
		salarioBruto = recebeDados.nextFloat();
		
		System.out.println("Digite o valor do Adicional Noturno: ");
		adicionalNoturno = recebeDados.nextFloat();
		
		System.out.println("Digite a quantidade de Horas Extras: ");
		horaExtra = recebeDados.nextFloat();
		
		System.out.println("Digite o valor do desconto: ");
		descontos = recebeDados.nextFloat();
		
		salarioLiquido = (((salarioBruto + adicionalNoturno) + (horaExtra *5)) + (- descontos)); 
		
		System.out.println("\n=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=");

		System.out.printf("O valor do Salário Líquido é: R$ %.2f", salarioLiquido);

		System.out.println("\n=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=");

		recebeDados.close();

		
	}

}
