package Chapter4RecursionStacksQueues.Stacks;

import java.util.*;

/**
 * Created by dolson on 8/7/2017.
 */
public class ArrayStack implements Stack {

    public static final int CAPACITY = 100;
    protected int capacity;
    protected Object S[];
    protected int top = -1;

    public ArrayStack() {
        this(CAPACITY);
    }

    public ArrayStack(int cap){
        capacity = cap;
        S = new Object[capacity];
    }

    public int size(){
        return(top+1);
    }

    public boolean isEmpty(){
        return(top < 0);
    }

    public void push(Object obj) throws FullStackException{
        if(size() == capacity){
            throw new FullStackException("Stack overflow.");
        }
        S[++top] = obj;
    }

    public Object top() throws EmptyStackException {
        if(isEmpty()){
            throw new EmptyStackException("Stack is empty.");
        }
        return S[top];
    }

    public Object pop() throws EmptyStackException {
        Object elem;
        if(isEmpty()){
            throw new EmptyStackException("Stack is empty.");
        }
        elem = S[top];
        S[top--] = null;
        return elem;
    }

}
