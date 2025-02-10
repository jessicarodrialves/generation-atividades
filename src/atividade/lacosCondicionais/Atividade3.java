package atividade.lacosCondicionais;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		
		//Para doar sangue é necessário ter entre 18 e 69 anos de idade.
		//Pessoas com idade entre 60 e 69 anos, só podem doar se não for a sua primeira doação. 
		//Escreva um Algoritmo em Java que obtenha via teclado o nome do doador (String),
		//a idade (inteiro) do doador 
		//e se é a primeira doação (boolean).
		//De acordo com as Regras para a doação, mostre na tela se o doador está Apto ou Não Apto para doar sangue.
		//Veja os exemplos abaixo:
		
		int idade;
		String nome;
		boolean doacao;
		
		Scanner recebeDados = new Scanner(System.in);
		
		System.out.println("Informe o seu nome:");
		nome = recebeDados.nextLine();
				
		System.out.println("Informe sua idade: ");
		idade = recebeDados.nextInt();
		
		
		System.out.println("Informe se é sua primeira vez que está doando: (true ou false)");
		doacao = recebeDados.nextBoolean();	
		
		if (idade >= 60 && idade <= 69 && doacao == true) {
			System.out.println(nome + " não está apto para doar sangue!");
		}else if (idade >= 18 && idade <= 59 && doacao == true) {
			System.out.println(nome + " está apto para doar sangue!");
		}else if (idade < 18 && doacao == false) {
			System.out.println(nome + " não está apto para doar sangue!");
		}else if(idade >= 60 && idade <= 69 && doacao == false){
			System.out.println(nome + " está apto para doar sangue!");
		}
		recebeDados.close();

	}

}
