import random

def bubbleSort(list):
    min = len(list)

    for i in range(min-1):
        for j in range(min-1):
            if list[j] > list[i+1]:
                list[j], list[i+1] = list[i+1], list[j]

randomList = random.sample(range(1, 50), 25)
print(randomList)

bubbleSort(randomList)
print(randomList)