package atividade.lacosRepeticao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {
		
		//Uma empresa desenvolveu uma pesquisa interna para conhecer os colaboradores da área de Desenvolvimento e precisam de um sistema para analisar os dados.
		//Escreva um algoritmo em Java, que leia via teclado as seguintes informações de cada colaborador:
		
		int idade = 0;
		int genero = 0;
		int desenvolvedor = 0;
		String opcao = "";
		double quantidadeTotalPessoas = 0;
		double mediaTotalPessoas = 0;
		int armazenaMulherCisTransFrontend = 0;
		int armazenaHomemCisTransMobileAcima40 = 0;
		int armazenaNaoBinarioFullStack = 0;
		int desenvolvedorBackend = 0;
		int somaIdadePessoas = 0;
		
		Scanner recebeDados = new Scanner(System.in);

		try {
		
			while(!opcao.equals("N")) {
				
				System.out.println("Informe sua idade: ");
				idade = recebeDados.nextInt();
				
				System.out.println("Digite a opção do genero: ");
				System.out.println("1 - Mulher Cis");
				System.out.println("2 - Homem Cis");
				System.out.println("3 - Não Binário");
				System.out.println("4 - Mulher Trans");
				System.out.println("5 - Homem Trans");
				System.out.println("6 - Outros");
				genero = recebeDados.nextInt();
	
				System.out.println("Informe a categoria: ");
				System.out.println("1 - Backend");
				System.out.println("2 - Frontend");
				System.out.println("3 - Mobile");
				System.out.println("4 - FullStack");
				desenvolvedor = recebeDados.nextInt();
				recebeDados.nextLine();
				
				somaIdadePessoas = somaIdadePessoas + idade ;
				quantidadeTotalPessoas = quantidadeTotalPessoas + 1;
				mediaTotalPessoas = somaIdadePessoas / quantidadeTotalPessoas;
				
				//número de Mulheres Cis e Trans desenvolvedoras Frontend 
				if((genero == 1 || genero == 4) && desenvolvedor == 2) {
					armazenaMulherCisTransFrontend = armazenaMulherCisTransFrontend +1;
				}
				
				//número de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos
				else if ((genero == 2 || genero == 5) && desenvolvedor == 3 && idade > 40){
					armazenaHomemCisTransMobileAcima40 = armazenaHomemCisTransMobileAcima40 +1;
				}
				
				//número de Não Binários desenvolvedores FullStack menores de 30 anos
				else if(genero == 3 && desenvolvedor == 4 && idade < 30) {
					armazenaNaoBinarioFullStack = armazenaNaoBinarioFullStack + 1;
				}
				
				//número de pessoas desenvolvedoras Backend
				else if(desenvolvedor == 1) {
					desenvolvedorBackend = desenvolvedorBackend + 1;
				}
				
				System.out.println("Voce deseja confirmar a leitura dos dados de um novo colaborador (S/N): ");
				opcao = recebeDados.nextLine();
							
				if(opcao.equals("N")) {
					System.out.println("O número de pessoas desenvolvedoras Backend " + desenvolvedorBackend);
					System.out.println("O número de Mulheres Cis e Trans desenvolvedoras Frontend " + armazenaMulherCisTransFrontend );
					System.out.println("O número de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos " +armazenaHomemCisTransMobileAcima40 );
					System.out.println("O número de Não Binários desenvolvedores FullStack menores de 30 anos " + armazenaNaoBinarioFullStack );
					System.out.println("O número total de pessoas que responderam à pesquisa " + quantidadeTotalPessoas);
					System.out.println("A média de idade das pessoas que responderam à pesquisa " + mediaTotalPessoas);
				}
			}
		} catch (InputMismatchException e) {
			System.out.println("Tipo de dado inválido, favor informar um número!");
		}
		recebeDados.close();
	}
}
