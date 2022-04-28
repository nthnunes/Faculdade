from random import randint

def quickSort(lista, inicio=0, fim=None):
    if fim is None:
        fim = len(lista)-1
    if inicio < fim:
        p = partition(lista, inicio, fim)

        quickSort(lista, inicio, p-1)
        quickSort(lista, p+1, fim)

def partition(lista, inicio, fim):
    pivot = lista[fim]
    i = inicio

    for j in range(inicio, fim):
        if lista[j] <= pivot:
            lista[j], lista[i] = lista[i], lista[j]
            i = i + 1
        lista[i], lista[fim] = lista[fim], lista[i]
        return i

randomList = []
for i in range(0, 50):
    randomList.append(randint(1, 50))
print("\nLista: ", randomList)

quickSort(randomList)
print("\nQuick Sort: ", randomList)