package Chapter4RecursionStacksQueues.Queues;

/**
 * Created by dolson on 8/11/2017.
 */
public class ArrayQueue implements Queue {

    public static final int CAPACITY = 100;
    private int capacity;
    private int front = 0;
    private int rear = 0;
    private Object Q[];

    public ArrayQueue() {
        this(CAPACITY);
    }

    public ArrayQueue(int capacity){
        this.capacity = capacity;
        Q = new Object[capacity];
    }

    public int size(){
        return(capacity - front + rear)%capacity;
    }

    public boolean isEmpty(){
        return(front == rear);
    }

    public Object front() throws EmptyQueueException {
        if(isEmpty()){
            throw new EmptyQueueException("Queue is empty.");
        }
        return Q[front];
    }

    public void enqueue(Object element){
        if(size() == capacity - 1){
            throw new FullQueueException("Queue is full.");
        }
        Q[rear] = element;
        rear = (rear + 1)%capacity;
    }

    public Object dequeue() throws EmptyQueueException {
        if(isEmpty()){
            throw new EmptyQueueException("Queue is empty");
        }
        Object temp = Q[front];
        Q[front] = null;
        front = (front + 1)%capacity;
        return temp;
    }

}
