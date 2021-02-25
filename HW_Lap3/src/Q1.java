public class Q1 {
    int a[]={1,2,3,4,5};
    public boolean search(int a[],int number)
    {
        boolean bo=false;
        for (int i = 0; i <a.length ; i++) {
            if(a[i]==number)
            {
                bo= true;
            }
        }
        return bo;
    }

    public static void main(String[] args) {
        Q1 q =new Q1();
        if(q.search(q.a,90)==true)
        {
            System.out.println("Yes it is here");
        }
    }
}
