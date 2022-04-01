class Pessoa:
    def __init__(self, nome) -> None:
        self.nome = nome

    def __str__(self) -> str:
        return self.nome


luis = Pessoa('Luis')
print(luis)
caio = Pessoa('Caio')
print(caio)