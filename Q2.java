import org.omg.CORBA.Object;

public class Q2 <A> {
    public static <A> void Display(A [] arr)
    {
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }
    public static <A> void merge(A [] arr1,A [] arr2)
    {      int l=0,m=0,k=0;
          A arr3[]=(A[])new Object[arr1.length+arr2.length];
        for (int i = 0; i <arr3.length ; i++) {
            if(i<arr1.length)
                arr3[i] = arr1[i];
            else
            {

                arr3[i]=arr2[i-arr1.length];
            }
        }
         Display(arr3);

    }
    public static void main(String[] args) {
        String a[]={"Hasan","Sharhan"};
        String b[]={"Anwer","Sharhan"};
        merge(a,b);
    }
}
