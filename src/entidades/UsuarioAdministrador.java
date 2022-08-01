package entidades;

public class UsuarioAdministrador extends UsuarioGeral {

	public UsuarioAdministrador() {
		super();
		
		
	}

	public UsuarioAdministrador ( String nome, String email, String cpf) {
		super (nome, email, cpf);
		
	}

	public void bloquearPruu (Pruu PruuBloqueado ) {
		PruuBloqueado.setBloqueado(true);
		
	}
	
	
	}

	

