class Queue:
	def __init__(self):
		self.items =[]
	    
	def empty(self):
		return self.items == []
	
	def enqueue(self, item):
		self.items.insert(0,item)
	
	def dequeue(self):
		return self.items.pop()
	
	def size(self):
		return len(self.items)

def main():
    q = Queue()
    q.enqueue(1)
    print(q.empty())
    q.enqueue(2)
    q.enqueue(3)
    print(q.dequeue())
    print(q.size())
    print(q.dequeue())
    print(q.dequeue())
    print(q.empty())
    print(q.size())

if __name__ == "__main__":
    main()