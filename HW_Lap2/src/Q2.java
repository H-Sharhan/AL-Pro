public class Q2 {
    static void   Clone_Array(int a[],int b[])
    {
        for (int i = 0; i <a.length ; i++) {
            b[i]=a[i];
        }

    }
   static void Display(int b[])
   {
       for (int i = 0; i <b.length ; i++) {
           System.out.print(b[i]+"\t");
       }
       System.out.println("\n\n");
   }
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int b[]=new int[5];
       Clone_Array(a,b);
       Display(b);
    }
}
