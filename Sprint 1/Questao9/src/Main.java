/*9 � Escreva um programa Java que tem como objetivo validar se um determinado funcion�rio
	tem direito a bonifica��o. O programa precisa receber a quantidade de funcion�rios que 
	ser�o cadastrados e ap�s isso, o programa deve armazenar o nome e o sal�rio de cada 
	funcion�rio. Se o usu�rio receber at� R$ 1000,00 reais, receber� 20% de bonifica��o. Se 
	receber acima de 1000 e menos que 2000, recebe 10%. Se for acima de 2000, ao inv�s de 
	bonifica��o, o funcion�rio ter� um desconto de 10%. 
	No fim do programa, dever� ter uma sa�da com os nomes dos funcion�rios, sal�rio, b�nus ou
	desconto e sal�rio liquido. 
	Utilizem arrays para armanezar os dados.
	Ex: 
	Funcion�rio XPTO
	Sal�rio: 1200,00
	Bonus: 120,00
	
	Sal�rio Liquido: 1320,00
	Funcion�rio XYZ
	Sal�rio: 3000,00
	Desconto: 300,00
	
	Sal�rio Liquido: 2700,00
	Funcion�rio ABC
	Sal�rio: 700,00
	Bonus: 140,00
	Sal�rio Liquido: 840,00
	
	
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int numeroFuncionarios = 0;
		
		
		System.out.println("****************Sistema de pagamento****************\n");

		System.out.println("Qual o numero de funcionarios da empresa: ");
		numeroFuncionarios = input.nextInt();
		Funcionarios[] funcionarios = new Funcionarios[numeroFuncionarios];

		for (int i = 0; i < numeroFuncionarios; i++) {
			
			input.nextLine();
			System.out.println("Qual o nome do funcionario: " + (i + 1));
			String nome = input.nextLine();
			System.out.println("Qual o Sal�rio do funcionario: " + (i + 1));
			double salario = input.nextDouble();
			funcionarios[i] = new Funcionarios(nome, salario);
		}

		for (Funcionarios funcionarios2 : funcionarios) {
			
			System.out.println("\n***************************************************");
			
			if (funcionarios2.getBonus() < 0) {
				System.out.printf("Funcion�rio: %s %nSal�rio Bruto: %.2f %nDesconto: %.2f %nSal�rio Liquido: %.2f%n",
						funcionarios2.getNome(), funcionarios2.getSalario(), funcionarios2.getBonus(),
						funcionarios2.getSalarioLiquido());
			} 
			
			else {
				System.out.printf("Funcion�rio: %s %nSal�rio Bruto: %.2f %nB�nus: %.2f %nSal�rio Liquido: %.2f%n",
						funcionarios2.getNome(), funcionarios2.getSalario(), funcionarios2.getBonus(),
						funcionarios2.getSalarioLiquido());
			}
			System.out.println("***************************************************");
		
		}
		
		input.close();

	}

}