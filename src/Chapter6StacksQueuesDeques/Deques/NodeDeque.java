package Chapter6StacksQueuesDeques.Deques;

public class NodeDeque implements Deque {

    protected DLNode header;
    protected DLNode trailer;
    protected int size;

    public NodeDeque(){
        header = new DLNode();
        trailer = new DLNode();
        header.setNext(trailer);
        trailer.setPrev(header);
        size = 0;
    }

    public Object first() throws EmptyDequeException{
        if(isEmpty()){
            throw new EmptyDequeException("Deque is empty.");
        }
        return header.getNext().getElement();
    }

    public boolean isEmpty() {
        return(size == 0);
    }

    public int size() {
        return size;
    }

    public Object last() {
        if(isEmpty()){
            throw new EmptyDequeException("Deque is empty.");
        }
        return trailer.getPrev().getElement();
    }

    public Object removeFirst() throws EmptyDequeException{
        if(isEmpty()){
            throw new EmptyDequeException("Deque is empty.");
        }
        DLNode first = header.getNext();
        Object element = first.getElement();
        DLNode next = first.getNext();
        header.setNext(next);
        next.setPrev(header);
        size--;
        return element;
    }

    public Object removeLast() throws EmptyDequeException{
        if(isEmpty()){
            throw new EmptyDequeException("Deque is empty.");
        }
        DLNode last = trailer.getPrev();
        Object element = last.getElement();
        DLNode secondLast = last.getPrev();
        trailer.setPrev(secondLast);
        secondLast.setNext(trailer);
        size--;
        return element;
    }

    public void insertFirst(Object element) {
        DLNode second = header.getNext();
        DLNode first = new DLNode(element, header, second);
        second.setPrev(first);
        header.setNext(first);
        size++;
    }

    public void insertLast(Object element) {
        DLNode secondLast = trailer.getPrev();
        DLNode last = new DLNode(element, secondLast, trailer);
        secondLast.setNext(last);
        trailer.setPrev(last);
        size++;
    }
}
