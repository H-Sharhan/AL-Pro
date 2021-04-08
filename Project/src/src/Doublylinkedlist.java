package src;

import java.util.LinkedList;

/**
 * Created by aamer ali on 16/03/21.
 */
public class Doublylinkedlist <E> {
    private static class Node<E>{
        private Node<E>pre;
        private Node<E> next;
        private E element;
        public Node(E e,Node<E> p,Node<E> n)
        {
            element=e;
            pre=p;
            next=n;
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
        public void setNext(Node<E> n)
        {
            next=n;
        }
        public void setPre(Node<E> p)
        {
            pre=p;
        }
    }
   private Node<E>header;
   private Node<E>trailer;
    private int size=0;
    public Doublylinkedlist()
    {
        header=new Node<E>(null,null,null);
        trailer=new Node<E>(null,header,null);
        header.setNext(trailer);
    }
    public int getSize(){
        return size;
    }
    public boolean  isempty()
    {
        return size==0;
    }
    public E first()
    {
        if (isempty())return null;
        return header.getNext().getElement();
    }
    public E last()
    {
        if (isempty())return null;
        return trailer.getPre().getElement();
    }
    private void Addbetween(E e,Node<E> p,Node<E> n)
    {
        Node<E> newest=new Node<E>(e,p,n);
        p.setNext(newest);
        n.setPre(newest);
        size++;
    }
    public E remove(Node<E> node)
    {
        Node<E>p=node.getPre();
        Node<E> n=node.getNext();
        p.setNext(n);
        n.setPre(p);
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
    public E renovefirst()
    {
        if (isempty())return null;
        return remove(header.getNext());
    }
    public E removelast()
    {
        if (isempty())return null;
        return remove(trailer.getPre());
    }
    public void Display()
    { if (isempty()) System.out.println("The List is empty");
        Node<E> t=header;

        while (t.getNext()!=null)
        {
            System.out.println(t.getElement());
            t=t.getNext();
        }
        System.out.println(t.getElement());
    }
    LinkedList<Employee>list=new LinkedList<>();

//    public boolean rmove1( int e)
//    { boolean l=false;
//        if(list.isEmpty())return l;
//        else {
//            LinkedList<Employee>list2=new LinkedList<>();
//            for (int i = 0; i <list.size() ; i++) {
//                if(list.removeFirst().getIdNumber()==e)
//                {
//                    list.remove(i);
//                    l=true;
//                }
//                  else {
//                    list2.addLast(list.removeFirst());
//                }
//
//            }
//        }
//        return l;
//    }


//    public boolean rmove1( int e)
//    { boolean l=false;
//        if(list.isEmpty())return l;
//        else {
//            LinkedList<Employee>list2=new LinkedList<>();
//            for (int i = 0; i <list.size() ; i++) {
//                list2.addLast(list.removeFirst());
//                if(list2.getFirst().getIdNumber()==e)
//                {
//                    list2.remove(i);
//                }
//            }
//        }
//        return l;
//    }


//   if (isempty()) System.out.println("Null");
//    Node<E>x=header;
//        while (x.getNext()!=null)
//    {
//        if(x.getElement()==e)
//        {
//            return    remove(x);
//        }
//        x=x.getNext();
//    }
//       return null;

}
