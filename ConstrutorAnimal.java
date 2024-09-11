package Construcao;

public class ConstrutorAnimal {

	public static void main(String[] args) {
		Animal animal1=new Animal("verde");
		Animal animal2=new Animal(25);
		Animal animal3=new Animal("black pink", 90);
		
		
		System.out.println(animal1.getCor());
		System.out.println(animal2.getTamanho());
		System.out.println(animal3.getCor());
		System.out.println(animal3.getTamanho());

	}

}
