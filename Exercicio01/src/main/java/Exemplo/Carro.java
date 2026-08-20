package Exemplo;

public class Carro extends Veiculo {
	public int numPortas;
	
	public Carro(String modelo, int ano, int NumPortas) {
		super(modelo,ano);
		this.numPortas = NumPortas;
	}
	
	@Override
	public String imprimirDetalhes() {
		return super.imprimirDetalhes() + "\nPortas:" + this.numPortas;
	}
}
