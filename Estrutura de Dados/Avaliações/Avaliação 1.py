class DemoException(Exception):
    def __init__(self, message):
        super().__init__(message)
message = "\nO operador é inválido, tente novamente!"

def operator(value1, value2):
    while True:
        try:
            op = input("\nEscolha a operação a ser realizada:\nSoma -> +\nSubtração -> -\nDivisão -> /\nMultiplicação - > *\n--> ")
            if op == "+" or op == "-" or op == "/" or op == "*":
                verify(op, value1, value2)
            else:
                raise DemoException(message)
        except DemoException as e:
            print(e)

def verify(op, value1, value2):
    if op == "+":
        print("\nResultado:", value1, "+", value2, "=", value1 + value2)
        repeat()
    elif op == "-":
        print("\nResultado:", value1, "-", value2, "=", value1 - value2)
        repeat()
    elif op == "/":
        try:
            print("\nResultado:", value1, "/", value2, "=", value1 / value2)
            repeat()
        except ZeroDivisionError:
            print("\nNão é possível dividir por 0.")
            operator(value1, value2)
    elif op == "*":
        print("\nResultado:", value1, "*", value2, "=", value1 * value2)
        repeat()

def repeat():
    while True:
        opc = input("Deseja efetuar mais cálculos? (s/n) --> ")

        if opc ==  "s":
            main()
        elif opc == "n":
            exit()
        else:
            print("\nEntrada Inválida, tente novamente!")

def main():
    while True:
        try:
            value1 =  int(input("Digite o primeiro valor: "))
            break
        except ValueError:
            print("\nA entrada não é um inteiro, tente novamente!")

    while True:   
        try:
            value2 =  int(input("Digite o segundo valor: "))
            break
        except ValueError:
            print("\nA entrada não é um inteiro, tente novamente!")

    operator(value1, value2)

if __name__ == "__main__":
    main()