public class Q1 {
    static void Reverse(int a[],int b[])
    {
        int num=0;
        for (int i = a.length-1; i >=0 ; i--) {
            b[num]=a[i];
            num++;
        }
    }
    static void Display(int a[],int b[])
    {  int i;
        System.out.println("Array A is ");
        for ( i = 0; i <a.length ; i++) {
            System.out.print(a[i]+"\t");
        }
        System.out.println("\n\n\n\n  Array B is ");
        for ( i = 0; i <b.length ; i++) {
            System.out.print(b[i]+"\t");
        }
    }

    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int b[]=new int[5];
        Reverse(a,b);
        Display(a,b);
    }
}
