import heapq

pq = []  # Priority queue using a min heap
heapq.heappush(pq, 3)
heapq.heappush(pq, 1)
heapq.heappush(pq, 2)

print(heapq.heappop(pq))  # Output: 1 (Smallest element)
print(heapq.heappop(pq))  # Output: 2
