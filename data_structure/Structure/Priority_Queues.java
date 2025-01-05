package Structure;
import java.util.*;
public class Priority_Queues {
    // Priority Queue   =   A FIFO data structure that serves elements
    //                      with the highest priorities first
    //                      before elements with lower priority.
    public static void main(String[] args) {
        Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder()); // reverse order bolohoor,ihees ni baga ruu shaana.
        queue.offer(3.0);
        queue.offer(2.5);
        queue.offer(4.0);
        queue.offer(4.0);
        queue.offer(1.5);
        queue.offer(2.0);

        while(!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}