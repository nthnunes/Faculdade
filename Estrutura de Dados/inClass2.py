from random import randint
import timeit

def selectionSort(list):
    size = len(list)

    for i in range(size):
        min = i

        for j in range(i + 1, size):
            if list[j] < list[min]:
                min = j

        list[i], list[min] = list[min], list[i]

def bubbleSort(list):
    size = len(list)

    for i in range(size-1):
        for j in range(size-1):
            if list[j] > list[i+1]:
                list[j], list[i+1] = list[i+1], list[j]

def insertionSort(list):
    size = len(list)

    for i in range(1, size):
        key = list[i]
  
        j = i-1
        while j >=0 and key < list[j] :
            list[j+1] = list[j]
            j -= 1
        list[j+1] = key

#Lista 10 itens
print("\nList [10]")

randomList = []
for i in range(0, 10):
    randomList.append(randint(1, 50))

sortList = randomList
selectionSort(sortList)
print("Selection Sort: ", timeit.timeit('output = 10*5'), "seconds")

sortList = randomList
bubbleSort(sortList)
print("Bubble Sort: ", timeit.timeit('output = 10*5'), "seconds")

sortList = randomList
insertionSort(sortList)
print("Insertion Sort: ", timeit.timeit('output = 10*5'), "seconds")


#Lista 20 itens
print("\nList [20]")

randomList = []
for i in range(0, 20):
    randomList.append(randint(1, 50))

sortList = randomList
selectionSort(sortList)
print("Selection Sort: ", timeit.timeit('output = 10*5'), "seconds")

sortList = randomList
bubbleSort(sortList)
print("Bubble Sort: ", timeit.timeit('output = 10*5'), "seconds")

sortList = randomList
insertionSort(sortList)
print("Insertion Sort: ", timeit.timeit('output = 10*5'), "seconds")


#Lista 40 itens
print("\nList [40]")

randomList = []
for i in range(0, 40):
    randomList.append(randint(1, 50))

sortList = randomList
selectionSort(sortList)
print("Selection Sort: ", timeit.timeit('output = 10*5'), "seconds")

sortList = randomList
bubbleSort(sortList)
print("Bubble Sort: ", timeit.timeit('output = 10*5'), "seconds")

sortList = randomList
insertionSort(sortList)
print("Insertion Sort: ", timeit.timeit('output = 10*5'), "seconds")


#Lista 80 itens
print("\nList [80]")

randomList = []
for i in range(0, 80):
    randomList.append(randint(1, 50))

sortList = randomList
selectionSort(sortList)
print("Selection Sort: ", timeit.timeit('output = 10*5'), "seconds")

sortList = randomList
bubbleSort(sortList)
print("Bubble Sort: ", timeit.timeit('output = 10*5'), "seconds")

sortList = randomList
insertionSort(sortList)
print("Insertion Sort: ", timeit.timeit('output = 10*5'), "seconds")


#Lista 160 itens
print("\nList [160]")

randomList = []
for i in range(0, 160):
    randomList.append(randint(1, 50))

sortList = randomList
selectionSort(sortList)
print("Selection Sort: ", timeit.timeit('output = 10*5'), "seconds")

sortList = randomList
bubbleSort(sortList)
print("Bubble Sort: ", timeit.timeit('output = 10*5'), "seconds")

sortList = randomList
insertionSort(sortList)
print("Insertion Sort: ", timeit.timeit('output = 10*5'), "seconds")


#Lista 320 itens
print("\nList [320]")

randomList = []
for i in range(0, 320):
    randomList.append(randint(1, 50))

sortList = randomList
selectionSort(sortList)
print("Selection Sort: ", timeit.timeit('output = 10*5'), "seconds")

sortList = randomList
bubbleSort(sortList)
print("Bubble Sort: ", timeit.timeit('output = 10*5'), "seconds")

sortList = randomList
insertionSort(sortList)
print("Insertion Sort: ", timeit.timeit('output = 10*5'), "seconds")


#Lista 640 itens
print("\nList [640]")

randomList = []
for i in range(0, 640):
    randomList.append(randint(1, 50))

sortList = randomList
selectionSort(sortList)
print("Selection Sort: ", timeit.timeit('output = 10*5'), "seconds")

sortList = randomList
bubbleSort(sortList)
print("Bubble Sort: ", timeit.timeit('output = 10*5'), "seconds")

sortList = randomList
insertionSort(sortList)
print("Insertion Sort: ", timeit.timeit('output = 10*5'), "seconds")