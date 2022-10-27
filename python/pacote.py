class Pacote:
    id: int
    cpf_destinatario: str

    def __init__(self, id: int, cpf_destinatario: str):
        self.setId(id)
        self.set_cpf_destinatario(cpf_destinatario)

    def setId(self, id: int):
        self.id = id

    def getId(self):
        return self.id

    def set_cpf_destinatario(self, cpf_destinatario: str):
        self.cpf_destinatario = cpf_destinatario
