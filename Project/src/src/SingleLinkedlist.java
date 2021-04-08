package src;

/**
 * Created by aamer ali on 16/03/21.
 */
public class SingleLinkedlist <E>{
    private static class Node<E>{
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
    private Node<E>head=null;
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
    public E First()
    {
        if (isempty())return null;
        return head.getElement();
    }
    public E Last()
    {
        if(isempty())return null;
        return tail.getElement();
    }
    public void Addfirst(E e)
    {
        head=new Node<E>(e,head);
        if (size==0)
        {
            tail=head;
        }
        size++;
    }
    public void Addlast(E e)
    {
        Node<E> newest=new Node<E>(e,null);
        if(isempty()) head=tail;
        tail.setNext(newest);
        tail=newest;
        size++;
    }
    public E Removefirst()
    {  E x;
        if (isempty())return null;
         x=head.getElement();
        head=head.getNext();
        size--;
        if (isempty())
            tail=null;
        return x;
    }
    public void Display()
    {
        if (isempty()) System.out.println("The list is empty");
        Node<E> t=head;
        while (t.getNext()!=null)
        {
            System.out.println(t.getElement());
            t=t.getNext();
        }
        System.out.println(t.getElement());
    }


}
