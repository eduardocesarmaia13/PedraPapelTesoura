package jogo;

import java.util.Random;
import java.util.Scanner;

public class Jogo {

	public static void main(String[] args) {
		
		Scanner verificar = new Scanner(System.in);
		while(true) {
		String[] ppt = {"pedra", "papel", "tesoura"};
		String movimentoPc = ppt[new Random().nextInt(ppt.length)];

		
		String movimentoJogador;
		
		while(true) {
				System.out.println("Escolha sua jogada (pedra, papel ou tesoura)");
				movimentoJogador = verificar.nextLine();
				if (movimentoJogador.equals("pedra") || movimentoJogador.equals("papel") || movimentoJogador.equals("tesoura")) {
					break;
				}
				System.out.println(movimentoJogador + " esta jogada é inválida.");
			}
			
			System.out.println("O computador usou: " + movimentoPc);
			
			if(movimentoJogador.equals(movimentoPc)) {
				System.out.println("O jogo EMPATOU!");
			}
			else if(movimentoJogador.equals("pedra")) {
				if (movimentoPc.equals("papel")) {
					System.out.println("Você PERDEU!");
				}	else if (movimentoPc.equals("tesoura")) {
					System.out.println("Você GANHOU!");
				}
			}
			
			else if(movimentoJogador.equals("papel")) {
				if (movimentoPc.equals("pedra")) {
					System.out.println("Você GANHOU!");
				}	else if (movimentoPc.equals("tesoura")) {
					System.out.println("Você PERDEU!");
				}
			}
			
			else if(movimentoJogador.equals("tesoura")) {
				if (movimentoPc.equals("papel")) {
					System.out.println("Você GANHOU!");
				}	else if (movimentoPc.equals("pedra")) {
					System.out.println("Você PERDEU!");
				}
			}
			System.out.println("Quer jogar novamente? (sim/nao)");
			String jogueNovamente = verificar.nextLine();
			
			if (!jogueNovamente.equals("sim")) {
				System.out.println("Obrigado por jogar, volte sempre!");
				break;
			}
			
			verificar.close();
		}	
	}
}
;