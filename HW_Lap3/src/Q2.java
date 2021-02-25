public class Q2 {
    int a[]={1,2,3};
    int b[]={4,5,6,7};
    public void Display(int c[])
    {
        for (int i = 0; i <c.length ; i++) {
            System.out.print(c[i]+"\t");
        }
        System.out.println();
    }
    public void Merging(int a[],int b[])
    {
        int c[]=new int[a.length+b.length];
        for (int i = 0; i <c.length ; i++) {
            if(i<a.length)
            {
                c[i]=a[i];
            }
            else
            {
                c[i]=b[i-a.length];
            }
        }
        Display(c);
    }

    public static void main(String[] args) {
        Q2 q =new Q2();
        q.Merging(q.a,q.b);
    }
}
