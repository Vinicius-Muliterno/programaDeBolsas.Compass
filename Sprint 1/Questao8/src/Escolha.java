
import java.util.Scanner;

class Escolha {


    public boolean escolher(int escolha) {
        switch (escolha) {

        case 1:
            System.out.println("basic");
            return true;
        case 2:
            System.out.println("premium");
            return true;

        case 3:
            System.out.println("gold");
            return true;
        default:
            System.out.println("Op��o inv�lida" + "\n" + "Por favor, escolha um de nossos servi�os.");
        }
        return false; // Caso nenhuma das op��es acima tenha sido escolhida ele cai aqui nesse "return false", fazendo com que o while rode novamente

    }

    public int menu() {
         System.out.println("-----------------------------------------" + "\n" + 
                 "BEM VINDO AO SISTEMA LOGIN" + "\n" +
                 "-----------------------------------------" + "\n" +
                 "DIGITE A OP��O DESEJADA: " + "\n" +
                 "[1] Para cadastrar usu�rio" + "\n" + 
                 "[2] Para Login do Usu�rio" + "\n" + 
                 "[3] Para sair." + "\n" +
                 "-----------------------------------------");


         Scanner input = new Scanner(System.in);


             int escolha = input.nextInt();
             input.close();
             return escolha; // retorna o numero que o usu�rio escreveu
    }
}
