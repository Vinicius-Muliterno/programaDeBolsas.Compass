
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
            System.out.println("Opção inválida" + "\n" + "Por favor, escolha um de nossos serviços.");
        }
        return false; // Caso nenhuma das opções acima tenha sido escolhida ele cai aqui nesse "return false", fazendo com que o while rode novamente

    }

    public int menu() {
         System.out.println("-----------------------------------------" + "\n" + 
                 "BEM VINDO AO SISTEMA LOGIN" + "\n" +
                 "-----------------------------------------" + "\n" +
                 "DIGITE A OPÇÃO DESEJADA: " + "\n" +
                 "[1] Para cadastrar usuário" + "\n" + 
                 "[2] Para Login do Usuário" + "\n" + 
                 "[3] Para sair." + "\n" +
                 "-----------------------------------------");


         Scanner input = new Scanner(System.in);


             int escolha = input.nextInt();
             input.close();
             return escolha; // retorna o numero que o usuário escreveu
    }
}
