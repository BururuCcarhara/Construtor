package Construcao;

public class ConstrutorCarro {

	public static void main(String[] args) {
		Carro carro1=new Carro("Cavalos0909");
		Carro carro2=new Carro(84);
		Carro carro3=new Carro("carlinh05",98845);
		
		
		System.out.println(carro1.getPlaca());
		System.out.println(carro2.getNumChassi());
		System.out.println(carro3.getPlaca());
		System.out.println(carro3.getNumChassi());

	}

}
