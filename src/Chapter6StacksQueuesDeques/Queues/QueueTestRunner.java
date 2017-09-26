package Chapter4RecursionStacksQueues.Queues;

/**
 * Created by dolson on 8/11/2017.
 */
public class QueueTestRunner {

    public static void main(String args[]) {

        /* Test ArrayQueue implementation: */
//        ArrayQueue queue = new ArrayQueue(5);
//        queue.enqueue(1);
//        queue.enqueue(2);
//        queue.enqueue(3);
//        System.out.println(queue.dequeue());
//        System.out.println(queue.dequeue());
//        queue.enqueue(4);
//        queue.enqueue(5);
//        System.out.println(queue.dequeue());
//        System.out.println("Size: " + queue.size());

        /* Test NodeQueue implementation: */
//        NodeQueue nodeQueue = new NodeQueue();
//        nodeQueue.enqueue(1);
//        nodeQueue.enqueue(2);
//        nodeQueue.enqueue(3);
//        System.out.println(nodeQueue.dequeue());
//        System.out.println(nodeQueue.dequeue());
//        nodeQueue.enqueue(4);
//        nodeQueue.enqueue(5);
//        System.out.println(nodeQueue.dequeue());
//        System.out.println("Size: " + nodeQueue.size());

        /* Test Josephus: */
        String[] a1 = {"Alice", "Bob", "Cindy", "Doug", "Ed", "Fred"};
        String[] a2 = {"Gene", "Hope", "Irene", "Jack", "Kim", "Lance"};
        String[] a3 = {"Mike", "Roberto"};
        System.out.println("First winner is " + Josephus.Josephus(Josephus.buildQueue(a1), 0));
        System.out.println("Second winner is " + Josephus.Josephus(Josephus.buildQueue(a2), 10));
        System.out.println("Second winner is " + Josephus.Josephus(Josephus.buildQueue(a3), 7));


    }

}
