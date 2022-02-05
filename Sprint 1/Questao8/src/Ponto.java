/*	8 – Escreva um programa Java que tem como objetivo validar se um usuário e senha existem
	no sistema. Se o usuário e senha tiver corretos, o usuário deverá receber uma mensagem de 
	acordo com o horário. 
	• Se for das 6h as 11h59 da manhã, receberá “Bom dia, você se logou ao nosso sistema.”
	• Se for das 12 has 17h59 da tarde, receberá “Boa tarde, você se logou ao nosso sistema.”
	• Se for das 18h as 23h59 da manhã, receberá “Boa noite, você se logou ao nosso sistema.”
	• Se for das 0h as 05h59 da madrugada, receberá “Boa madrugada, você se logou ao nosso 
	sistema.”
	• Se o usuário ou senha for inválidos, deverá exibir a mensagem: “Usuário e/ou senha 
	incorretos.”
	Utilizem arrays para armanezar os dados.

  
 */

import java.util.Scanner;
public class Ponto {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);	
		
		Usuario usuario = new Usuario();
	
			System.out.println("Sistema de ponto!");
			System.out.println("Cadrastrar Usuário: Digite 1 ");
			System.out.println("login de Usuário:   Digite 2 ");
			System.out.println("Sair do sistema:    Digite 3 \n");
			
			System.out.println("Digite uma opção :");
			int numero = input.nextInt();
			
			switch (numero) {
			
			
			case 1:
				
				System.out.println("Qual o nome do usuário: ");
				usuario.nome = input.nextLine();
				System.out.println("Qual a senha do usuário: ");
				String senha = input.nextLine();
				
				
				break;
				
			case 2:
				
				System.out.println("login do usuário! ");
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
