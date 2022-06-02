class Node:
  def __init__(self, data):
    self.data = data
    self.next = None

class Queue:
  def __init__(self):
    self.first = None
    self.last = None
    self._size = 0

  def push(self, elem):
    #insere um elemento na fila
    node = Node(elem)
    if self.last is None:
      self.last = node
    else:
      self.last.next = node
      self.last = node
    if self.first is None:
      self.first = node
    self._size = self._size + 1

  def pop(self):
    #remove o elemento do fim da fila
    if self._size > 0:
      elem = self.first.data
      self.first = self.first.next
      if self.first is None:
        self.last = None
      self._size = self._size - 1
      return elem
    raise IndexError("The queue is empty")

  def peek(self):
    #retorna o primeiro elemento da fila
    if self._size > 0:
      elem = self.first.data
      return elem
    raise IndexError("The queue is empty")

  def __len__(self):
    #retorna o tamanho da fila
    return self._size
    
  def __repr__(self):
    if self._size > 0:
      r = ""
      pointer = self.first
      while(pointer):
        r = r + str(pointer.data) + " "
        pointer = pointer.next
      return r
    return "Empty Queue"

  def __str__(self):
    return self.__repr__()

Fila = Queue()
Fila.push(10)
Fila.peek()
Fila.push(12)
Fila.peek()
len(Fila)
print(Fila)
Fila.pop()
print(Fila)
Fila.peek()
len(Fila)
print(Fila)