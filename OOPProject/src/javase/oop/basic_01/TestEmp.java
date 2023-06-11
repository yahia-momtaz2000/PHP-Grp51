/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javase.oop.basic_01;

import javase.oop.basic_01.Emp;

/**
 *
 * @author Administrator
 */
public class TestEmp {

    public static void main(String[] args) {
        // get object 
        Emp e1 = new Emp();
        e1.setEmpId(101);
        e1.setEmpName("ahmed");
        e1.setEmpGrossSalary(7000);
      
        System.out.println(e1.getEmpName());
        System.out.println(e1.getMonthlyNetSalary());
        System.out.println(e1.getAnnualNetSalary());
        System.out.println("+++++++++++++++++");

       Emp e2 = new Emp(102, "Mostafa", 9000.0); // create object
         // Emp is mutable 
         e2.setEmpGrossSalary(5000);
           e2.setEmpName("ibrahim");
       
           System.out.println(e2.getMonthlyNetSalary());
        System.out.println(e2.getAnnualNetSalary());
        
        
        
        
    }
}
