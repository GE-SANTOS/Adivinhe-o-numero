package jogo;

import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;

public class JogodoAdivinha {

	public static void main(String[] args) {
		
				PrintStream show = System.out;
				@SuppressWarnings("resource")
				Scanner scan = new Scanner(System.in);
				Random gerador = new Random();
				
				int opcao;
				int escolha_computador;
				int escolha_usuario;
				
				
				show.println("Ol�! Qual o seu nome?");
				String nome = scan.nextLine();
				show.println("Prazer em conhece-lo " + nome +"!");
				show.println(nome +", voc� est� pronto pra jogar?");
				show.println("\nInforme o n�mero da sua op��o.\n\n 1 -> Sim \n 2 -> N�o \n");
				opcao = scan.nextInt();
				
				if(opcao == 2) {
					
					show.println("Tranquilo! Jogamos na proxima!!!");	
				}else if(opcao == 1) {
					
					show.println("\nOk! O jogo � assim...");
					show.println("Eu vou pensar em um n�mero de 0 a 11.");
					show.println("E voc� ter� que adivinhar!");
					show.println("Se voc� conseguir adivinhar em qual n�mero pensei");
					show.println("Voc� ser� o vecendor!!!");
					
					escolha_computador = gerador.nextInt(11);
				
					do {
						escolha_usuario = scan.nextInt();
						if(escolha_usuario != escolha_computador){
							show.println("Resposta errada!");
							show.println("Tente outra vez.");
							
					   }else{
						    show.println("Parab�ns! Voc� acertou!");
					   }
					
					}while(escolha_computador != escolha_usuario);
					
				}
			
			}
			
		}


