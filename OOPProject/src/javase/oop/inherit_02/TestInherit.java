/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javase.oop.inherit_02;

import java.util.Arrays;
import javase.oop.interfaces_03.Travel;

/**
 *
 * @author Administrator
 */
public class TestInherit {
    public static void main(String[] args) {
        // Object of Employee
        Employee e1 = new Employee(101, "Ahmed", 7000, "java dev", 10, 20.0);
          
        System.out.println(e1.getMonthlyNetSalary());
        System.out.println(e1.getAnnualNetSalary());
        System.out.println("+++++++++++++");
        ///// Object of Manager class
        Manager m1 = new Manager(401, "Khaled", 15000.0, "Java Mgr", 10);
        System.out.println(m1.getMonthlyNetSalary());
        System.out.println(m1.getAnnualNetSalary());
        
            double companyProfit = 1000_000.00; 
        System.out.println(m1.getAnnualNetSalary(companyProfit));
          
        System.out.println("++++++++++++");
        System.out.println("Methods overriding");
          e1.printPersonDetails();
        
        System.out.println(e1);// employee 101 named ahmed salary = 7000 
        System.out.println(m1);
  System.out.println("+++++++++++ Polymorphism ++++++++++++++"); 
           printData(e1);
           printData(m1);
         System.out.println("++++++++++ Abstraction +++++++++++");  
       // Person p = new Person();
        
       //  Travel v = new Travel();
           
    } // end main
   
    public static void printData( Person per ){
            System.out.println("Name : "+ per.getPersonName());       
            // Casting Objects..... from parent object to child object
            // check for object type
         if(per instanceof Employee ){  
            Employee e = (Employee)per;
            System.out.println("Monthly Net Salary : "+ e.getMonthlyNetSalary() );
         }else if(per instanceof Manager){
          Manager m = (Manager)per;
          System.out.println("Monthly Net Salary : "+ m.getMonthlyNetSalary() );
          }
    }
   
} // end class
