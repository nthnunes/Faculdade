import random

def selectionSort(list):
    aux = list[0]
    x = 0
   
    while x < 25:
        for i in range(x, len(list)):
            if list[i] < aux:
                aux = list[i]

        list.append(list[x])
        list[x] = aux
        x + 1


randomList = random.sample(range(1, 50), 25)

print(randomList)

selectionSort(randomList)
print(randomList)