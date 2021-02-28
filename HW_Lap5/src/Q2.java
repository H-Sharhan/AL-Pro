public class Q2 <E> {
    private static class Node <E>
    {
        private E element ;
        private Node <E> next;
        public E getElement() {
            return element;
        }
        public void setElement(E element) {
            this.element = element;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }

        public Node(E element, Node<E> next) {
            this.element = element;
            this.next = next;
        }
    }
    private Node <E> head =null;
    private  Node <E> tail = null;
    private   int size =0;
    public boolean isEmpty()
    {
        return size==0;
    }
    public int getSize()
    {
        return size;
    }
    public E first()//ترد العنصر الاول الموجود في list
    {
        if(isEmpty())return null;
        return head.getElement();
    }
    public E last()//    ترد العنصر الاخير الموجود في list
    {
        if(isEmpty())return null;
        return tail.getElement();
    }
    public void Add_first(E e)
    {
        head=new Node<>(e,head);   //   هذا التعبير نفس x=x+5;
        if (size==0)
            tail=head;
        size++;
    }
    public void Add_Last(E e)
    {
        Node<E> newest=new Node<>(e,null);
        if (isEmpty()) head=newest;
        else tail.setNext(newest);//لوما اسوي هكذا معناه انني بنخلي النود الذي كانت الاخيرة تاشر على النود الجديده
        tail=newest;
        size++;
    }
    public E removefirst ()
    {
        if(isEmpty())return null;
        E deleted = head.getElement();
        head=head.getNext();
        size--;
        if(size==0)
        {
            tail=null;
        }
        return deleted;
    }
    public String print()
    {  Node <E> i=head;
        String all="";
        while (i !=null)
        {
            all=all+i.getElement().toString()+"\n";
            i=i.getNext();
        }
        return all;
    }
   public void concatenating(Node <E> t,Node <E> h)
   {
       t.setNext(h);
   }



    public static void main(String[] args) {
        Q2 f=new Q2();
        Q2 l= new Q2();
        f.Add_first("Mohammed");
        f.Add_first("Alhassan");
        f.Add_Last("Ali");
        l.Add_first("Mohammed");
        l.Add_first("Anwer");
        l.Add_Last("Ali");
        System.out.println(f.print());
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        System.out.println(l.print());
        f.concatenating(f.tail,l.head);
        System.out.println(f.print());
        System.out.println(l.print());
    }




}
