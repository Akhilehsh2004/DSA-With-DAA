from queue import PriorityQueue


pq = PriorityQueue() # Priority queue using a min heap

pq.put(3)
pq.put(1)
pq.put(2)

print(pq.get()) # Output: 1 (Smallest element)
print(pq.get()) # Output: 2