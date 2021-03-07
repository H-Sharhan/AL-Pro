public class Part1_Q4 <E>{
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
            Node<E> newest=new Node<>(ele,tail.getNext());
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
    public void split(CircularLinkedlist c,CircularLinkedlist c1,CircularLinkedlist c2)
    {
        if(c.getSize()%2==0 )
        {
            c1.setSize(c.getSize()/2);
            c2.setSize(c.getSize()/2);
            for (int i = 0; i < c1.getSize(); i++) {
                if(c1.getSize()>i)
                c1.AddFirst(c.removefirst());
                c2.AddFirst(c.removefirst());
            }
        }
    }

    public static void main(String[] args) {
        Part1_Q4 p=new Part1_Q4();
        CircularLinkedlist c=new CircularLinkedlist();
        c.AddFirst("hassan");
        c.AddFirst("Anwer");
        c.AddFirst("mohammed");
        c.AddFirst("Sharhan");
        CircularLinkedlist c1=new CircularLinkedlist();
        CircularLinkedlist c2=new CircularLinkedlist();
        p.split(c,c1,c2);
    }
}
