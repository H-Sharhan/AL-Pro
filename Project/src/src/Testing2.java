//package src;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class Testing2 {
//    public static void main(String[] args) {
//        Manager m = new Manager();
//        SalariedEmpolyee sa = new SalariedEmpolyee();
//        HourlyEmpolyee ho = new HourlyEmpolyee();
//        Scanner sc = new Scanner(System.in);
//
//        ArrayList<Customer> customers = new ArrayList<>();
//        Customer c1 = new Customer("Anwer", "Sharhan", "Sana'a", 32325);
//        c1.setAccountNumber(1);
//        c1.AddMoney(1, 1000, 2);
//
//        Customer c2 = new Customer("Hassan", "Sharhan", "Sana'a", 65464);
//        c2.setAccountNumber(2);
//        c2.AddMoney(2, 3000, 1, 9000, 2);
//
//        Customer c3 = new Customer("Ali", "Sharhan", "Sana'a", 543233);
//        c3.setAccountNumber(3);
//        c3.AddMoney(3, 10000, 0, 100, 1, 300, 2);
//
//        customers.add(c1);
//        customers.add(c2);
//        customers.add(c3);
//
//        ArrayList<Employee> employees = new ArrayList<>();
//        SalariedEmpolyee s1 = new SalariedEmpolyee("Hassan", "Sharhan", "Sana'a", 770326372);
//        s1.setIdNumber(1);
//
//        SalariedEmpolyee s2 = new SalariedEmpolyee("Osam", "Alwadai", "Sana'a", 254343587);
//        s2.setIdNumber(2);
//
//        SalariedEmpolyee s3 = new SalariedEmpolyee("Amar", "Almadi", "Sana'a", 54545655);
//        s3.setIdNumber(3);
//
//        employees.add(s1);
//        employees.add(s2);
//        employees.add(s3);
//
//        HourlyEmpolyee h1 = new HourlyEmpolyee("Ali", "Hassan", "AB", 67546545);
//        h1.setIdNumber(4);
//
//        HourlyEmpolyee h2 = new HourlyEmpolyee("Tim", "Hassan", "Sana'a", 65645656);
//        h2.setIdNumber(5);
//
//        HourlyEmpolyee h3 = new HourlyEmpolyee("Ahamed", "Ali", "Taz", 54376556);
//        h3.setIdNumber(6);
//
//        employees.add(h1);
//        employees.add(h2);
//        employees.add(h3);
//        for (; ; ) {
//            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\tWellcome in our System\n");
//            System.out.println("Opreation ADD (1)\nOpreation Display (2)\nOpreation Remove (3)\n" +
//                    "Opreation Consigns (4)\nOpreation Drag (5)\nOpreation Change (6)\t\t\t\t\t\t\t\t" +
//                    "if you want to lieve enter (0) ");
//            int an = sc.nextInt();
//            if (an == 1) {
//                System.out.println("To Add Salaried Employee (1)\n" +
//                                   "To Add Hourly Employee (2)\n" +
//                                   "To Add Customer (3)");
//                int ans = sc.nextInt();
//                if (ans == 1) {
//                    System.out.println("What's your Firest name ?");
//                    String fn = sc.next();
//                    System.out.println("What's your last name ?");
//                    String ln = sc.next();
//                    System.out.println("Where do you live ?");
//                    String ad = sc.next();
//                    System.out.println("What's your Phone number ?");
//                    int ph = sc.nextInt();
//              //     m.AddSalariedEmployee(fn, ln, ad, ph);
//                   System.out.println("The Opration is Did");
//
//                }
//                if (ans == 2) {
//                    System.out.println("What's your Firest name ?");
//                    String fn = sc.next();
//                    System.out.println("What's your last name ?");
//                    String ln = sc.next();
//                    System.out.println("Where do you live ?");
//                    String ad = sc.next();
//                    System.out.println("What's your Phone number ?");
//                    int ph = sc.nextInt();
//                //   m.AddHourlyEmployee(fn, ln, ad, ph);
//                        System.out.println("The Opration is Did");
//                }
//                if (ans == 3) {
//                    System.out.println("What's your Firest name ?");
//                    String fn = sc.next();
//                    System.out.println("What's your last name ?");
//                    String ln = sc.next();
//                    System.out.println("Where do you live ?");
//                    String ad = sc.next();
//                    System.out.println("What's your Phone number ?");
//                    int ph = sc.nextInt();
//                  // m.AddCustomer(fn, ln, ad, ph);
//                    System.out.println("The Opration is Did");
//                }
//            }
//            if (an == 2) {
//                System.out.println("Display Employees (1)\nDisplay Customers (2)\nDisplay Employee (3)\n" +
//                        "Display Customer (4)");
//                int ans = sc.nextInt();
//                if (ans == 1) {
//                    for (int i = 0; i < employees.size(); i++) {
//                        employees.get(i).Display();
//                    }
//                    m.DisplayEmployees();
//                }
//                if (ans == 2) {
//                    System.out.println("The Customers are :");
//                    for (int i = 0; i < customers.size(); i++) {
//                        customers.get(i).Display();
//                    }
//                    m.Display_Customers();
//                }
//                if(ans==3)
//                {
//                    System.out.println("If you old Employee Enter 1 OR 2 if you new ");
//                    int anss=sc.nextInt();
//                    if(anss==1)
//                    {
//                        System.out.println("What's your Id number ?");
//                        int id=sc.nextInt();
//                        for (int i = 0; i <employees.size() ; i++) {
//                            if(employees.get(i).getIdNumber()==id)
//                            {
//                                employees.get(i).Display();
//                            }
//                        }
//                    }
//                    if(anss==2)
//                    {
//                        System.out.println("What's your Id number ?");
//                        int id=sc.nextInt();
//                        m.DisplayEmployee(id);
//                    }
//
//                }
//                if(ans==4)
//                {     System.out.println("If you old Customer  Enter 1 OR 2 if you new ");
//                    int anss=sc.nextInt();
//                    if(anss==1)
//                    {
//                        System.out.println("What's your Account number ?");
//                        int ac=sc.nextInt();
//                        for (int i = 0; i <customers.size() ; i++) {
//                            if(customers.get(i).getAccountNumber()==ac)
//                            {
//                                customers.get(i).Display();
//                            }
//                        }
//                    }
//                    if(anss==2)
//                    {
//                        System.out.println("What's your Account number ?");
//                        int ac=sc.nextInt();
//                        m.Display_Customer(ac);
//                    }
//                }
//            }
//            if (an == 3) {
//                System.out.println("Remove Employees (1)\nRemove Customer (2)");
//                int ans = sc.nextInt();
//                if (ans == 1) {
//                    System.out.println("Enter (1) if you old Employee\nEnter (2) if you new Employee");
//                    int ol = sc.nextInt();
//                    if (ol == 1) {
//                        System.out.println("What's your Id number ?");
//                        int id = sc.nextInt();
//                        for (int i = 0; i < employees.size(); i++) {
//                            if (employees.get(i).IdNumber == id) {
//                                employees.remove(i);
//                                System.out.println("The Opration is Did");
//                            }
//                        }
//                    }
//                    if (ol == 2) {
//                        System.out.println("What's your Id number ?");
//                        int id = sc.nextInt();
//                        if (m.RemoveEmployee(id) == true) {
//                            System.out.println("The Opration is Did");
//                        }
//                    }
//                }
//                if (ans == 2) {
//                    System.out.println("Enter (1) if you old Customer\nEnter (2) if you new Customer");
//                    int ol = sc.nextInt();
//                    if (ol == 1) {
//                        System.out.println("What's your Account number ?");
//                        int ac = sc.nextInt();
//                        for (int i = 0; i < customers.size(); i++) {
//                            if (customers.get(i).getAccountNumber() == ac) {
//                                customers.remove(i);
//                                System.out.println("The Opration is Did");
//                            }
//                        }
//                    }
//                    if (ol == 2) {
//                        System.out.println("What's your Account number ?");
//                        int ac = sc.nextInt();
//                        if (m.RemoveCustomer(ac) == true) {
//                            System.out.println("The Opration is Did");
//                        }
//                    }
//                }
//            }
//            if (an == 4) {
//                    System.out.println("Enter (1) if you want to add one type of money\n" +
//                            "if they are two Enter (2)\n" +
//                            "if they are three Enter (3)\n ");
//                    int ans = sc.nextInt();
//                    if (ans == 1) {
//                        System.out.println("Enter your Account number ");
//                        int ac = sc.nextInt();
//                        for (int i = 0; i < customers.size(); i++) {
//                            if (customers.get(i).getAccountNumber() == ac) {
//                                System.out.println("Wellcome " + customers.get(i).Fname + " " + customers.get(i).Lname);
//                                System.out.println(" Add  [  Yemeni (0) KSA (1) Dolar (2) ]");
//                                int t = sc.nextInt();
//                                System.out.println("How much is it");
//                                double mo = sc.nextDouble();
//                                if (sa.AddMoney(customers.get(i), ac, mo, t) == true) {
//                                    System.out.println("The Opreation is Did");
//                                    customers.get(i).Display();
//                                    break;
//                                }
//                            }
//                        }
//                    }
//                    if (ans == 2) {
//                        System.out.println("Enter your Account number ");
//                        int ac = sc.nextInt();
//                        for (int i = 0; i < customers.size(); i++) {
//                            if (customers.get(i).getAccountNumber() == ac) {
//                                System.out.println("Wellcome " + customers.get(i).Fname + " " + customers.get(i).Lname);
//                                System.out.println(" The firest  to Add  [  Yemeni (0) KSA (1) Dolar (2) ]");
//                                int t1 = sc.nextInt();
//                                System.out.println("How much is it");
//                                double mo1 = sc.nextDouble();
//                                System.out.println(" The Second  to Add  [  Yemeni (0) KSA (1) Dolar (2) ]");
//                                int t2 = sc.nextInt();
//                                System.out.println("How much is it");
//                                double mo2 = sc.nextDouble();
//                                if (sa.AddMoney(customers.get(i),ac, mo1, t1, mo2, t2)== true) {
//                                    System.out.println("The Opration is Did");
//                                    customers.get(i).Display();
//                                    break;
//                                }
//
//                            }
//                        }
//                    }
//                    if (ans == 3) {
//                        System.out.println("Enter your Account number ");
//                        int ac = sc.nextInt();
//                        for (int i = 0; i < customers.size(); i++) {
//                            if (customers.get(i).getAccountNumber() == ac) {
//                                System.out.println("Wellcome " + customers.get(i).Fname + " " + customers.get(i).Lname);
//                                System.out.println(" The firest  to Add Should be Yemeni  [  Yemeni (0) KSA (1) Dolar (2) ]");
//                                int t1 = sc.nextInt();
//                                System.out.println("How much is it");
//                                double mo1 = sc.nextDouble();
//                                System.out.println(" The Second  to Add Should be KSA  [  Yemeni (0) KSA (1) Dolar (2) ]");
//                                int t2 = sc.nextInt();
//                                System.out.println("How much is it");
//                                double mo2 = sc.nextDouble();
//                                System.out.println(" The Thired  to Add Should be Dolar  [  Yemeni (0) KSA (1) Dolar (2) ]");
//                                int t3 = sc.nextInt();
//                                System.out.println("How much is it ");
//                                double mo3 = sc.nextDouble();
//                                if (sa.AddMoney(customers.get(i),ac, mo1, t1, mo2, t2, mo3, t3) == true) {
//                                    System.out.println("The Opration is Did");
//                                    customers.get(i).Display();
//                                    break;
//                                }
//                            }
//                        }
//                    }
//            }
//            if (an == 5) {
//                System.out.println("Enter (1) if you want to Drag one type of money\n" +
//                        "if they are two Enter (2)\n" +
//                        "if they are three Enter (3)\n ");
//                int ans = sc.nextInt();
//                if (ans == 1) {
//                    System.out.println("Enter your Account number ");
//                    int ac = sc.nextInt();
//                    for (int i = 0; i < customers.size(); i++) {
//                        if (customers.get(i).getAccountNumber() == ac) {
//                            System.out.println("Wellcome " + customers.get(i).Fname + " " + customers.get(i).Lname);
//                            System.out.println(" Drag  [  Yemeni (0) KSA (1) Dolar (2) ]");
//                            int t = sc.nextInt();
//                            System.out.println("How much is it");
//                            double mo = sc.nextDouble();
//                            if (sa.ShabMoney(customers.get(i), ac, mo, t) == true) {
//                                System.out.println("The Opreation is Did");
//                                customers.get(i).Display();
//                                break;
//                            }
//                        }
//                    }
//                }
//                if (ans == 2) {
//                    System.out.println("Enter your Account number ");
//                    int ac = sc.nextInt();
//                    for (int i = 0; i < customers.size(); i++) {
//                        if (customers.get(i).getAccountNumber() == ac) {
//                            System.out.println("Wellcome " + customers.get(i).Fname + " " + customers.get(i).Lname);
//                            System.out.println(" The firest  to Drag  [  Yemeni (0) KSA (1) Dolar (2) ]");
//                            int t1 = sc.nextInt();
//                            System.out.println("How much is it");
//                            double mo1 = sc.nextDouble();
//                            System.out.println(" The Second  to Drag  [  Yemeni (0) KSA (1) Dolar (2) ]");
//                            int t2 = sc.nextInt();
//                            System.out.println("How much is it");
//                            double mo2 = sc.nextDouble();
//                            if (sa.ShabMoney(customers.get(i),ac, mo1, t1, mo2, t2)== true) {
//                                System.out.println("The Opration is Did");
//                                customers.get(i).Display();
//                                break;
//                            }
//
//                        }
//                    }
//                }
//                if (ans == 3) {
//                    System.out.println("Enter your Account number ");
//                    int ac = sc.nextInt();
//                    for (int i = 0; i < customers.size(); i++) {
//                        if (customers.get(i).getAccountNumber() == ac) {
//                            System.out.println("Wellcome " + customers.get(i).Fname + " " + customers.get(i).Lname);
//                            System.out.println(" The firest  to Drag Should be Yemeni  [  Yemeni (0) KSA (1) Dolar (2) ]");
//                            int t1 = sc.nextInt();
//                            System.out.println("How much is it");
//                            double mo1 = sc.nextDouble();
//                            System.out.println(" The Second  to Drag Should be KSA  [  Yemeni (0) KSA (1) Dolar (2) ]");
//                            int t2 = sc.nextInt();
//                            System.out.println("How much is it");
//                            double mo2 = sc.nextDouble();
//                            System.out.println(" The Thired  to Drag Should be Dolar  [  Yemeni (0) KSA (1) Dolar (2) ]");
//                            int t3 = sc.nextInt();
//                            System.out.println("How much is it ");
//                            double mo3 = sc.nextDouble();
//                            if (sa.ShabMoney(customers.get(i),ac, mo1, t1, mo2, t2, mo3, t3)== true) {
//                                System.out.println("The Opration is Did");
//                                customers.get(i).Display();
//                                break;
//                            }
//                        }
//                    }
//                }
//            }
//            if (an == 6) {
//                System.out.println("Nots [Yemeni (1),KSA (2),Dolar (3)]\n\n");
//                System.out.println("What's The Old coniage");
//                int ol = sc.nextInt();
//                System.out.println("What's The New coniage");
//                int ne = sc.nextInt();
//                System.out.println("How much the money");
//                double mo = sc.nextInt();
//                System.out.println( "The Money is "+ho.ChangeMoney(ol, ne, mo))  ;
//            }
//            if(an==0)
//            {
//                break;
//            }
//        }
//    }
//}
