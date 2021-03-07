public class Part1_Q3 <E> {
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
    public boolean isequel(CircularLinkedlist c1,CircularLinkedlist c2)
    {  boolean l=true;
        if(c1.getSize()==c2.getSize())
        {
            while (c1.getSize()>0 && c2.getSize()>0)
            {
                if(c1.removefirst()!=c2.removefirst())
                {
                   l=false;
                }
            }
        }
        else {
           l=false;
        }
        return l;
    }

    public static void main(String[] args) {
        Part1_Q3 p=new Part1_Q3();
        CircularLinkedlist s =new CircularLinkedlist();
        CircularLinkedlist s1=new CircularLinkedlist();
        s.AddFirst("Ali");
        s.AddFirst("Anwer");
        s.AddFirst("hassan");
        s1.AddFirst("Ali");
        s1.AddFirst("Anwer");
        s1.AddFirst("hassan");
        if(p.isequel(s,s1)==true)
        {
            System.out.println("Yes");
        }
    }
}
