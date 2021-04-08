package src;

/**
 * Created by aamer ali on 16/03/21.
 */
public class Circulerlinkedlist <E> {
    private static class Node<E>
    {
        private E element;
        Node<E> next;
        public Node(E e,Node<E> n)
        {
            element=e;
            next=n;
        }
        public E getElement()
        {
            return element;
        }
        public Node<E> getNext()
        {
            return next;
        }
        public void setNext(Node<E> n)
        {
            next=n;
        }
    }
    private Node<E>tail=null;
    private int size=0;
    public int getSize()
    {
        return size;
    }
    public boolean isempty()
    {
        return size==0;
    }
    public E first()
    {
        if (isempty())return null;
        return tail.getNext().getElement();
    }
    public E last()
    {
        if (isempty())return null;
        return tail.getElement();
    }
    public void Addfirst(E e)
    {  if(size==0)
    {
        tail=new Node<E>(e,null);
        tail.setNext(tail);
    }
    else {
        Node<E> newest=new Node<E>(e,tail.getNext());
        tail.setNext(newest);
    }
        size++;
    }
    public void Addlast(E e)
    {
        Addfirst(e);
        tail=tail.getNext();
    }
    public E removefirst()
    {
        if (isempty())return null;
        Node<E> x=tail.getNext();
        if(x==tail)tail=null;
      else   tail.setNext(x.getNext());
        size--;
        return x.getElement();
    }
    public void Rotate()
    {
        if(!isempty()) tail=tail.getNext();
    }
}
