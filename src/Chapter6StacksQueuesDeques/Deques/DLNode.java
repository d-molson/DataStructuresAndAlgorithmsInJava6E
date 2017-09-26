package Chapter6StacksQueuesDeques.Deques;


public class DLNode {

    private Object element;
    private DLNode next;
    private DLNode prev;

    DLNode(){
        this(null, null, null);
    }

    DLNode(Object element, DLNode prev, DLNode next){
        this.element = element;
        this.prev = prev;
        this.next = next;
    }

    public void setElement(Object newElement){
        element = newElement;
    }

    public void setNext(DLNode newNext){
        next = newNext;
    }

    public void setPrev(DLNode newPrev){
        prev = newPrev;
    }

    public Object getElement() {
        return element;
    }

    public DLNode getNext() {
        return next;
    }

    public DLNode getPrev() {
        return prev;
    }
}
