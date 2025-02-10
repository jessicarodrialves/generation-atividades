package atividade.vetoresMatrizes;

public class Atividade3 {

	public static void main(String[] args) {
		
		/*Elabore um algoritmo que leia uma Matriz 3x3 de números inteiros e em seguida, mostre na tela:
			Todos os elementos da Diagonal Principal
			Todos os elementos da Diagonal Secundária
			A Soma de todos os elementos da Diagonal Principal
			A Soma de todos os elementos da Diagonal Secundária
		*/
		int totalDiagonal1 = 0;
		int totalDiagonal2 = 0;
		int matriz[][]= {{1,2,3},{4,5,6},{7,8,9}};
		
		for(int linha = 0; linha < 3; linha++) {
			System.out.println("linha = " + linha + " coluna = "+ linha + " Valor posição: "+matriz[linha][linha]);
			totalDiagonal1 = totalDiagonal1 + matriz[linha][linha];
			}
		System.out.println("========================================================");
		System.out.println("A soma total da diagonal principal é: " + totalDiagonal1);
		System.out.println("========================================================");

		for(int linha = 0;linha <= 3;linha ++) {
			for (int coluna = 3; coluna >= 0; coluna--) {
				if(linha + coluna == 2 ) {
					System.out.println("linha = " + linha + " coluna = "+ coluna + " Valor posição: "+matriz[linha][coluna]);
					totalDiagonal2 = totalDiagonal2 + matriz[linha][coluna];
				}
			}
		}
		System.out.println("========================================================");
		System.out.println("A soma total da diagonal secundaria é: " + totalDiagonal2);
		System.out.println("========================================================");
		}
	}

