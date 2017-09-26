package Chapter4RecursionStacksQueues.Stacks;

/**
 * Created by dolson on 8/7/2017.
 */
public interface Stack {

    int size();

    boolean isEmpty();

    Object top() throws EmptyStackException;

    void push (Object element);

    Object pop() throws EmptyStackException;

}
