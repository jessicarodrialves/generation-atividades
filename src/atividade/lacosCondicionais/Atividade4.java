package atividade.lacosCondicionais;

import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {
		
		//Escreva um algoritmo em Java, que leia 3 palavras (String), que definem as características de um tipo de animal possível segundo o diagrama abaixo,
		//que deve ser lido da esquerda para a direita.

		String primeiraPalavra;
		String segundaPalavra;
		String terceiraPalavra;
		
		Scanner recebeDados = new Scanner (System.in);
		
		System.out.println("Informe se o animal é: (Vertebrado ou Invertebrado) ");
		primeiraPalavra = recebeDados.nextLine();
		
		System.out.println("Informe se o animal é: (Ave, Mamifero, Inseto, ou Anelideo)");
		segundaPalavra = recebeDados.nextLine();
		
		System.out.println("Informe se o animal é: (Carnivoro, Onivoro, Herbivoro, Hematofago) ");
		terceiraPalavra = recebeDados.nextLine();
		
		
		if("Vertebrado".equals(primeiraPalavra) && ("Ave".equals(segundaPalavra) && ("Carnivoro".equals(terceiraPalavra)))) {
			System.out.println("Águia");
		}else if("Vertebrado".equals(primeiraPalavra) && ("Ave".equals(segundaPalavra) && ("Onivoro".equals(terceiraPalavra)))) {
			System.out.println("Pomba");
		}else if("Vertebrado".equals(primeiraPalavra) && ("Mamifero".equals(segundaPalavra) && ("Onivoro".equals(terceiraPalavra)))) {
			System.out.println("Homem");
		}else if("Vertebrado".equals(primeiraPalavra) && ("Mamifero".equals(segundaPalavra) && ("Herbivoro".equals(terceiraPalavra)))) {
			System.out.println("Vaca");
		}else if("Invertebrado".equals(primeiraPalavra) && ("Inseto".equals(segundaPalavra) && ("Hematofago".equals(terceiraPalavra)))) {
			System.out.println("Pulga");
		}else if("Invertebrado".equals(primeiraPalavra) && ("Inseto".equals(segundaPalavra) && ("Herbivoro".equals(terceiraPalavra)))) {
			System.out.println("Lagarta");
		}else if("Invertebrado".equals(primeiraPalavra) && ("Anelideo".equals(segundaPalavra) && ("Hematofago".equals(terceiraPalavra)))) {
			System.out.println("Sanguessuga");
		}else if("Invertebrado".equals(primeiraPalavra) && ("Anelideo".equals(segundaPalavra) && ("Onivoro".equals(terceiraPalavra)))) {
			System.out.println("Minhoca");
		}
		
		recebeDados.close();
		
	}

}
