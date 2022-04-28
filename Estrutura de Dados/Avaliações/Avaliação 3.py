from random import randint

def selectionSort(list):
    size = len(randomList)

    for i in range(size):
        min = i

        for j in range(i + 1, size):
            if list[j] < list[min]:
                min = j

        list[i], list[min] = list[min], list[i]

def bubbleSort(list):
    size = len(list)

    for i in range(size-1):
        status = 0
        for j in range(size-1):
            if list[j] > list[i+1]:
                status = status + 1
                list[j], list[i+1] = list[i+1], list[j]
        if status == 0:
            return

def insertionSort(list):
    size = len(list)

    for i in range(1, size):
        key = list[i]
  
        j = i-1
        while j >=0 and key < list[j] :
            list[j+1] = list[j]
            j -= 1
        list[j+1] = key


#Selection Sort
randomList = []
for i in range(0, 500):
    randomList.append(randint(1, 500))

print("\nLista 1: ", randomList)

selectionSort(randomList)
print("\nSelection Sort: ", randomList)


#Bubble Sort
randomList = []
for i in range(0, 500):
    randomList.append(randint(1, 500))

print("\n\nLista 2: ", randomList)

bubbleSort(randomList)
print("\nBubble Sort: ", randomList)

#Insertion Sort
randomList = []
for i in range(0, 500):
    randomList.append(randint(1, 500))

print("\n\nLista 3: ", randomList)

insertionSort(randomList)
print("\nInsertion Sort: ", randomList)