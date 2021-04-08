package src;

public abstract class Employee extends Person {
    protected double Salary;
    protected int IdNumber=1000;
   protected static int Emp_count=7;
    /**
     * This Cunstructor for Employee is Default
     */
    public Employee()
    {
          Salary=0;
//        Emp_count++;
          IdNumber++;
    }

//    /**
//     *
//     * @param id  this varibal for Id number
//     */
//    public Employee(int id)
//    {
//        IdNumber=id;
//    }


    /**
     *
     * @param f   this varible to Firest Name
     * @param l   this Varible to Last name
     * @param a   this varible to Address
     * @param ph  this varible to phone
     */
    public Employee(String f,String l,String a,int ph)
    {   super(f,l,a,ph);
//        Emp_count++;
          IdNumber++;
    }

    /**
     *
     * @param s this varible to Salary
     */
    public void setSalary(double s)
    {
        Salary=s;
    }

    /**
     *
     * @return  this Function is Abstract it is return Salary
     */
    public abstract double getSalary();

    /**
     *
     * @return this Function  it is return Id number
     */
    public int getIdNumber()
    {
        return IdNumber;
    }
   public void setIdNumber(int id)
   {
       IdNumber=id;
   }
}
