package src;

import javax.xml.crypto.Data;

public class Ditailes {
    private double money;
    private String Amlah;
    private String time;
    private String Type;
    private int sta;
    public Ditailes(int s,double m,String a,String ty,String t)
    {
      sta=s;  money=m; Amlah=a; time=t; Type=ty;
    }
    public void Dsiplay()
    {
        System.out.print("Stack_No\tThe money\tAmlah\tType\tData");
        System.out.println();
        System.out.print(sta+"\t"+money+"\t"+Amlah+"\t"+Type+"\t"+time);
    }
}
