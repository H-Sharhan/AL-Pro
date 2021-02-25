public class Q4 {
    public static void main(String[] args) {
        int a []={1,2,2,3,4,4,5,6,6,7,8,8,9,10,10};
        int co=0,i=0,j=0,index[]=new int[5],l=0,m;
        for(i=0;i<a.length;i++) {
            for (j = 0; j < a.length; j++) {
                if (a[i] == a[j]) {
                    co++;
                    if (co >= 2) {
                          while (l<=4)
                          {
                              for (int k =0; k <index.length ; k++) {
                                  if(index[k]==a[i])
                                  {
                                      break;
                                  }
                                  else
                                  {
                                      index[l]=a[i];
                                      break;
                                  }
                              }
                           //  index[l]=a[i];
                              l++;
                              break;
                          }
                    }
                }
            }
            co=0;
        }
        for (int k = 0; k <index.length ; k++) {
            System.out.println("The Elments are   " + index[k]);
        }

    }
}
