import java.util.Scanner;

public class Q1 {
    public static <A> void revers_Array(A[] arr)
    {

        for (int i = arr.length-1; i >=0 ; i--) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        Integer a[]={1,2,3,4,5};
        String  c[]={"Hasan","b","c"};
        Character cc []={'c','k'};
        revers_Array(a);
        revers_Array(c);
        revers_Array(cc);
    }
}
