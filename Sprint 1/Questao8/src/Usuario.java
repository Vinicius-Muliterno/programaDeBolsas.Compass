
public class Usuario {
	
	String nome;
	String[] usuarios = new String[10];
	String senha;
	String[] senhas = new String[10];
	
	
	
	
	public void getnome(String nome[]) {
		for (int i = 0; i < usuarios.length; i++) {
			nome[i] =  usuarios[i];
			
		}
		
	}	
	public void getsenha(String senha[]) {
			for (int i = 0; i < senhas.length; i++) {
				senha[i] =  senhas[i];
				
			}
		
		 
	}

	
	
	
	

}
