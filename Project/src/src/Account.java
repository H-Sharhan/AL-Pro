package src;

import java.lang.reflect.Array;
import java.sql.*;
import java.util.Scanner;

public class Account {
    static Scanner s =new Scanner(System.in);
    private int account_no=354;
    private String account_na;
    private Operations op=new Operations();
    private LinkedStack<Operations> ope=new LinkedStack<>();

    public  void Addmoney(int Ac,double mo,int  ty)
    {
        op.AddMoney(Ac,mo,ty);
        ope.push(op);
    }
    public int count()
    {
        return ope.size();
    }

    public void Show_Your_Account()
    {      Operations l []=new Operations[ope.size()];
          int p=0;
          while (!ope.isempty()){
                   l[p]=ope.pop();
                   p++;
          }
        for (int i = 0; i <l.length ; i++) {
            System.out.println(l[i].toString());
        }
    }

}
