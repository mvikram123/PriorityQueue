# PriorityQueue


The PriorityQueue<Integer> is initialized to store integers or string  in ascending order(increasing order).
The integers 4, 3, 2, and 1 are added to the queue using the add() method.
The while loop runs as long as the queue is not empty (isEmpty() == false).
Inside the loop, queue.remove() is called to remove and return the smallest element from the queue.
The removed elements are printed using System.out.printf("%d", ...).
Since the integers were added in descending order, the queue removes and prints them in ascending order.
As a result, the output is 1234, indicating that the integers are removed from the priority queue in ascending order.
