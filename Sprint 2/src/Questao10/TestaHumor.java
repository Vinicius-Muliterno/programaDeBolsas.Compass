package Questao10;

public class TestaHumor {
	
	public static String testaHumor(String humor) {
		humor += " ";
		int divertido = 0;
		int chateado = 0;
				
		if(humor.contains(":-)")) {
			String[] retornoSplit1 = humor.split(":-\\)");
			divertido = retornoSplit1.length - 1;
			System.out.println("Emoticons divertido: " + divertido);
		}
		if(humor.contains(":-(")) {
			String[] retornoSplit2 = humor.split(":-\\(");
			chateado = retornoSplit2.length - 1;
			System.out.println("Emoticons chateado: " + chateado);
		}
		
		if(divertido > 0 || chateado > 0) {
			if (divertido > chateado) {
				return "O sentimento da equipe est�: Divertida";
			} else if (divertido == chateado) {
				return "O sentimento da equipe est�: Neutro";
			} else {
				return "O sentimento da equipe est�: Chateado";
			}
		} else {
			return "Neutro";
		}
	}


}