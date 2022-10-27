from concrete_numero_cpf_cliente import ConcreteNumeroCPFCliente
from criador import Criador
from rastreio import Rastreio


class NumeroCPFCliente(Criador):
	def criarRastreio(self) -> Rastreio:
		return ConcreteNumeroCPFCliente()
