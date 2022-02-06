/*7 � Escreva um programa Java que tem como objetivo ser um quis de perguntas e respostas.
	Na tela, voc� perguntar� ao usu�rio e ele responder�. Se o usu�rio acertar ou errar, voc�
	precisa informar se ele acertou ou errou e passar para pr�xima pergunta (enquanto houver
	pr�xima). Utilizem array para guardar as perguntas e respostas.
	No fim do quis, voc� deve apresentar quantas o usu�rio acertou e quantas ele errou, como
	no exemplo abaixo(n�o precisa ser exatamente assim):
	Ex: 
	Usuario XPTO
	Acertos: 6
	Erros: 4
 */

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random rdm = new Random();
		
		int contadorAcertos = 0;
		int contadorErros = 0;
		int gerado = 5;
		int [] numero = new int[5];
		int [] corretos = new int [5];
		int [] errados = new int [5];
		
		System.out.println("***************************************************************");
		System.out.println("Quiz acerte o numero!");
		System.out.println("Digite um numero de 0 a 5");
		System.out.println("Deseja participar do nosso quiz: S/N.");
		char value = input.nextLine().charAt(0);
		value =Character.toUpperCase(value);
						
		if((value == 's') || (value == 'S')) {
			
			
			do {	
				
				System.out.println("Qual o seu nome: ");
				String nome = input.nextLine();
				
				for (int i = 0; i < numero.length; i++) {
					System.out.println("Digite um numero:");
					numero[i] = input.nextInt();
					
					if ((rdm.nextInt(gerado)) == numero[i]) {
						System.out.println("Voc� acertou.\n");
						contadorAcertos++;
						corretos[i] = numero[i];	
					}
					else {
						System.out.println("voc� arrou.");
						contadorErros++;
						errados[i] = numero[i];						
					}
					
				}
				
				System.out.println("\n***********************************************************\n");
				System.out.println("Seu resultado foi:");
				System.out.println("Usuario: " + nome);
				System.out.println("Acertos: " + contadorAcertos);
				System.out.println("Erros: "   + contadorErros );
				System.out.println("Numeros que voc� acertou: " + (Arrays.toString(corretos)) );
				System.out.println("Numeros que voc� errou : "   +  (Arrays.toString(errados)) );
				System.out.println("\n***********************************************************\n");
				
	
				System.out.println("Deseja participar novamente: S/N.");
				value = input.next().charAt(0);
				
					
			}while((value == 's') || (value == 'S'));
			
		}
			
		
		else {
			System.out.println("Obrigado por participar!");
		}
		input.close();
		System.out.println("Obrigado por participar!");
	}

}







