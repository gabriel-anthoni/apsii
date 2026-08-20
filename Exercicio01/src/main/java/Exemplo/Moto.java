package Exemplo;

public class Moto extends Veiculo {
	public int numCilindradas;
	
	public Moto(String modelo, int ano, int numCilindradas) {
		super(modelo,ano);
		this.numCilindradas = numCilindradas;
	}
	
	@Override
	public String imprimirDetalhes() {
		return super.imprimirDetalhes() + "\nCilindradas:" + this.numCilindradas;
	}
}
