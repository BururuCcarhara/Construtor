package Construcao;

public class Consulta {
	private int data;
	private String nomePcnte;
	private String nomeDents;

	public Consulta(int data) {
		this.data=data;
	}

	public Consulta(String nomeDents) {
		this.nomeDents = nomeDents;
		
	}

	public Consulta(String nomeDents, String nomePcnte, int data) {
		this.nomeDents = nomeDents;
		this.nomePcnte = nomePcnte;
		this.data = data;
	}

	public String getNomeDents() {
		return nomeDents;
	}

	public void setNomeDents(String nomeDents) {
		this.nomeDents = nomeDents;
	}

	public String getNomePcnte() {
		return nomePcnte;
	}

	public void setNomePcnte(String nomePcnte) {
		this.nomePcnte = nomePcnte;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
}
