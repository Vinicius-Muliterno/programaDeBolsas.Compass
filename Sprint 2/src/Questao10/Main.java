/*10 � Emoticons s�o s�mbolos usados para expressar o sentimento de quem escreve uma
mensagem. Scott Fahlman, um professor de uma universidade americana, foi o primeiro a
propor o uso das sequ�ncias de caracteres :-) e :-(, que viraram respectivamente s�mbolos
para �divertido� e �chateado�.
Nosso cliente, est� criando uma aplica��o que basicamente quer saber como seus
funcion�rios est�o se sentindo baseado nos emoticons citados acima e digitados por eles.
Dada uma mensagem composta por uma cadeia de caracteres, escreva um programa para
determinar o sentimento expresso na mensagem. O seu programa deve usar a classe
Scanner para ler uma linha de entrada e a partir dessa linha devolver o sentimento expresso e salvar no banco de dados.
a) neutro: se o n�mero de s�mbolos �divertido� � igual ao n�mero de s�mbolos �chateado�
b) divertido: se o n�mero de s�mbolos �divertido� � maior do que n�mero de s�mbolos
�chateado�
c) chateado: se o n�mero de s�mbolos �chateado� � maior do que n�mero de s�mbolos
�divertido�.
Exemplos de entrada/saida:
Entrada: Achei o filme muito divertido.
Sa�da: neutro
Entrada: :-):-(:-(:-)
Sa�da: neutro
Entrada: Sonhei com Java. :-( (vou estudar).
Sa�da: chateado
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