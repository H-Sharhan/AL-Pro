package src;

import javax.swing.*;
import java.util.LinkedList;
import java.util.Scanner;

public class Testing {



    public static void main(String[] args) {

        Scanner s =new Scanner(System.in);
        Manager m=new Manager();
          Account a =new Account();

        System.out.println("Count of Employees  = "+m.Count_Employees());
        System.out.println("Count of Customer  = "+m.Count_Customer());


        m.Add_Employees("Hasan","Sharhan","Saana'a",77087422);


        System.out.println("Count of Employees  = "+m.Count_Employees());


        m.Add_Customers("Ali","Ahmed","Sana'a",8765433);

        System.out.println("Count of Customer  = "+m.Count_Customer());

        System.out.println("Enter id number");
        int id=s.nextInt();
        m.rmove1(id);
        System.out.println("Count of Employees  = "+m.Count_Employees());

        System.out.println("Enter account number");
        int ac=s.nextInt();
        m.rmove2(ac);
        System.out.println("Count of Customer  = "+m.Count_Customer());

        a.Addmoney(350,1000,1);
        a.Addmoney(350,1000,1);
        a.Show_Your_Account();



        }
    }
