package Correios;

public class NumeroCPFCliente implements Criador {

	@Override
	public Rastreio criarRastreio() {
		return new ConcreteNumeroCPFCliente();
	}

	
}
