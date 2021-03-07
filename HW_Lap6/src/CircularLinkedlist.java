public class CircularLinkedlist<E>{
    private static class Node <E>{
        E elment;
        Node<E> next;

        public Node(E elment, Node<E> next) {
            this.elment = elment;
            this.next = next;
        }

        public E getElment() {
            return elment;
        }

        public void setElment(E elment) {
            this.elment = elment;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }

    }
    private Node<E> tail=null;
    private int size=0;
    public boolean isempty()
    {
        return size==0;
    }
    public int getSize()
    {
        return size;
    }
    public void setSize(int s)
    {
        size=s;
    }
    public E First()
    {
        if(isempty())return null;
        return tail.getNext().getElment();
    }
    public E Last()
    {
        if (isempty())return null;
        return tail.getElment();
    }
    public void AddFirst(E ele)
    {
        if(isempty())
        {
            tail=new Node<>(ele,null);
            tail.setNext(tail);
        }
        else {
            Node<E>newest=new Node<>(ele,tail.getNext());
            tail.setNext(newest);
        }
        size++;
    }
    public void AddLast(E ele)
    {
        AddFirst(ele);
        tail=tail.getNext();
    }
    public E removefirst()
    {
        if (isempty())return null;
        Node<E> head=tail.getNext();
        if(head==tail)tail=null;
        else tail.setNext(head.getNext());
        size--;
        return head.getElment();
    }
    public void rotate()
    {
        if(tail!=null)
        {
            tail=tail.getNext();
        }
    }
}
