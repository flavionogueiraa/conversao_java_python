from concrete_numero_do_pacote import ConcreteNumeroDoPacote
from criador import Criador
from rastreio import Rastreio


class NumeroDoPacote(Criador):
    def criarRastreio(self) -> Rastreio:
        return ConcreteNumeroDoPacote()
