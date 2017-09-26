package Chapter4RecursionStacksQueues.LinkedLists;

import Chapter4RecursionStacksQueues.Stacks.EmptyStackException;
import Chapter4RecursionStacksQueues.Stacks.Stack;

/**
 * Created by dolson on 8/9/2017.
 */
public class NodeStack implements Stack {

    protected Node top;
    protected int size;

    public NodeStack(){
        top = null;
        size = 0;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return(top == null);
    }

    public void push(Object elem){
        Node v = new Node(elem, top);
        top = v;
        size++;
    }

    public Object top() throws EmptyStackException{
        if(isEmpty()){
            throw new EmptyStackException("Stack is empty.");
        }
        return top.getElement();
    }

    public Object pop() throws EmptyStackException{
        if(isEmpty()){
            throw new EmptyStackException("Stack is empty.");
        }
        Object temp = top.getElement();
        top = top.getNext();
        size--;
        return temp;
    }
}
