package src;

/**
 * Created by aamer ali on 17/03/21.
 */
public interface Stack<E> {
    boolean isempty();
    int size();
    E top();
    E pop();
    void push (E element);
    void Display();
}
