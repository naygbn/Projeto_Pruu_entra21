package entidades;

import java.util.Date;

public class Pruu {

	private static int contador = 1;
	private int id;
	private String texto;
	private int quantidadeLikes;
	private Date dataCriacao;
	private boolean bloqueado;

	public Pruu() {

		super();

	}

	public Pruu(String texto) {
		validarTexto(texto);
		this.id = contador++;
		this.texto = texto;
		this.quantidadeLikes = 0;
		this.bloqueado = false;
		this.dataCriacao = new Date();

	}

	@Override
	public String toString() {
		if(isBloqueado()) {
			return "Pruu bloqueado!";
		}
		return "\nPruu" + "\nid:" + this.id + "\nQuantidade de Likes: " + this.quantidadeLikes + "\nTexto: " + texto;
	}

	public void validarTexto(String texto) {
		if (texto.trim().length() > 300 || texto.trim().length() < 1) {
			System.out.println("Pruu inválido!");
			return;
		}

	}

	public static int getContador() {
		return contador;
	}

	public static void setContador(int contador) {
		Pruu.contador = contador;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public int getQuantidadeLikes() {
		return quantidadeLikes;
	}

	public void setDarLike() {
		this.quantidadeLikes++;
	}

	public Date getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public boolean isBloqueado() {
		return bloqueado;
	}

	public void setBloqueado(boolean bloqueado) {
		this.bloqueado = bloqueado;
	}

	public void setLike() {
		// TODO Auto-generated method stub
		
	}

}
