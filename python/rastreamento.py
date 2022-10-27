from concrete_numero_cpf_cliente import ConcreteNumeroCPFCliente
from concrete_numero_do_pacote import ConcreteNumeroDoPacote


class Rastreamento:
    def cpf_is_valid(self, cpf):
        if not isinstance(cpf, str) or len(cpf) != 11:
            return False

        if cpf in [
            "11111111111",
            "22222222222",
            "33333333333",
            "44444444444",
            "55555555555",
            "66666666666",
            "77777777777",
            "88888888888",
            "99999999999",
            "00000000000",
        ]:
            return False

        sum_ = 0
        for i in range(9):
            sum_ += int(cpf[i]) * (10 - i)
        rest = sum_ % 11
        if rest < 2:
            rest = 0
        else:
            rest = 11 - rest
        if rest != int(cpf[9]):
            return False

        sum_ = 0
        for i in range(10):
            sum_ += int(cpf[i]) * (11 - i)
        rest = sum_ % 11
        if rest < 2:
            rest = 0
        else:
            rest = 11 - rest
        if rest != int(cpf[10]):
            return False

        return True

    def imprime_cpf(self, cpf):
        print(f"{cpf[:3]}.{cpf[3:6]}.{cpf[6:9]}-{cpf[9:]}")

    def rastrear(self, pacote: str):
        print("Resultado:")
        if self.cpf_is_valid(pacote):
            self.imprime_cpf(pacote)
            rastreio = ConcreteNumeroCPFCliente()
            rastreio.rastrear_objeto()
        else:
            rastreio = ConcreteNumeroDoPacote()
            rastreio.rastrear_objeto()
