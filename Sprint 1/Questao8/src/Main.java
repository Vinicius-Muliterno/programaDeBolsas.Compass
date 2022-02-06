/*	8 – Escreva um programa Java que tem como objetivo validar se um usuário e senha existem
	no sistema. Se o usuário e senha tiver corretos, o usuário deverá receber uma mensagem de 
	acordo com o horário. 
	• Se for das 6h às 11h59 da manhã, receberá “Bom dia, você se logou ao nosso sistema.”
	• Se for das 12 as 17h59 da tarde, receberá “Boa tarde, você se logou ao nosso sistema.”
	• Se for das 18h as 23h59 da manhã, receberá “Boa noite, você se logou ao nosso sistema.”
	• Se for das 0h as 05h59 da madrugada, receberá “Boa madrugada, você se logou ao nosso 
	sistema.”
	• Se o usuário ou senha for inválidos, deverá exibir a mensagem: “Usuário e/ou senha 
	incorretos.”
	Utilizem arrays para armazenar os dados.

 * 
 */
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Usuarios> usuarios = new ArrayList<Usuarios>();
		Scanner scan = new Scanner(System.in);
		
		int opcao = 0;
		
		while (opcao != 3) {
			
			System.out.println(
					"-----------------------------------------" + "\n" + 
	                 "BEM VINDO AO SISTEMA LOGIN" + "\n" +
	                 "----------------------------------------" + "\n" +
	                 "DIGITE A OPÇÃO DESEJADA: " + "\n" +
	                 "[1] Para cadastrar usuário" + "\n" + 
	                 "[2] Para Login do Usuário" + "\n" + 
	                 "[3] Para sair." + "\n" +
	                 "-----------------------------------------");
			
			opcao= scan.nextInt();
			
			switch (opcao) {
			
			case 1: {
				System.out.println();
				System.out.println("Cadastre um novo login: ");
				String login = scan.next();
				System.out.println("Cadastre uma nova senha: ");
				String senha = scan.next();
				usuarios.add(new Usuarios(login, senha));
				System.out.println("Usuário criado.\n");
				break;
			}
			
			case 2: {
				if (usuarios.isEmpty()) {
					System.out.println("Nenhum usuario cadastrado no sistema, "
										+ "primeiro cadastre um usuario.\n");
				} 
				else{
						System.out.println();
						System.out.println("Digite seu login: ");
						String tempLogin = scan.next();
						
						int index = -1;
						
						for (int j = 0; j < usuarios.size(); j++) {
							if (usuarios.get(j).getLogin().equalsIgnoreCase(tempLogin)) {
								index = j;
							}
						}
						
						if (index >= 0) {
							System.out.println("Digite sua senha: ");
							String senha = scan.next();
							if (usuarios.get(index).getSenha().equals(senha)) {
								loginMsg();
								opcao = 3;
							} else {
								System.out.println("Senha invalida, tente novamente.");
								
								break;
							}
						} else {
							System.out.println("O login não existe. Tente novamente.");
						}
					}
					break;
			}
			
			case 3: {
				System.out.println("O Sistema foi encerrado.");
				break;
			}
			
			default:
				System.out.println("Opção inválida. Tente novamente: ");
			}
			
		}
		
		scan.close();
	}

	public static void loginMsg() {
		LocalTime horarioAtual = LocalTime.now();
		
		if (horarioAtual.isBefore(LocalTime.of(6, 0, 0))) {
			System.out.println("Boa madrugada, você se logou ao nosso sistema.");
		} 
		else if (horarioAtual.isBefore(LocalTime.of(12, 0, 0))) {
			System.out.println("Bom dia, você se logou ao nosso sistema.");
		} 
		else if (horarioAtual.isBefore(LocalTime.of(18, 0, 0))) {
			System.out.println("Boa tarde, você se logou ao nosso sistema.");
		} 
		else {
			System.out.println("Boa noite, você se logou ao nosso sistema.");
		}
	
	}
}
