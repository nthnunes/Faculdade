from random import randint

def createHeap(list, i, f):
    aux = list[i]
    j = i * 2 + 1

    while j <= f:
        if j < f:
            if list[j] < list[j+1]:
                j = j + 1
        if aux < list[j]:
            list[i] = list[j]
            i = j
            j = 2 * i + 1
        else:
            j = f + 1
    list[i] = aux


def heapSort(list):
    n = len(list)
    for i in range((n-1)//2, -1, -1):
        createHeap(list, i, n-1)

    for i in range(n-1, 0, -1):
        list[0], list[i] = list[i], list[0]
        createHeap(list, 0, i-1)


randomList = []
for i in range(0, 20):
    randomList.append(randint(1, 50))
print(randomList)

heapSort(randomList)
print(randomList)