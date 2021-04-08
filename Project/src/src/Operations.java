package src;

import java.sql.*;
import java.util.Arrays;
import java.util.Date;

public class Operations {
    //LinkedStack<Account> acc=new LinkedStack<>();
   private static int i=0;
 //  int jk=i++;
    @Override
    public String toString() {

            return "Operations{" +
                    "abider=" + abider[i] +
                    ", data=" + d +
                    ", mal=" + mal[i] +
                    ", operation='" + op + '\'' +
                    '}';

    }

    private double abider [];//الباقي
    private Date d;
    private double  mal [];
    private String op;

    public Operations()
    {
        abider=new double[3];
        mal=new double[3];
        d=new Date();
    }
    public boolean AddMoney(int Ac, double mo, int  ty)
    {  double money=0;
          mal[i]=mo;
        boolean l=false;
        if(ty == 1)
        {
            try
            {
                Connection con = DriverManager.getConnection("jdbc:ucanaccess://F:\\MY.accdb");
                Statement stat =con.createStatement();
                ResultSet re=stat.executeQuery("Select * from Customer");

                while (re.next())
                {
                    if(re.getInt("C_Acc")==Ac)
                    {

                        System.out.println("Welcome  "+re.getString("F_Name")+"  "+re.getString("L_Name"));
                        money=re.getDouble("YEMENI");
                        mo=mo+money;
                        stat.execute("UPDATE Customer SET YEMENI ="+mo+" "+"WHERE C_Acc ="+Ac);
                        //acc.push(1);
                        l=true;
                        con.close();
                    }
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            abider[i]=mo;
            op="add";
        }
        if(ty==2)
        {

            try
            {
                Connection con = DriverManager.getConnection("jdbc:ucanaccess://F:\\MY.accdb");
                Statement stat =con.createStatement();
                ResultSet re=stat.executeQuery("Select * from Customer");

                while (re.next())
                {
                    if(re.getInt("C_Acc")==Ac)
                    {
                        System.out.println("Welcome  "+re.getString("F_Name")+"  "+re.getString("L_Name"));
                        money=re.getDouble("KSA");
                        mo=mo+money;
                        stat.execute("UPDATE Customer SET KSA ="+mo+" "+"WHERE C_Acc ="+Ac);
                        //acc.push(1);
                        l=true;
                        con.close();
                    }
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            abider[i]=mo;
           op="add";
        }
        if(ty==3)
        {

            try
            {
                Connection con = DriverManager.getConnection("jdbc:ucanaccess://F:\\MY.accdb");
                Statement stat =con.createStatement();
                ResultSet re=stat.executeQuery("Select * from Customer");

                while (re.next())
                {
                    if(re.getInt("C_Acc")==Ac)
                    {
                        System.out.println("Welcome  "+re.getString("F_Name")+"  "+re.getString("L_Name"));
                        money=re.getDouble("DOLAR");
                        mo=mo+money;
                        stat.execute("UPDATE Customer SET DOLAR ="+mo+" "+"WHERE C_Acc ="+Ac);
                        //acc.push(1);
                        l=true;
                        con.close();
                    }
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            abider[i]=mo;
            op="add";
        }
       return l;
    }
    /**
     *
     * @param mo  this parameter for Money (1) AccountNumber
     * @param ty this parameter For Type (1) of Money
     * @param mon this parameter for Money (2) AccountNumber
     * @param typ this parameter For Type (2) of Money
     * @return  boolean
     */
    public boolean AddMoney(int Ac,double mo,int  ty,double mon,int typ)
    { double money1=0,money2=0;
    mal[0]=mo; mal[1]=mon;
        boolean l=false;
        if(ty==1 && typ==2)
        {
            try
            {
                Connection con = DriverManager.getConnection("jdbc:ucanaccess://F:\\MY.accdb");
                Statement stat =con.createStatement();
                ResultSet re=stat.executeQuery("Select * from Customer");

                while (re.next())
                {
                    if(re.getInt("C_Acc")==Ac)
                    {
                        System.out.println("Welcome  "+re.getString("F_Name")+"  "+re.getString("L_Name"));
                        money1=re.getDouble("YEMENI");
                        mo=mo+money1;
                        stat.execute("UPDATE Customer SET YEMENI ="+mo+" "+"WHERE C_Acc ="+Ac);
                        //acc.push(1);
                        l=true;
                        con.close();
                    }
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            try
            {
                Connection con = DriverManager.getConnection("jdbc:ucanaccess://F:\\MY.accdb");
                Statement stat =con.createStatement();
                ResultSet re=stat.executeQuery("Select * from Customer");

                while (re.next())
                {
                    if(re.getInt("C_Acc")==Ac)
                    {
                        //     System.out.println("Welcome  "+re.getString("F_Name")+"  "+re.getString("L_Name"));
                        money2=re.getDouble("KSA");
                        mon=mon+money2;
                        stat.execute("UPDATE Customer SET KSA ="+mon+" "+"WHERE C_Acc ="+Ac);
                        //acc.push(1);
                        l=true;
                        con.close();
                    }
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            abider[0]=mo;  abider[1]=mon;
            op="add";
        }
        if(ty==1 && typ==3)
        {
            try
            {
                Connection con = DriverManager.getConnection("jdbc:ucanaccess://F:\\MY.accdb");
                Statement stat =con.createStatement();
                ResultSet re=stat.executeQuery("Select * from Customer");

                while (re.next())
                {
                    if(re.getInt("C_Acc")==Ac)
                    {
                        System.out.println("Welcome  "+re.getString("F_Name")+"  "+re.getString("L_Name"));
                        money1=re.getDouble("YEMENI");
                        mo=mo+money1;
                        stat.execute("UPDATE Customer SET YEMENI ="+mo+" "+"WHERE C_Acc ="+Ac);
                        //acc.push(1);
                        l=true;
                        con.close();
                    }
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            try
            {
                Connection con = DriverManager.getConnection("jdbc:ucanaccess://F:\\MY.accdb");
                Statement stat =con.createStatement();
                ResultSet re=stat.executeQuery("Select * from Customer");

                while (re.next())
                {
                    if(re.getInt("C_Acc")==Ac)
                    {
                        //   System.out.println("Welcome  "+re.getString("F_Name")+"  "+re.getString("L_Name"));
                        money2=re.getDouble("DOLAR");
                        mon=mon+money2;
                        stat.execute("UPDATE Customer SET DOLAR ="+mon+" "+"WHERE C_Acc ="+Ac);
                        //acc.push(1);
                        l=true;
                        con.close();
                    }
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            abider[0]=mo;  abider[1]=mon;
            op="add";
        }
        if(ty==2 && typ==1)
        {
            try
            {
                Connection con = DriverManager.getConnection("jdbc:ucanaccess://F:\\MY.accdb");
                Statement stat =con.createStatement();
                ResultSet re=stat.executeQuery("Select * from Customer");

                while (re.next())
                {
                    if(re.getInt("C_Acc")==Ac)
                    {
                        System.out.println("Welcome  "+re.getString("F_Name")+"  "+re.getString("L_Name"));
                        money1=re.getDouble("KSA");
                        mo=mo+money1;
                        stat.execute("UPDATE Customer SET KSA ="+mo+" "+"WHERE C_Acc ="+Ac);
                        //acc.push(1);
                        l=true;
                        con.close();
                    }
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            try
            {
                Connection con = DriverManager.getConnection("jdbc:ucanaccess://F:\\MY.accdb");
                Statement stat =con.createStatement();
                ResultSet re=stat.executeQuery("Select * from Customer");

                while (re.next())
                {
                    if(re.getInt("C_Acc")==Ac)
                    {
                        // System.out.println("Welcome  "+re.getString("F_Name")+"  "+re.getString("L_Name"));
                        money2=re.getDouble("YEMENI");
                        mon=mon+money2;
                        stat.execute("UPDATE Customer SET YEMENI ="+mon+" "+"WHERE C_Acc ="+Ac);
                        //acc.push(1);
                        l=true;
                        con.close();
                    }
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            abider[0]=mo;  abider[1]=mon;
            op="add";
        }
        if(ty==2 && typ==3)
        {
            try
            {
                Connection con = DriverManager.getConnection("jdbc:ucanaccess://F:\\MY.accdb");
                Statement stat =con.createStatement();
                ResultSet re=stat.executeQuery("Select * from Customer");

                while (re.next())
                {
                    if(re.getInt("C_Acc")==Ac)
                    {
                        System.out.println("Welcome  "+re.getString("F_Name")+"  "+re.getString("L_Name"));
                        money1=re.getDouble("KSA");
                        mo=mo+money1;
                        stat.execute("UPDATE Customer SET KSA ="+mo+" "+"WHERE C_Acc ="+Ac);
                        //acc.push(1);
                        l=true;
                        con.close();
                    }
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            try
            {
                Connection con = DriverManager.getConnection("jdbc:ucanaccess://F:\\MY.accdb");
                Statement stat =con.createStatement();
                ResultSet re=stat.executeQuery("Select * from Customer");

                while (re.next())
                {
                    if(re.getInt("C_Acc")==Ac)
                    {
                        //System.out.println("Welcome  "+re.getString("F_Name")+"  "+re.getString("L_Name"));
                        money2=re.getDouble("DOLAR");
                        mon=mon+money2;
                        stat.execute("UPDATE Customer SET DOLAR ="+mon+" "+"WHERE C_Acc ="+Ac);
                        //acc.push(1);
                        l=true;
                        con.close();
                    }
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            abider[0]=mo;  abider[1]=mon;
            op="add";
        }
        if(ty==3 && typ==1)
        {
            try
            {
                Connection con = DriverManager.getConnection("jdbc:ucanaccess://F:\\MY.accdb");
                Statement stat =con.createStatement();
                ResultSet re=stat.executeQuery("Select * from Customer");

                while (re.next())
                {
                    if(re.getInt("C_Acc")==Ac)
                    {
                        System.out.println("Welcome  "+re.getString("F_Name")+"  "+re.getString("L_Name"));
                        money1=re.getDouble("DOLAR");
                        mo=mo+money1;
                        stat.execute("UPDATE Customer SET DOLAR ="+mo+" "+"WHERE C_Acc ="+Ac);
                        //acc.push(1);
                        l=true;
                        con.close();
                    }
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            try
            {
                Connection con = DriverManager.getConnection("jdbc:ucanaccess://F:\\MY.accdb");
                Statement stat =con.createStatement();
                ResultSet re=stat.executeQuery("Select * from Customer");

                while (re.next())
                {
                    if(re.getInt("C_Acc")==Ac)
                    {
                        //System.out.println("Welcome  "+re.getString("F_Name")+"  "+re.getString("L_Name"));
                        money2=re.getDouble("YEMENI");
                        mon=mon+money2;
                        stat.execute("UPDATE Customer SET YEMENI ="+mon+" "+"WHERE C_Acc ="+Ac);
                        //acc.push(1);
                        l=true;
                        con.close();
                    }
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            abider[0]=mo;  abider[1]=mon;
            op="add";
        }
        if(ty==3 && typ==2)
        {
            try
            {
                Connection con = DriverManager.getConnection("jdbc:ucanaccess://F:\\MY.accdb");
                Statement stat =con.createStatement();
                ResultSet re=stat.executeQuery("Select * from Customer");

                while (re.next())
                {
                    if(re.getInt("C_Acc")==Ac)
                    {
                        System.out.println("Welcome  "+re.getString("F_Name")+"  "+re.getString("L_Name"));
                        money1=re.getDouble("DOLAR");
                        mo=mo+money1;
                        stat.execute("UPDATE Customer SET DOLAR ="+mo+" "+"WHERE C_Acc ="+Ac);
                        //acc.push(1);
                        l=true;
                        con.close();
                    }
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            try
            {
                Connection con = DriverManager.getConnection("jdbc:ucanaccess://F:\\MY.accdb");
                Statement stat =con.createStatement();
                ResultSet re=stat.executeQuery("Select * from Customer");

                while (re.next())
                {
                    if(re.getInt("C_Acc")==Ac)
                    {
                        //System.out.println("Welcome  "+re.getString("F_Name")+"  "+re.getString("L_Name"));
                        money2=re.getDouble("KSA");
                        mon=mon+money2;
                        stat.execute("UPDATE Customer SET KSA ="+mon+" "+"WHERE C_Acc ="+Ac);
                        //acc.push(1);
                        l=true;
                        con.close();
                    }
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            abider[0]=mo;  abider[1]=mon;
            op="add";
        }
        return l;
    }
    /**
     *
     * @param mo  this parameter for Money (1) AccountNumber
     * @param ty this parameter For Type (1) of Money
     * @param mon this parameter for Money (2) AccountNumber
     * @param typ this parameter For Type (2) of Money
     * @param mone this parameter for Money (3) AccountNumber
     * @param type  this parameter For Type (3) of Money
     * @return boolean
     */
    public boolean AddMoney(int Ac,double mo,int  ty,double mon,int typ,double mone,int type)
    {   double money1=0,money2=0,money3=0;
         mal[0]=mo;mal[1]=mon; mal[2]=mone;
        boolean l=false;
        if(ty==1 && typ==2 && type==3)
        {
            try
            {
                Connection con = DriverManager.getConnection("jdbc:ucanaccess://F:\\MY.accdb");
                Statement stat =con.createStatement();
                ResultSet re=stat.executeQuery("Select * from Customer");

                while (re.next())
                {
                    if(re.getInt("C_Acc")==Ac)
                    {
                        System.out.println("Welcome  "+re.getString("F_Name")+"  "+re.getString("L_Name"));
                        money1=re.getDouble("YEMENI");
                        mo=mo+money1;
                        stat.execute("UPDATE Customer SET YEMENI ="+mo+" "+"WHERE C_Acc ="+Ac);
                        //acc.push(1);
                        l=true;
                        con.close();
                    }
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            try
            {
                Connection con = DriverManager.getConnection("jdbc:ucanaccess://F:\\MY.accdb");
                Statement stat =con.createStatement();
                ResultSet re=stat.executeQuery("Select * from Customer");

                while (re.next())
                {
                    if(re.getInt("C_Acc")==Ac)
                    {
                        //    System.out.println("Welcome  "+re.getString("F_Name")+"  "+re.getString("L_Name"));
                        money2=re.getDouble("KSA");
                        mon=mon+money2;
                        stat.execute("UPDATE Customer SET KSA ="+mon+" "+"WHERE C_Acc ="+Ac);
                        //acc.push(1);
                        l=true;
                        con.close();
                    }
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            try
            {
                Connection con = DriverManager.getConnection("jdbc:ucanaccess://F:\\MY.accdb");
                Statement stat =con.createStatement();
                ResultSet re=stat.executeQuery("Select * from Customer");

                while (re.next())
                {
                    if(re.getInt("C_Acc")==Ac)
                    {
                        //    System.out.println("Welcome  "+re.getString("F_Name")+"  "+re.getString("L_Name"));
                        money3=re.getDouble("DOLAR");
                        mone=mone+money3;
                        stat.execute("UPDATE Customer SET DOLAR ="+mone+" "+"WHERE C_Acc ="+Ac);
                        //acc.push(1);
                        l=true;
                        con.close();
                    }
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            abider[0]=mo;  abider[1]=mon; abider[3]=mone;
            op="add";
        }

        return l;
    }
    /**
     *
     * @param mo this parameter for Money
     * @param ty this parameter For Type of Money
     * @return  boolean
     */
    public boolean ShabMoney(int Ac,double mo,int  ty)
    {
        double money=0;
        mal[0]=mo;
        boolean l=false;
        if(ty == 1)
        {
            try
            {
                Connection con = DriverManager.getConnection("jdbc:ucanaccess://F:\\MY.accdb");
                Statement stat =con.createStatement();
                ResultSet re=stat.executeQuery("Select * from Customer");

                while (re.next())
                {
                    if(re.getInt("C_Acc")==Ac)
                    {
                        if(mo>re.getDouble("YEMENI"))
                        {
                            System.out.println("لايمكنك السحب لان رصيدك اقل من المبلغ المطلوب");
                            break;
                        }
                        System.out.println("Welcome  "+re.getString("F_Name")+"  "+re.getString("L_Name"));
                        money=re.getDouble("YEMENI");
                        mo=money-mo;
                        stat.execute("UPDATE Customer SET YEMENI ="+mo+" "+"WHERE C_Acc ="+Ac);
                        //acc.push(0);
                        l=true;
                        con.close();
                    }
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            abider[0]=mo;
            op="sub";
        }
        if(ty==2)
        {

            try
            {
                Connection con = DriverManager.getConnection("jdbc:ucanaccess://F:\\MY.accdb");
                Statement stat =con.createStatement();
                ResultSet re=stat.executeQuery("Select * from Customer");

                while (re.next())
                {
                    if(re.getInt("C_Acc")==Ac)
                    {
                        if(mo>re.getDouble("KSA"))
                        {
                            System.out.println("لايمكنك السحب لان رصيدك اقل من المبلغ المطلوب");
                            break;
                        }
                        System.out.println("Welcome  "+re.getString("F_Name")+"  "+re.getString("L_Name"));
                        money=re.getDouble("KSA");
                        mo=money-mo;
                        stat.execute("UPDATE Customer SET KSA ="+mo+" "+"WHERE C_Acc ="+Ac);
                        //acc.push(0);
                        l=true;
                        con.close();
                    }
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            abider[0]=mo;
            op="sub";
        }
        if(ty==3)
        {
            try
            {
                Connection con = DriverManager.getConnection("jdbc:ucanaccess://F:\\MY.accdb");
                Statement stat =con.createStatement();
                ResultSet re=stat.executeQuery("Select * from Customer");

                while (re.next())
                {
                    if(re.getInt("C_Acc")==Ac)
                    {
                        if(mo>re.getDouble("DOLAR"))
                        {
                            System.out.println("لايمكنك السحب لان رصيدك اقل من المبلغ المطلوب");
                            break;
                        }
                        System.out.println("Welcome  "+re.getString("F_Name")+"  "+re.getString("L_Name"));
                        money=re.getDouble("DOLAR");
                        mo=money-mo;
                        stat.execute("UPDATE Customer SET DOLAR ="+mo+" "+"WHERE C_Acc ="+Ac);
                        //acc.push(0);
                        l=true;
                        con.close();
                    }
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            abider[0]=mo;
            op="sub";
        }
        return l;
    }
    /**
     *
     * @param mo  this parameter for Money (1) AccountNumber
     * @param ty this parameter For Type (1) of Money
     * @param mon this parameter for Money (2) AccountNumber
     * @param typ this parameter For Type (2) of Money
     * @return  boolean
     */
    public boolean ShabMoney(int Ac,double mo,int  ty,double mon,int typ)
    {
        double money1=0,money2=0;
        mal[0]=mo; mal[1]=mon;
        boolean l=false;
        if(ty==1 && typ==2)
        {
            try
            {
                Connection con = DriverManager.getConnection("jdbc:ucanaccess://F:\\MY.accdb");
                Statement stat =con.createStatement();
                ResultSet re=stat.executeQuery("Select * from Customer");

                while (re.next())
                {
                    if(re.getInt("C_Acc")==Ac)
                    {
                        if(mo>re.getDouble("YEMENI"))
                        {
                            System.out.println("لايمكنك السحب لان رصيدك اقل من المبلغ المطلوب");
                            break;
                        }
                        System.out.println("Welcome  "+re.getString("F_Name")+"  "+re.getString("L_Name"));
                        money1=re.getDouble("YEMENI");
                        mo=money1-mo;
                        stat.execute("UPDATE Customer SET YEMENI ="+mo+" "+"WHERE C_Acc ="+Ac);
                        //acc.push(0);
                        l=true;
                        con.close();
                    }
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            try
            {
                Connection con = DriverManager.getConnection("jdbc:ucanaccess://F:\\MY.accdb");
                Statement stat =con.createStatement();
                ResultSet re=stat.executeQuery("Select * from Customer");

                while (re.next())
                {
                    if(re.getInt("C_Acc")==Ac)
                    {
                        if(mon>re.getDouble("KSA"))
                        {
                            System.out.println("لايمكنك السحب لان رصيدك اقل من المبلغ المطلوب");
                            break;
                        }
                        //System.out.println("Welcome  "+re.getString("F_Name")+"  "+re.getString("L_Name"));
                        money2=re.getDouble("KSA");
                        mon=money2-mon;
                        stat.execute("UPDATE Customer SET KSA ="+mon+" "+"WHERE C_Acc ="+Ac);
                        //acc.push(0);
                        l=true;
                        con.close();
                    }
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            abider[0]=mo;  abider[1]=mon;
            op="sub";
        }
        if(ty==1 && typ==3)
        {
            try
            {
                Connection con = DriverManager.getConnection("jdbc:ucanaccess://F:\\MY.accdb");
                Statement stat =con.createStatement();
                ResultSet re=stat.executeQuery("Select * from Customer");

                while (re.next())
                {
                    if(re.getInt("C_Acc")==Ac)
                    {
                        if(mo>re.getDouble("YEMENI"))
                        {
                            System.out.println("لايمكنك السحب لان رصيدك اقل من المبلغ المطلوب");
                            break;
                        }
                        System.out.println("Welcome  "+re.getString("F_Name")+"  "+re.getString("L_Name"));
                        money1=re.getDouble("YEMENI");
                        mo=money1-mo;
                        stat.execute("UPDATE Customer SET YEMENI ="+mo+" "+"WHERE C_Acc ="+Ac);
                        //acc.push(0);
                        l=true;
                        con.close();
                    }
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            try
            {
                Connection con = DriverManager.getConnection("jdbc:ucanaccess://F:\\MY.accdb");
                Statement stat =con.createStatement();
                ResultSet re=stat.executeQuery("Select * from Customer");

                while (re.next())
                {
                    if(re.getInt("C_Acc")==Ac)
                    {
                        if(mon>re.getDouble("DOLAR"))
                        {
                            System.out.println("لايمكنك السحب لان رصيدك اقل من المبلغ المطلوب");
                            break;
                        }
                        //System.out.println("Welcome  "+re.getString("F_Name")+"  "+re.getString("L_Name"));
                        money2=re.getDouble("DOLAR");
                        mon=money2-mon;
                        stat.execute("UPDATE Customer SET DOLAR ="+mon+" "+"WHERE C_Acc ="+Ac);
                        //acc.push(0);
                        l=true;
                        con.close();
                    }
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            abider[0]=mo;  abider[1]=mon;
            op="sub";
        }
        if(ty==2 && typ==1)
        {
            try
            {
                Connection con = DriverManager.getConnection("jdbc:ucanaccess://F:\\MY.accdb");
                Statement stat =con.createStatement();
                ResultSet re=stat.executeQuery("Select * from Customer");

                while (re.next())
                {
                    if(re.getInt("C_Acc")==Ac)
                    {
                        if(mo>re.getDouble("KSA"))
                        {
                            System.out.println("لايمكنك السحب لان رصيدك اقل من المبلغ المطلوب");
                            break;
                        }
                        System.out.println("Welcome  "+re.getString("F_Name")+"  "+re.getString("L_Name"));
                        money1=re.getDouble("KSA");
                        mo=money1-mo;
                        stat.execute("UPDATE Customer SET KSA ="+mo+" "+"WHERE C_Acc ="+Ac);
                        //acc.push(0);
                        l=true;
                        con.close();
                    }
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            try
            {
                Connection con = DriverManager.getConnection("jdbc:ucanaccess://F:\\MY.accdb");
                Statement stat =con.createStatement();
                ResultSet re=stat.executeQuery("Select * from Customer");

                while (re.next())
                {
                    if(re.getInt("C_Acc")==Ac)
                    {
                        if(mon>re.getDouble("YEMENI"))
                        {
                            System.out.println("لايمكنك السحب لان رصيدك اقل من المبلغ المطلوب");
                            break;
                        }
                        //System.out.println("Welcome  "+re.getString("F_Name")+"  "+re.getString("L_Name"));
                        money2=re.getDouble("YEMENI");
                        mon=money2-mon;
                        stat.execute("UPDATE Customer SET YEMENI ="+mon+" "+"WHERE C_Acc ="+Ac);
                        //acc.push(0);
                        l=true;
                        con.close();
                    }
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            abider[0]=mo;  abider[1]=mon;
            op="sub";
        }
        if(ty==2 && typ==3)
        {
            try
            {
                Connection con = DriverManager.getConnection("jdbc:ucanaccess://F:\\MY.accdb");
                Statement stat =con.createStatement();
                ResultSet re=stat.executeQuery("Select * from Customer");

                while (re.next())
                {
                    if(re.getInt("C_Acc")==Ac)
                    {
                        if(mo>re.getDouble("KSA"))
                        {
                            System.out.println("لايمكنك السحب لان رصيدك اقل من المبلغ المطلوب");
                            break;
                        }
                        System.out.println("Welcome  "+re.getString("F_Name")+"  "+re.getString("L_Name"));
                        money1=re.getDouble("KSA");
                        mo=money1-mo;
                        stat.execute("UPDATE Customer SET KSA ="+mo+" "+"WHERE C_Acc ="+Ac);
                        //acc.push(0);
                        l=true;
                        con.close();
                    }
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            try
            {
                Connection con = DriverManager.getConnection("jdbc:ucanaccess://F:\\MY.accdb");
                Statement stat =con.createStatement();
                ResultSet re=stat.executeQuery("Select * from Customer");

                while (re.next())
                {
                    if(re.getInt("C_Acc")==Ac)
                    {
                        if(mon>re.getDouble("DOLAR"))
                        {
                            System.out.println("لايمكنك السحب لان رصيدك اقل من المبلغ المطلوب");
                            break;
                        }
                        //System.out.println("Welcome  "+re.getString("F_Name")+"  "+re.getString("L_Name"));
                        money2=re.getDouble("DOLAR");
                        mon=money2-mon;
                        stat.execute("UPDATE Customer SET DOLAR ="+mon+" "+"WHERE C_Acc ="+Ac);
                        //acc.push(0);
                        l=true;
                        con.close();
                    }
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            abider[0]=mo;  abider[1]=mon;
            op="sub";
        }
        if(ty==3 && typ==1)
        {
            try
            {
                Connection con = DriverManager.getConnection("jdbc:ucanaccess://F:\\MY.accdb");
                Statement stat =con.createStatement();
                ResultSet re=stat.executeQuery("Select * from Customer");

                while (re.next())
                {
                    if(re.getInt("C_Acc")==Ac)
                    {
                        if(mo>re.getDouble("DOLAR"))
                        {
                            System.out.println("لايمكنك السحب لان رصيدك اقل من المبلغ المطلوب");
                            break;
                        }
                        System.out.println("Welcome  "+re.getString("F_Name")+"  "+re.getString("L_Name"));
                        money1=re.getDouble("DOLAR");
                        mo=money1-mo;
                        stat.execute("UPDATE Customer SET DOLAR ="+mo+" "+"WHERE C_Acc ="+Ac);
                        //acc.push(0);
                        l=true;
                        con.close();
                    }
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            try
            {
                Connection con = DriverManager.getConnection("jdbc:ucanaccess://F:\\MY.accdb");
                Statement stat =con.createStatement();
                ResultSet re=stat.executeQuery("Select * from Customer");

                while (re.next())
                {
                    if(re.getInt("C_Acc")==Ac)
                    {
                        if(mon>re.getDouble("YEMENI"))
                        {
                            System.out.println("لايمكنك السحب لان رصيدك اقل من المبلغ المطلوب");
                            break;
                        }
                        //System.out.println("Welcome  "+re.getString("F_Name")+"  "+re.getString("L_Name"));
                        money2=re.getDouble("YEMENI");
                        mon=money2-mon;
                        stat.execute("UPDATE Customer SET YEMENI ="+mon+" "+"WHERE C_Acc ="+Ac);
                        //acc.push(0);
                        l=true;
                        con.close();
                    }
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            abider[0]=mo;  abider[1]=mon;
            op="sub";
        }
        if(ty==3 && typ==2)
        {
            try
            {
                Connection con = DriverManager.getConnection("jdbc:ucanaccess://F:\\MY.accdb");
                Statement stat =con.createStatement();
                ResultSet re=stat.executeQuery("Select * from Customer");

                while (re.next())
                {
                    if(re.getInt("C_Acc")==Ac)
                    {
                        if(mo>re.getDouble("DOLAR"))
                        {
                            System.out.println("لايمكنك السحب لان رصيدك اقل من المبلغ المطلوب");
                            break;
                        }
                        System.out.println("Welcome  "+re.getString("F_Name")+"  "+re.getString("L_Name"));
                        money1=re.getDouble("DOLAR");
                        mo=money1-mo;
                        stat.execute("UPDATE Customer SET DOLAR ="+mo+" "+"WHERE C_Acc ="+Ac);
                        //acc.push(0);
                        l=true;
                        con.close();
                    }
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            try
            {
                Connection con = DriverManager.getConnection("jdbc:ucanaccess://F:\\MY.accdb");
                Statement stat =con.createStatement();
                ResultSet re=stat.executeQuery("Select * from Customer");

                while (re.next())
                {
                    if(re.getInt("C_Acc")==Ac)
                    {
                        if(mon>re.getDouble("KSA"))
                        {
                            System.out.println("لايمكنك السحب لان رصيدك اقل من المبلغ المطلوب");
                            break;
                        }
                        //System.out.println("Welcome  "+re.getString("F_Name")+"  "+re.getString("L_Name"));
                        money2=re.getDouble("KSA");
                        mon=money2-mon;
                        stat.execute("UPDATE Customer SET KSA ="+mon+" "+"WHERE C_Acc ="+Ac);
                        //acc.push(0);
                        l=true;
                        con.close();
                    }
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            abider[0]=mo;  abider[1]=mon;
            op="sub";
        }
        return l;
    }
    /**
     *
     * @param mo  this parameter for Money (1) AccountNumber
     * @param ty this parameter For Type (1) of Money
     * @param mon this parameter for Money (2) AccountNumber
     * @param typ this parameter For Type (2) of Money
     * @param mone this parameter for Money (3) AccountNumber
     * @param type  this parameter For Type (3) of Money
     * @return boolean
     */
    public boolean ShabMoney(int Ac,double mo,int  ty,double mon,int typ,double mone,int type)
    {   double money1=0,money2=0,money3=0;
      mal[0]=mo; mal[1]=mon; mal[2]=mone;
        boolean l=false;
        if(ty==1 && typ==2 && type==3)
        {
            try
            {
                Connection con = DriverManager.getConnection("jdbc:ucanaccess://F:\\MY.accdb");
                Statement stat =con.createStatement();
                ResultSet re=stat.executeQuery("Select * from Customer");

                while (re.next())
                {
                    if(re.getInt("C_Acc")==Ac)
                    {
                        if(mo>re.getDouble("YEMENI"))
                        {
                            System.out.println("لايمكنك السحب لان رصيدك اقل من المبلغ المطلوب");
                            break;
                        }
                        System.out.println("Welcome  "+re.getString("F_Name")+"  "+re.getString("L_Name"));
                        money1=re.getDouble("YEMENI");
                        mo=money1-mo;
                        stat.execute("UPDATE Customer SET YEMENI ="+mo+" "+"WHERE C_Acc ="+Ac);
                        //acc.push(0);
                        l=true;
                        con.close();
                    }
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            try
            {
                Connection con = DriverManager.getConnection("jdbc:ucanaccess://F:\\MY.accdb");
                Statement stat =con.createStatement();
                ResultSet re=stat.executeQuery("Select * from Customer");

                while (re.next())
                {
                    if(re.getInt("C_Acc")==Ac)
                    {
                        if(mon>re.getDouble("KSA"))
                        {
                            System.out.println("لايمكنك السحب لان رصيدك اقل من المبلغ المطلوب");
                            break;
                        }
                        //    System.out.println("Welcome  "+re.getString("F_Name")+"  "+re.getString("L_Name"));
                        money2=re.getDouble("KSA");
                        mon=money2-mon;
                        stat.execute("UPDATE Customer SET KSA ="+mon+" "+"WHERE C_Acc ="+Ac);
                        //acc.push(0);
                        l=true;
                        con.close();
                    }
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            try
            {
                Connection con = DriverManager.getConnection("jdbc:ucanaccess://F:\\MY.accdb");
                Statement stat =con.createStatement();
                ResultSet re=stat.executeQuery("Select * from Customer");

                while (re.next())
                {
                    if(re.getInt("C_Acc")==Ac)
                    {
                        if(mone>re.getDouble("DOLAR"))
                        {
                            System.out.println("لايمكنك السحب لان رصيدك اقل من المبلغ المطلوب");
                            break;
                        }
                        //    System.out.println("Welcome  "+re.getString("F_Name")+"  "+re.getString("L_Name"));
                        money3=re.getDouble("DOLAR");
                        mone=money3-mone;
                        stat.execute("UPDATE Customer SET DOLAR ="+mone+" "+"WHERE C_Acc ="+Ac);
                       // acc.push(0);
                        l=true;
                        con.close();
                    }
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            abider[0]=mo;  abider[1]=mon;
            op="sub";
        }
        return l;
    }

    /**
     *
     * @param old for old عملة
     * @param neew for new عملة
     * @param qu for Quentity of money
     * @return
     */
    public double ChangeMoney(int old,int neew,double qu)
    {  double mo=0;
        if(old==1 && neew==2)
        {
            return   mo=qu/158;
        }
        if(old==1 && neew==3)
        {
            return   mo=qu/600;
        }
        if(old==2 && neew==1)
        {
            return mo=qu*158;
        }
        if(old==2 && neew==3)
        {
            mo=qu*158;
            double mon;
            return mon=mo/600;
        }
        if(old==3 && neew==1)
        {
            return    mo=qu*600;
        }
        if(old==3 && neew==2)
        {
            mo=qu*600;
            double mon;
            return   mon=mo/158;
        }
        return 0;
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

//   public void Show_Account(int a)
//   {
//       if()
//   }
}
