import random

def selectionSort(list, size):
   
    for step in range(size):
        min = step

        for i in range(step + 1, size):
            if list[i] < list[min]:
                min = i

        (list[step], list[min]) = (list[min], list[step])

randomList = random.sample(range(1, 50), 25)
print(randomList)

selectionSort(randomList, 25)
print(randomList)