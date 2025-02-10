package atividade.lacosRepeticao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		
		//WHILE
		
		//Escreva um algoritmo em Java, que leia a idade de várias pessoas (números inteiros),
		//via teclado e mostre na tela o total de pessoas cuja idade seja menor que 21 anos 
		//e o total de pessoas cuja idade seja maior que 50 anos. 
		//A leitura dos dados deve ser finalizada ao digitar uma idade negativa.
		//Veja o exemplo abaixo:
	
		int idade = 1;
		int totalPessoasMenor21 = 0;
		int totalPessoasMaior50 = 0;

		
		Scanner recebeDados = new Scanner(System.in);
		try {
			while(idade >= 0 ) {
								
				System.out.println("Digite uma idade: ");
				idade = recebeDados.nextInt();
				
				if(idade <= 21 && idade > 0) {
				 totalPessoasMenor21 = totalPessoasMenor21+1;
				 
				}else if(idade >= 50) {
					totalPessoasMaior50 = totalPessoasMaior50 + 1;
				}
			}
			System.out.println("total de pessoas menores de 21 anos: " + totalPessoasMenor21);
			System.out.println("Total de pessoas maiores de 50 anos: " + totalPessoasMaior50);
			
		} catch (InputMismatchException e) {
			System.out.println("Favor inserir numero " );
		}
		recebeDados.close();
	}
}
