package Structure;
import java.util.LinkedList;
import java.util.Queue;

public class Queues {
    // queues =  FIFO data structure. First-In First-Out
    //          A collection designed for holding elements prior to processing
    //          Linear data structure
    //          add = enqueue =>  offer()
    //          remove = dequeue => poll()
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>(); // Queue ni interface bolohoor instance uusgej chadku, harin linkedlist ni queue-iig implement hiisen class bolohoor bolno gejiin.
        System.out.println(queue.isEmpty());
        queue.offer("Karen");
        queue.offer("Chad");
        queue.offer("Steve");
        queue.offer("Harold");
        System.out.println(queue.size());
        System.out.println(queue.contains("Harold"));
        System.out.println(queue);
        queue.poll();
        System.out.println(queue);  // yaltachgui l urdaas n ehelj hasch baina.
    }
}
//   Where queues useful ?
//   1. Keyboard Buffer(letters should appear on the screen in the order they're pressed)
//   2. Printer Queue(Print jobs should be completed in order)
//   3. Used in LinkedLists , PriorityQueues , Breadth-first-search