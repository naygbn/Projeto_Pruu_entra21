package entidades;
import java.util.ArrayList;

public class UsuarioGeral {
	
	
	private ArrayList <Pruu> pruus;
	private String nome;
	private String email;
	private String cpf;
	
	
	public UsuarioGeral() {
		super();
		
	}

	public  UsuarioGeral ( String nome, String email, String cpf) {
		this.nome = nome;
		this.email = email;
		this.cpf = cpf;
	}

	public void darLike (Pruu pruuLike) {
		   pruuLike.setDarLike();
		}
	
	public void listarPruus () {
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public ArrayList<Pruu> getPruus() {
		return pruus;
	}
	public void setPruus(ArrayList<Pruu> pruus) {
		this.pruus = pruus;
	}
}

