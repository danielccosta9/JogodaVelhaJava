package jogovelha;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    	  
		Scanner ler = new Scanner(System.in);
		Interface jogo = new Tabuleiro();
		String posicao;
		int valida = 0, Jogada = 0;

		while(true){
			System.out.println("********** Jogo da Velha - Refatorado ***********");
			jogo.mostrarTabuleiro();

			do {
				System.out.println("Jogador 1, Entre com uma posição: ");
				posicao = ler.next();
				while(!jogo.posicaoTabela(posicao)){
					System.out.println("Jogada invalida, tente outra posicao!!!");
					System.out.println("Jogador 1, Entre com uma posição: ");
					posicao = ler.next();
					valida  = 0;
				}
				jogo.jogadasPosicao(posicao, "X");
				valida = 1;
			}while(valida == 0);

			Jogada++;
			valida = 0;
			jogo.mostrarTabuleiro();

			if(!jogo.ganhador(Jogada).equals("null")){
				break;
			}
			do {
				System.out.println("Jogador 2, Entre com uma posição: ");
				posicao = ler.next();
				while(!jogo.posicaoTabela(posicao)){
					System.out.println("Jogada invalida, tente outra posicao!!!");
					System.out.println("Jogador 2, Entre com uma posição: ");
					posicao = ler.next();
					valida  = 0;
				}
				jogo.jogadasPosicao(posicao, "O");
				valida = 1;
			}while(valida == 0);

			Jogada++;
			valida = 0;
			jogo.mostrarTabuleiro();
			
			if(!jogo.ganhador(Jogada).equals("null")){
				break;
			}
		}
		System.out.println("O "+jogo.ganhador(Jogada) + " ganhou!!!!!");
	}
}
