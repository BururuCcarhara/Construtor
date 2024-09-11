package Construcao;

public class ConstrutorPessoa {

	public static void main(String[] args) {
		Pessoa jogador1=new Pessoa("carlinhos");
		Pessoa jogador2 =new Pessoa("Messi",36);
		Pessoa jogador3 =new Pessoa(84);
		
		
		System.out.println(jogador1.getNome());
		System.out.println(jogador2.getNome());
		System.out.println(jogador2.getIdade());
		System.out.println(jogador3.getIdade());

	}

}
