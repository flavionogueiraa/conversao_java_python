from rastreio import Rastreio


class ConcreteNumeroCPFCliente(Rastreio):
    def rastrear_objeto(self):
        print("Rastreando objeto por CPF do cliente...")
