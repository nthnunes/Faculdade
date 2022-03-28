def goTo(linenum):
    global line
    line = linenum
line = 1

class DemoException(Exception):
    def __init__(self, message):
        super().__init__(message)
message = "\nO operador é inválido, tente novamente!"
 


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



while True:
    try:
        op = input("\nEscolha a operação a ser realizada:\nSoma -> +\nSubtração -> -\nDivisão -> /\nMultiplicação - > *\n--> ")
        if op == "+" or op == "-" or op == "/" or op == "*":
            goTo(39)
        else:
            raise DemoException(message)
    except DemoException as e:
        print(e)
            
    if op == "+":
        print("\nResultado:", value1, "+", value2, "=", value1 + value2)
        break
    elif op == "-":
        print("\nResultado:", value1, "-", value2, "=", value1 - value2)
        break
    elif op == "/":
        try:
            print("\nResultado:", value1, "/", value2, "=", value1 / value2)
            break
        except ZeroDivisionError:
            print("\nNão é possível dividir por 0.")
    elif op == "*":
        print("\nResultado:", value1, "*", value2, "=", value1 * value2)
        break