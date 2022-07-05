from random import randint

def insertionSort(list):
    size = len(list)

    for i in range(1, size):
        key = list[i]
  
        j = i-1
        while j >=0 and key < list[j] :
            list[j+1] = list[j]
            j -= 1
        list[j+1] = key

randomList = []
for i in range(0, 500):
    randomList.append(randint(1, 500))

print("\n\nLista: ", randomList)

insertionSort(randomList)
print("\nInsertion Sort: ", randomList)