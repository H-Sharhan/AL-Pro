public class Q3 {
    public static void main(String[] args) {
        int a []={1,2,2,3,4};
        int co=0,i=0,j=0,index=0;
        for(i=0;i<a.length;i++) {
            for (j = 0; j < a.length; j++) {
                if (a[i] == a[j]) {
                    co++;
                    if (co >= 2) {
                        index = a[i];
                    }
                }
            }
            co=0;
        }
        System.out.println("The Elment is   " + index);
    }
}
