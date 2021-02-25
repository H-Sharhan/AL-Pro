import java.util.Scanner;

public class Q4 {
    static int a[]={1,2,3,4,5};

   static int i;
  int num=0;
//    public void Add(int value)
//    {
//        if(num<a.length)
//        {  num++;
//            for ( i = 0; i <a.length ; i++) {
//                a[i]=value;
//            }
//        }
//        else
//        {
//            System.out.println("Array is full");
//        }
//
//    }
    public boolean select(int value)
    {
        for ( i = 0; i <a.length ; i++) {
            if(a[i]==value)
            {
                return true;
            }
        }
       return false;
    }
    public static void main(String[] args) {
   Q4 q = new Q4();
        if(q.select(4)==true)
        {
            System.out.println("yes");
        }
    }
}
