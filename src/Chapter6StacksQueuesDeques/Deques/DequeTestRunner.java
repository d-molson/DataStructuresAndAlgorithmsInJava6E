package Chapter6StacksQueuesDeques.Deques;

public class DequeTestRunner {

    public static void main(String args[]) {

        NodeDeque nodeDeque = new NodeDeque();
        nodeDeque.insertFirst(1);
        nodeDeque.insertFirst(2);
        nodeDeque.insertFirst(3);
        nodeDeque.insertLast(4);
        System.out.println(nodeDeque.first());
        System.out.println(nodeDeque.last());
        nodeDeque.removeFirst();
        System.out.println(nodeDeque.first());

    }

}
