package src;

import java.sql.*;
import java.util.Dictionary;
import java.util.LinkedList;
import java.util.Scanner;

public class Manager {

    private Doublylinkedlist<SalariedEmpolyee> salary=new Doublylinkedlist<>();
    private Doublylinkedlist<HourlyEmpolyee> hourly=new Doublylinkedlist<>();
    private Doublylinkedlist<Employee> employee=new Doublylinkedlist<>();
    // private Doublylinkedlist<Customer> cus=new Doublylinkedlist<>();
    //private LinkedList<Employee> employee=new LinkedList<>();
    private Doublylinkedlist<Customer> customer=new Doublylinkedlist<>();
    private int sta=100;
    static Scanner s = new Scanner(System.in);
    /**
     * This Cunstructor for Manager is Default
     */
    public Manager(){
    }
    public int Count_Hou_Employees()
    {

        return hourly.getSize();
    }
    public int Count_Employees()
    {

        return employee.getSize();
    }
    public int Count_Sal_Employees()
    {

        return salary.getSize();
    }
    public int Count_Customer()
    {

        return customer.getSize();
    }
//    public void Display_E()
//    {LinkedList<Employee>list2=new LinkedList<>();
//        for (int i = 0; i <employee.size() ; i++) {
//
//            list2.addLast(employee.removeFirst());
//            list2.getFirst().Display();
//        }
//    }

    public boolean rmove1( int ee)
    { boolean ll=false;
        if(employee.isempty())return ll;
        else {
            Doublylinkedlist<Employee>list2=new Doublylinkedlist<>();
            for (int i = 0; i <employee.getSize() ; i++) {
                list2.Addlast(employee.renovefirst());
                if(list2.first().getIdNumber()==ee)
                {
                    list2.renovefirst();
                    ll=true;
                }
            }
//            for (int j = 0; j <list2.getSize() ; j++) {
//                employee.Addlast(list2.renovefirst());
//            }
        }
        return ll;
    }

    public boolean rmove2( int ac)
    { boolean ll=false;
        if(customer.isempty())return ll;
        else {
            Doublylinkedlist<Customer>list2=new Doublylinkedlist<>();
            for (int i = 0; i <employee.getSize() ; i++) {
                list2.Addlast(customer.renovefirst());

                if(list2.first().getAccountNumber()==ac)
                {
                    list2.renovefirst();
                    ll=true;
                }
            }

        }
        customer.renovefirst();
        return ll;
    }
    public boolean Add_Employees(String f,String l,String a,int p)
    {
        int i=1002;  double sa=60000,sal=36000;

        try {
            Connection con = DriverManager.getConnection("jdbc:ucanaccess://F:\\MY.accdb");
            PreparedStatement statement= con.prepareStatement("INSERT INTO Employees(E_ID,F_Name,L_Name,E_Add,Phone,E_Salary) VALUES (?,?,?,?,?,?)");
            statement.setString(2,f);
            statement.setString(3,l);
            statement.setString(4,a);
            statement.setInt(5,p);
            System.out.println("If you Salary Enter 1 OR 2 if you Hourly");
            int ans=s.nextInt();
            if(ans==1)
            {

               salary.Addfirst(new SalariedEmpolyee(f,l,a,p));
                employee.Addfirst(new SalariedEmpolyee(f,l,a,p));
            //    employee.addFirst(new SalariedEmpolyee(f,l,a,p));
                statement.setInt(1,++i);
                statement.setDouble(6,sa);
            }
            else {
                hourly.Addfirst(new HourlyEmpolyee(f,l,a,p));
                employee.Addfirst(new HourlyEmpolyee(f,l,a,p));
              ///  employee.addFirst(new HourlyEmpolyee(f,l,a,p));
                statement.setInt(1,++i);
                statement.setDouble(6,sal);
            }
            int row =statement.executeUpdate();
            con.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return true;
    }
    /**
     *
     * @return  this Function use to Remove Employees
     */
   public boolean RemoveEmployee(int id)
   { boolean l=false;
//       for (int i = 0; i <employees.size() ; i++) {
//           if(employees.get(i).IdNumber==idnumber)
//           {
//              employees.remove(i);
//               l=true;
//           }
//       }
//       return l;
       try
       {
           Connection con = DriverManager.getConnection("jdbc:ucanaccess://F:\\MY.accdb");
           Statement stat =con.createStatement();
           ResultSet re=stat.executeQuery("Select * from Employees");
           rmove1(id);
           while (re.next())
           {
               if(re.getInt("E_Id")==id)
               {
                   stat.execute("DELETE FROM Employees WHERE E_Id ="+id);
                   l=true;
                   con.close();
               }
           }
       } catch (SQLException throwables) {
           throwables.printStackTrace();
       }
       return l;
   }
    public void Display_Employees()
    {
        try
        {
            Connection con = DriverManager.getConnection("jdbc:ucanaccess://F:\\MY.accdb");
            Statement stat =con.createStatement();
            ResultSet re=stat.executeQuery("Select * from Employees");
            while (re.next())
            {
                System.out.println(re.getInt("E_Id")+"\t"+re.getString("F_Name")+"\t"+re.getString("L_Name")+"\t"+re.getString("E_Add")+"\t"+re.getInt("Phone")+"\t"+re.getDouble("E_Salary"));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    public void Display_Employee(int id)
    {
        try
        {
            Connection con = DriverManager.getConnection("jdbc:ucanaccess://F:\\MY.accdb");
            Statement stat =con.createStatement();
            ResultSet re=stat.executeQuery("Select * from Employees");
            while (re.next())
            {
                if(re.getInt("E_Id")==id)
                {
                    System.out.println(re.getInt("E_Id")+"\t"+re.getString("F_Name")+"\t"+re.getString("L_Name")+"\t"+re.getString("E_Add")+"\t"+re.getInt("Phone")+"\t"+re.getDouble("E_Salary"));
                }
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    public boolean Add_Customers(String f,String l,String a,int p)
    {    boolean bo=false;int ac=353;
        try {
            Connection con = DriverManager.getConnection("jdbc:ucanaccess://F:\\MY.accdb");
            PreparedStatement statement= con.prepareStatement("INSERT INTO Customer (C_Acc,F_Name,L_Name,C_Add,Phone,YEMENI,KSA,DOLAR) VALUES (?,?,?,?,?,?,?,?)");
            statement.setInt(1,++ac);
            statement.setString(2,f);
            statement.setString(3,l);
            statement.setString(4,a);
            statement.setInt(5,p);
           statement.setDouble(6,0);
           statement.setDouble(7,0);
           statement.setDouble(8,0);

            customer.Addfirst(new Customer(f,l,a,p));

            new LinkedStack<Ditailes>();
            int row =statement.executeUpdate();
            con.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return bo=true;
    }
    /**
     *
     * @return  this Function use to Remove Customer
     */
   public boolean RemoveCustomer(int accountnumber)
   {
       boolean l=false;
//       for (int i = 0; i <customers.size() ; i++) {
//           if(customers.get(i).getAccountNumber()==accountnumber)
//           {
//               customers.remove(i);
//               l=true;
//           }
//       }
//       return l;

       try
       {
           Connection con = DriverManager.getConnection("jdbc:ucanaccess://F:\\MY.accdb");
           Statement stat =con.createStatement();
           ResultSet re=stat.executeQuery("Select * from Customer");
         //   cus.rmove1(accountnumber);

           while (re.next())
           {
               if(re.getInt("C_Acc")==accountnumber)
               {
                   stat.execute("DELETE FROM Customer WHERE C_Acc ="+accountnumber);
                   l=true;
                   con.close();
               }
           }
       } catch (SQLException throwables) {
           throwables.printStackTrace();
       }
       return l;
   }

    public void Display_Customers()
    {
        try
        {
            Connection con = DriverManager.getConnection("jdbc:ucanaccess://F:\\MY.accdb");
            Statement stat =con.createStatement();
            ResultSet re=stat.executeQuery("Select * from Customer");
            while (re.next())
            {
                System.out.println(re.getInt("C_Acc")+"\t"+re.getString("F_Name")+"\t"+re.getString("L_Name")+"\t"+re.getString("C_Add")+"\t"+re.getInt("Phone")+"\t"+re.getDouble("YEMENI")+"\t"+re.getDouble("KSA")+"\t"+re.getDouble("DOLAR"));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    public void Display_Customer(int ac)
    {
        try
        {
            Connection con = DriverManager.getConnection("jdbc:ucanaccess://F:\\MY.accdb");
            Statement stat =con.createStatement();
            ResultSet re=stat.executeQuery("Select * from Customer");
            while (re.next())
            {
                if(re.getInt("C_Acc")==ac)
                {
                    System.out.println(re.getInt("C_Acc")+"\t"+re.getString("F_Name")+"\t"+re.getString("L_Name")+"\t"+re.getString("C_Add")+"\t"+re.getInt("Phone")+"\t"+re.getDouble("YEMENI")+"\t"+re.getDouble("KSA")+"\t"+re.getDouble("DOLAR"));
                }
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

}