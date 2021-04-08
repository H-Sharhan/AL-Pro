package src;

import java.util.LinkedList;

public class Customer extends Person{
    private int AccountNumber=354;

    /**
     * This Cunstructor for Customer  is Default
     */
    public Customer()
    {
    }
    /**
     *
     * @param f   this varible for Firest name
     * @param l   this varible for Last Name
     * @param a   this varible for Address
     * @param ph  this varible for phone number
     */
    public Customer(String f,String l,String a,int ph)
    {    super(f,l,a,ph);
        //++AccountNumber;
    }
    /**
     *
     * @return this functon to return Account number
     */
    public int getAccountNumber()
    {
        return AccountNumber;
    }

    /**
     *
     * @param accountNumber this parameter to Modifie AccountNumber
     */
    public void setAccountNumber(int accountNumber)
    {
        AccountNumber=accountNumber;
    }


    /**
     * this Function for Display Customer
     */
  public void Display()

  {
     super.Display();
      System.out.println("Your Account number is: "+AccountNumber);

  }
}
