from rastreamento import Rastreamento


class Main:
    def __init__(self):
        entrada = str(input("Entrada: "))

        pacote = Rastreamento()
        pacote.rastrear(entrada)


if __name__ == "__main__":
    main = Main()
