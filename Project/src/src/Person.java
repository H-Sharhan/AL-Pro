package src;

public class Person {
    protected String Fname,Lname,Address;
    protected int phone;
    /**
     * This Cunstructor for Person is Default
     */
    public Person()
    {
        Fname="";Lname="";Address="";phone=0;
    }

    /**
     *
     * @param f this varibale to Firest name
     * @param l this varibale to Last name
     * @param a this varibale to Address
     * @param ph this varibale to phone number
     */
    public Person(String f,String l,String a,int ph)
    {
        Fname=f;Lname=l;Address=a;phone=ph;
    }

    /**
     *
     * @return this function return Firest Name
     */
    public String getFname() {
        return Fname;
    }

    /**
     *
     * @param fname   this varibale to Firest name
     */
    public void setFname(String fname) {
        Fname = fname;
    }

    /**
     *
     * @return this function return Last Name
     */
    public String getLname() {
        return Lname;
    }

    /**
     *
     * @param lname  this varibale to Last name
     */
    public void setLname(String lname) {
        Lname = lname;
    }

    /**
     *
     * @return  function return Address Name
     */
    public String getAddress() {
        return Address;
    }

    /**
     *
     * @param address this varibale to Address
     */
    public void setAddress(String address) {
        Address = address;
    }

    /**
     *
     * @return function return phone number
     */
    public int getPhone() {
        return phone;
    }

    /**
     *
     * @param phone  this varibale to phone number
     */
    public void setPhone(int phone) {
        this.phone = phone;
    }



    /**
     *   this function use to Display The Person
     */
    public void Display() {
        System.out.println("F-Name\tL-name\tAddress\tphone");
        System.out.println(Fname+"\t"+Lname+"\t"+Address+"\t"+phone);
    }
}
