import java.util.Scanner;

public class Q3 {
    public void Remove(int a[],int chose)
    {   int i;
        if (chose==1)
        {
            for ( i =a.length-1 ; i >0; i--) {
                a[i]=a[i-1];
            }
            a[i]=0;
            for (i=0;i<a.length;i++)
            {
                System.out.print(a[i]+"\t");
            }
        }
        else {
            for ( i = 0; i <a.length-1 ; i++) {
                a[i]=a[i+1];
            }
            a[i]=0;
            for (i=0;i<a.length;i++)
            {
                System.out.print(a[i]+"\t");
            }
        }
    }
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        Scanner s = new Scanner(System.in);
        System.out.println("Chose The Remove If it's from Right Enter 1 Or 2 If it's Left");
        int an=s.nextInt();
       Q3 q =new Q3();
       q.Remove(a,an);
    }
}
