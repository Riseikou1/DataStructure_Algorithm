package Structure;
import java.util.*;
public class LinkedLists {
    // LinkedList  =  stores Nodes in 2 parts (data+address)
    //                Nodes are in non-consecutive memory locations
    //                Elements are linked using pointers
    // Singly Linked List gej baih ba, ter ni daraagiin elementiinhe location-iig zaasan pointer aguulna.
    // Doubly Linked List ni bol daraagiin bolon,umnuh elementuudiin address.
    public static void main(String[] args) {
        LinkedList<String> linkedlist = new LinkedList<>();
        linkedlist.push("A");
        linkedlist.push("B");
        linkedlist.push("C");
        linkedlist.push("D");
        linkedlist.push("F");
        System.out.println(linkedlist);
        linkedlist.pop();  // suuld nemsen elementiig remove(bugsund ni baigaa elementiig.)
        System.out.println(linkedlist);
        linkedlist.offer("G"); // offer ni tolgoind ni zalgaj ugch baina.
        linkedlist.poll();  // ene bas bugsund ni baigaa elementiig remove hiine.
        System.out.println(linkedlist);

        linkedlist.add(4,"E");  // ingeed specific index zaaj ugch bolno.
        System.out.println(linkedlist);
        System.out.println(linkedlist.indexOf("G")); // searching shit.
        System.out.println(linkedlist.peekFirst());  // prints first element of the list.
        System.out.println(linkedlist.peekLast());
        System.out.println(linkedlist);
        linkedlist.addFirst("O");
        linkedlist.addLast("G");
        linkedlist.removeLast();
        System.out.println(linkedlist);

    }
}
//        advantages ?
//   1. Dynamic Data Structure (allocates needed memory while running)
//   2. Insertion and Deletion of Nodes is easy. O(1)
//   3. No/Low memory waste.

// zugeer engiin list-d iin dund element nemey gevel, ard taliin buh element-iig +1 index ruu ni shift hiij baij l nemhj chadna.
// harin linkedlist ni bol hoyr yumnii ch ymuu, pointer-iig uurchluud l boloo.


//        disadvantages ?
//   1. Greater memory use (additional pointer)
//   2. No random access of elements (no index[i])
//   3. Accessing/searching elements is more time consuming.  O(n)

//     use cases ?
//   1. implement Stacks/Queues  // ed nar ni interface bolohoor, yalanguya queue-g
//   2. GPS navigation
//   3. music playlist