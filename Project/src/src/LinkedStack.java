package src;

/**
 * Created by aamer ali on 17/03/21.
 */
public class LinkedStack<E>implements Stack<E> {
    public SingleLinkedlist<E> list=new SingleLinkedlist<>();
    public int sta=100;
    public void setSta (int s)
    {
        sta=s;
    }
    public int getSta()
    {
        return sta;
    }
    @Override
    public boolean isempty() {
        return list.isempty();
    }

    @Override
    public int size() {
        return list.getSize();
    }

    @Override
    public E top() {
        return list.First();
    }

    @Override
    public E pop() {
        return list.Removefirst();
    }

    @Override
    public void push(E element) {
       list.Addfirst(element);
    }

    @Override
    public void Display() {
       list.Display();
    }
}

