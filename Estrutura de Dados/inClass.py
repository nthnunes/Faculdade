import random

def selectionSort(list, size):
   
    for step in range(size):
        min_idx = step

        for i in range(step + 1, size):
            if list[i] < list[min_idx]:
                min_idx = i

        (list[step], list[min_idx]) = (list[min_idx], list[step])

randomList = random.sample(range(1, 50), 25)
print(randomList)

selectionSort(randomList, 25)
print(randomList)