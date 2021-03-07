public class Part2_Q3 <E> {
    private static class Node<E>{
        private E element;
        private Node<E> pre;
        private Node<E> next;
        public Node(E e , Node<E> pr, Node<E> ne)
        {
            element=e;
            pre=pr;
            next=ne;
        }
        public E getElement()
        {
            return element;
        }
        public Node<E> getPre()
        {
            return pre;
        }
        public Node<E> getNext()
        {
            return next;
        }
        public void setPre(Node<E> pr)
        {
            pre=pr;
        }
        public void setNext(Node<E> ne)
        {
            next=ne;
        }
    }
    private Node<E> header=null;
    private Node<E> trailer=null;
    private int size=0;
    public Part2_Q3()
    {
        header=new Node<>(null,null,null);
        trailer=new Node<>(null,header,null);
        header.setNext(trailer);
    }
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
        if(isempty())return null;
        return header.getNext().getElement();
    }

    public E last()
    {
        if(isempty())return null;
        return trailer.getPre().getElement();
    }
    private void Addbetween(E e , Node<E> pred, Node<E> succ)
    {
        Node<E> newest = new Node<>(e,pred,succ);
        pred.setNext(newest);
        succ.setPre(newest);
        size++;
    }
    private E remove(Node<E> node)
    {
        Node<E> pred=node.getPre();
        Node<E> succ=node.getNext();
        pred.setNext(succ);
        succ.setPre(pred);
        size--;
        return node.getElement();
    }
    public void Addfirst(E e)
    {
        Addbetween(e,header,header.getNext());
    }
    public void Addlast(E e)
    {
        Addbetween(e,trailer.getPre(),trailer);
    }
    public E removefirst()
    {
        if(isempty())return null;
        return remove(header.getNext());
    }
    public E removelast()
    {
        if(isempty())return null;
        return remove(trailer.getPre());
    }
    public boolean isequel(DoublyLinkedList c1,DoublyLinkedList c2)
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
        Part2_Q3 p=new Part2_Q3();
        DoublyLinkedList s =new DoublyLinkedList();
        DoublyLinkedList s1=new DoublyLinkedList();
        s.Addfirst("Ali");
        s.Addfirst("Anwer");
        s.Addfirst("hassan");
        s1.Addfirst("Ali");
        s1.Addfirst("Anwer");
        s1.Addfirst("hassan");
        if(p.isequel(s,s1)==true)
        {
            System.out.println("Yes");
        }
    }
}
