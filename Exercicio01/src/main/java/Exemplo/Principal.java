package Exemplo;

public class Principal {
	public static void main(String[] args) {
		Veiculo v1 = new Veiculo("Corola",2000);
		System.out.println(v1.imprimirDetalhes());
		Carro c1 = new Carro("Corola",1999,4);
		System.out.println(c1.imprimirDetalhes());
		Moto m1 = new Moto("SLA",1997,5);
		System.out.println(m1.imprimirDetalhes());
	}
}
