package Correios;

public class NumeroDoPacote implements Criador{
	
	@Override
	public Rastreio criarRastreio() {
		return new ConcreteNumeroDoPacote();
	}


}
