class Division:
    def __init__(self, a, b, c) -> None:
        self.a = a
        self.b = b
        self.c = c

    def calculate(self) -> float:
        try:
            return (self.a + self.b) / self.c
        except ZeroDivisionError:
            print("\n--> Não é possível dividir por zero.")
            exit(0)

while True:
    try:
        a = int(input("Digite o primeiro valor: "))
        break
    except ValueError:
        print("A entrada não é um inteiro, tente novamente!")

while True:
    try:
        b = int(input("Digite o segundo valor: "))
        break
    except ValueError:
        print("A entrada não é um inteiro, tente novamente!")
        
while True:
    try:
        c = int(input("Digite o terceiro valor: "))
        break
    except ValueError:
        print("A entrada não é um inteiro, tente novamente!")

App = Division(a, b, c)
print("\n--> Resultado Final: ", App.calculate())