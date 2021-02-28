public class Q3 <E> {
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

    public E second_to_last()
    {
        E del;
        Node<E> he=head;
        Node<E> hea=head;
        if(isEmpty())return null;
        else {
            while (he.getNext()!=null)
            {
                hea=he;
                he=he.getNext();
            }
            del=hea.getElement();
        }
        return del;
    }


    public static void main(String[] args) {
        Q3 q = new Q3();
        q.Add_first("Mohammed");
        q.Add_first("Hasan");
        q.Add_Last("Ali");
        System.out.println(q.second_to_last());
    }
}
