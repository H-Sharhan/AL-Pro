package src;

public class SalariedEmpolyee extends Employee {
    private Account account;
    private Operations operations;
    /**
     *  This Cunstructor for Salaried Employee is Default
     */
    public SalariedEmpolyee()
    {

        account=new Account();
    }

//    /**
//     *
//     * @param id   this varible for Id Number
//     */
//    public SalariedEmpolyee(int id)
//    {
//       super(id);
//    }

    /**
     *
     * @param f   this varible for Firest name
     * @param l   this varible for Last Name
     * @param a   this varible for Address
     * @param ph  this varible for phone number
     */
    public SalariedEmpolyee(String f, String l, String a, int ph)
    {
        super(f,l,a,ph);
        Salary=60000;
    }

    /**
     *
     * @return  this funtion is return Salary
     */
    public double getSalary()
    {
        return Salary;
    }

    /**
     *  this function use to Display The Salaried Employee
     */
   public void Display()
   {
      super.Display();
       System.out.println("The Id number is : "+IdNumber);
       System.out.println("The Salary is :  "+Salary);
   }
    /**
     *  Customer to work the function well
     * @param mo this parameter for Money
     * @param ty this parameter For Type of Money
     * @return  boolean
     */
    public  boolean AddMoney(int Ac,double mo,int ty)
    {
        boolean l=false;
        if(operations.AddMoney(Ac,mo,ty)==true)
        {
            l=true;
        }
        return l;
    }
    /**
     * Customer to work the function well
     * account nummber for Account number
     * @param mo  this parameter for Money (1) AccountNumber
     * @param ty this parameter For Type (1) of Money
     * @param mon this parameter for Money (2) AccountNumber
     * @param typ this parameter For Type (2) of Money
     * @return  boolean
     */
    public  boolean AddMoney(int Ac,double mo,int ty,double mon,int typ)
    {
        boolean l=false;
        if(operations.AddMoney(Ac,mo,ty,mon,typ)==true)
        {
            l=true;
        }
        return l;
    }
    /**
     *
     *  Customer to work the function well
     * @param mo  this parameter for Money (1) AccountNumber
     * @param ty this parameter For Type (1) of Money
     * @param mon this parameter for Money (2) AccountNumber
     * @param typ this parameter For Type (2) of Money
     * @return  boolean
     */
    public  boolean AddMoney(int Ac,double mo,int ty,double mon,int typ,double mone,int type)
    {
        boolean l=false;
        if(operations.AddMoney(Ac,mo,ty,mon,typ,mone,type)==true)
        {
            l=true;
        }
        return l;
    }
    /**
     *  Customer to work the function well
     * @param mo this parameter for Money
     * @param ty this parameter For Type of Money
     * @return  boolean
     */
    public boolean ShabMoney(int Ac,double mo,int ty)
    {
        boolean l=false;
        if(operations.ShabMoney(Ac,mo,ty)==true)
        {
            l=true;
        }
        return l;
    }
    /**
     * Customer to work the function well
     * account nummber for Account number
     * @param mo  this parameter for Money (1) AccountNumber
     * @param ty this parameter For Type (1) of Money
     * @param mon this parameter for Money (2) AccountNumber
     * @param typ this parameter For Type (2) of Money
     * @return  boolean
     */
    public boolean ShabMoney(int Ac,double mo,int ty,double mon,int typ)
    {
        boolean l=false;
        if(operations.ShabMoney(Ac,mo,ty,mon,typ)==true)
        {
            l=true;
        }
        return l;
    }
    /**
     *
     *  Customer to work the function well
     * @param mo  this parameter for Money (1) AccountNumber
     * @param ty this parameter For Type (1) of Money
     * @param mon this parameter for Money (2) AccountNumber
     * @param typ this parameter For Type (2) of Money
     * @return  boolean
     */
    public boolean ShabMoney(int Ac,double mo,int ty,double mon,int typ,double mone ,int type)
    {
        boolean l=false;
        if(operations.ShabMoney(Ac,mo,ty,mon,typ,mone,type)==true)
        {
            l=true;
        }
        return l;
    }

//    public void Show_Opration()
//    {
//        operations.Show_Operations();
//    }
//    public int Count_Of_Oprations()
//    {
//        return operations.Count_Of_Operation();
//    }






















  /* public boolean AddMoney(double mo,int ty)
   {
       return account.AddMoney( mo,ty);
   }
   public boolean AddMoney(double mo,int ty,double mon,int typ,double mone ,int type)
   {
       return account.AddMoney(mo,ty,mon,typ,mone,type);
   }
   public boolean AddMoney(double mo,int ty,double mon,int typ)
   {
       return account.AddMoney(mo,ty,mon,typ);
   }
    public boolean ShabMoney(double mo,int ty)
    {
        return account.ShabMoney(mo,ty);
    }
    public boolean ShabMoney(double mo,int ty,double mon,int typ,double mone ,int type)
    {
        return account.ShabMoney(mo,ty,mon,typ,mone,type);
    }
    public boolean ShabMoney(double mo,int ty,double mon,int typ)
    {
        return account.ShabMoney(mo,ty,mon,typ);
    }*/
}
