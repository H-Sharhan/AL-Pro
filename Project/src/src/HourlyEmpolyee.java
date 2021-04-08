package src;

public class HourlyEmpolyee  extends Employee{
    private double price;
    private float Hours;
    private Account account;
    private Operations operations;
    /**
     * This Cunstructor for Hourly Employee is Default
     */
    public HourlyEmpolyee()
    {

        account=new Account();

    }
//    /**
//     *
//     * @param id   this varible for Id Number
//     */
//    public HourlyEmpolyee(int id)
//    {
//        super(id);
//    }
    /**
     *
     * @param f   this varible for Firest name
     * @param l   this varible for Last Name
     * @param a   this varible for Address
     * @param ph  this varible for phone number
     */
    public HourlyEmpolyee(String f,String l,String a,int ph)
    {
        super(f,l,a,ph);
        price=1200;Hours=6;
        Salary =price*Hours*5;
    }

    /**
     *
     * @return  this funtion is return Salary
     */
    @Override
    public double getSalary() {
        return (price*Hours)*5;
    }
    /**
     *
     * @return  this funtion for Price
     */
    public void setPrice(double p)
    {
        price=p;
    }
    /**
     *
     * @return  this funtion for Salary
     */
    public void setHours(float h)
    {
        Hours=h;
    }
    /**
     *
     * @return  this funtion is return price
     */
    public double getPrice()
    {
        return price;
    }
    /**
     *
     * @return  this funtion is return Hourly
     */
    public float getHours()
    {
        return Hours;
    }
    /**
     *  this function use to Display The Hourly Employee
     */
    public void Display()
    {
       super.Display();
        System.out.println("The Id number is : "+IdNumber);
        System.out.println("The Salary is : "+Salary);
    }
    /**
     *
     * @param old for old عملة
     * @param neew for new عملة
     * @param qu for Quentity of money
     * @return
     */
    public double ChangeMoney(int old, int neew,double qu)
    {
     return  operations.ChangeMoney(old,neew,qu);
    }
}
