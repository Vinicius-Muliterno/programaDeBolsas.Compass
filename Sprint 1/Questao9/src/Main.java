/*9 – Escreva um programa Java que tem como objetivo validar se um determinado funcionário
	tem direito a bonificação. O programa precisa receber a quantidade de funcionários que 
	serão cadastrados e após isso, o programa deve armazenar o nome e o salário de cada 
	funcionário. Se o usuário receber até R$ 1000,00 reais, receberá 20% de bonificação. Se 
	receber acima de 1000 e menos que 2000, recebe 10%. Se for acima de 2000, ao invés de 
	bonificação, o funcionário terá um desconto de 10%. 
	No fim do programa, deverá ter uma saída com os nomes dos funcionários, salário, bônus ou
	desconto e salário liquido. 
	Utilizem arrays para armanezar os dados.
	Ex: 
	Funcionário XPTO
	Salário: 1200,00
	Bonus: 120,00
	
	Salário Liquido: 1320,00
	Funcionário XYZ
	Salário: 3000,00
	Desconto: 300,00
	
	Salário Liquido: 2700,00
	Funcionário ABC
	Salário: 700,00
	Bonus: 140,00
	Salário Liquido: 840,00
	
	
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
			System.out.println("Qual o Salário do funcionario: " + (i + 1));
			double salario = input.nextDouble();
			funcionarios[i] = new Funcionarios(nome, salario);
		}

		for (Funcionarios funcionarios2 : funcionarios) {
			
			System.out.println("\n***************************************************");
			
			if (funcionarios2.getBonus() < 0) {
				System.out.printf("Funcionário: %s %nSalário Bruto: %.2f %nDesconto: %.2f %nSalário Liquido: %.2f%n",
						funcionarios2.getNome(), funcionarios2.getSalario(), funcionarios2.getBonus(),
						funcionarios2.getSalarioLiquido());
			} 
			
			else {
				System.out.printf("Funcionário: %s %nSalário Bruto: %.2f %nBônus: %.2f %nSalário Liquido: %.2f%n",
						funcionarios2.getNome(), funcionarios2.getSalario(), funcionarios2.getBonus(),
						funcionarios2.getSalarioLiquido());
			}
			System.out.println("***************************************************");
		
		}
		
		input.close();

	}

}