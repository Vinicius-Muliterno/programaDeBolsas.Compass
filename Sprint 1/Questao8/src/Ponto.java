/*	8 � Escreva um programa Java que tem como objetivo validar se um usu�rio e senha existem
	no sistema. Se o usu�rio e senha tiver corretos, o usu�rio dever� receber uma mensagem de 
	acordo com o hor�rio. 
	� Se for das 6h as 11h59 da manh�, receber� �Bom dia, voc� se logou ao nosso sistema.�
	� Se for das 12 has 17h59 da tarde, receber� �Boa tarde, voc� se logou ao nosso sistema.�
	� Se for das 18h as 23h59 da manh�, receber� �Boa noite, voc� se logou ao nosso sistema.�
	� Se for das 0h as 05h59 da madrugada, receber� �Boa madrugada, voc� se logou ao nosso 
	sistema.�
	� Se o usu�rio ou senha for inv�lidos, dever� exibir a mensagem: �Usu�rio e/ou senha 
	incorretos.�
	Utilizem arrays para armanezar os dados.

  
 */

import java.util.Scanner;
public class Ponto {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);	
		
		Usuario usuario = new Usuario();
	
			System.out.println("Sistema de ponto!");
			System.out.println("Cadrastrar Usu�rio: Digite 1 ");
			System.out.println("login de Usu�rio:   Digite 2 ");
			System.out.println("Sair do sistema:    Digite 3 \n");
			
			System.out.println("Digite uma op��o :");
			int numero = input.nextInt();
			
			switch (numero) {
			
			
			case 1:
				
				System.out.println("Qual o nome do usu�rio: ");
				usuario.nome = input.nextLine();
				System.out.println("Qual a senha do usu�rio: ");
				String senha = input.nextLine();
				
				
				break;
				
			case 2:
				
				System.out.println("login do usu�rio! ");
				System.out.println("Qual o nome do Usuario: ");
				System.out.println("Qual o nome do Senha: ");
				
				break;
				
			case 3:
				
				//sair = false;
				
			default:
				System.out.println("Obrigado por utilizar o sistema.");
				break;
				
			}
			input.close();
		
		
		

	}

}
