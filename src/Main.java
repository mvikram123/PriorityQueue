import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(4);
        queue.add(3);
        queue.add(2);
        queue.add(1);
        System.out.println(queue);

        while (queue.isEmpty() == false) {
            System.out.print("removing element:"+queue.remove());
        }
    }
}


//output: 1 2 3 4
//removing element:1234

//Note priority queue automatically stroed data in increasing order.
//    The PriorityQueue<Integer> is initialized to store integers in ascending order(increasing order).
//        The integers 4, 3, 2, and 1 are added to the queue using the add() method.
//        The while loop runs as long as the queue is not empty (isEmpty() == false).
//        Inside the loop, queue.remove() is called to remove and return the smallest element from the queue.
//        The removed elements are printed using System.out.printf("%d", ...).
//        Since the integers were added in descending order, the queue removes and prints them in ascending order.
//        As a result, the output is 1234, indicating that the integers are removed from the priority queue in ascending order.