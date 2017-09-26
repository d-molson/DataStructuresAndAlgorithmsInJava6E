package Chapter4RecursionStacksQueues.Queues;

import Chapter4RecursionStacksQueues.LinkedLists.Node;

public class NodeQueue implements Queue {

    private int size = 0;
    private Node head;
    private Node tail;

    public void enqueue(Object object){
        Node node = new Node();
        node.setElement(object);
        node.setNext(null);
        if(size == 0){
            head = node;
        }
        else{
            tail.setNext(node);
        }
        tail = node;
        size++;
    }

    public Object dequeue() throws EmptyQueueException{
        if(size==0){
            throw new EmptyQueueException("Queue is empty.");
        }
        Object object = head.getElement();
        head = head.getNext();
        size--;
        if(size == 0){
            tail = null;
        }
        return object;
    }

    public boolean isEmpty(){
        return(size == 0);
    }

    public int size(){
        return(size);
    }

    public Object front() throws EmptyQueueException{
        if(size == 0){
            throw new EmptyQueueException("Queue is empty.");
        }
        return head.getElement();
    }

    public String toString(){
        String returnString = "[";
        Node currentNode = head;
        while(currentNode != null){
            if(currentNode.getNext() != null) {
                String listItem = "'" + currentNode.getElement() + "', ";
                returnString += listItem;
                currentNode = currentNode.getNext();
            }
            else{
                String listItem = "'" + currentNode.getElement() + "'";
                returnString += listItem;
                currentNode = currentNode.getNext();
            }
        }
        returnString += "]";
        return returnString;
    }

}
