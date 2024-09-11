package Construcao;

public class ConstrutorConsulta {

	public static void main(String[] args) {
		Consulta consulta1=new Consulta(15);
		Consulta consulta2=new Consulta("Doutor Ariovaldo");
		Consulta consulta3=new Consulta("Doutor Antetiguimon", "Cachumba da silva", 14);
		
		
		System.out.println(consulta1.getData());
		System.out.println(consulta2.getNomeDents());
		System.out.println(consulta3.getNomeDents());
		System.out.println(consulta3.getNomePcnte());
		System.out.println(consulta3.getData());

	}

}
