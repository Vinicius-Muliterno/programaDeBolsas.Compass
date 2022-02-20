/*10 – Emoticons são símbolos usados para expressar o sentimento de quem escreve uma
mensagem. Scott Fahlman, um professor de uma universidade americana, foi o primeiro a
propor o uso das sequências de caracteres :-) e :-(, que viraram respectivamente símbolos
para “divertido” e “chateado”.
Nosso cliente, está criando uma aplicação que basicamente quer saber como seus
funcionários estão se sentindo baseado nos emoticons citados acima e digitados por eles.
Dada uma mensagem composta por uma cadeia de caracteres, escreva um programa para
determinar o sentimento expresso na mensagem. O seu programa deve usar a classe
Scanner para ler uma linha de entrada e a partir dessa linha devolver o sentimento expresso e salvar no banco de dados.
a) neutro: se o número de símbolos “divertido” é igual ao número de símbolos “chateado”
b) divertido: se o número de símbolos “divertido” é maior do que número de símbolos
“chateado”
c) chateado: se o número de símbolos “chateado” é maior do que número de símbolos
“divertido”.
Exemplos de entrada/saida:
Entrada: Achei o filme muito divertido.
Saída: neutro
Entrada: :-):-(:-(:-)
Saída: neutro
Entrada: Sonhei com Java. :-( (vou estudar).
Saída: chateado
 * 
 */
package Questao10;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println(" ********** Sentimentos dos funcionarios! ********** ");
		System.out.println(" Feliz  = :-) ");
		System.out.println(" Triste = :-(");
		System.out.println("Digite um emoticons para cada funcionario e seu sentimento: ");
		String humor = input.nextLine();
	
		System.out.println(TestaHumor.testaHumor(humor));
	
		input.close();
	}

}