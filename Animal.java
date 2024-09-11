package Construcao;

public class Animal {
private float tamanho;
private String cor;

public Animal(String cor) {
	this.cor=cor;
	}
public Animal(float tamanho) {
this.tamanho=tamanho;
}

public Animal (String cor, float tamanho) {
	this.tamanho= tamanho;
	this.cor=cor;
	}
	public String getCor() {
		return cor;
	}
	public void setCor (String cor) {
		this.cor=cor;
	}
	public float getTamanho() {
		return tamanho;
	}
	public void setTamanho(float tamanho) {
		this.tamanho=tamanho;
	}
}


