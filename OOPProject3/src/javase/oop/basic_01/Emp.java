/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javase.oop.basic_01;

/**
 *
 * @author Administrator
 */
public class Emp {
    private int empId;
    private String empName;
    private double empGrossSalary;
    private String empJob;
          
    
     // Constructor : initialize objects attributes during creation
     // default constructor = no argument constructor
     public Emp(){
        
     }
       // constrcutor paratmers
     // this > refer object members 
    public Emp(int empId, String empName, double empGrossSalary) {
        this.empId = empId;
        this.empName = empName;
        this.empGrossSalary = empGrossSalary;
    }
     
        
    // 2 methods get and set for attribute getEmpGrossSalary
    // get = read

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getEmpGrossSalary() {
        return empGrossSalary;
    }

    public void setEmpGrossSalary(double empGrossSalary) {
        if(empGrossSalary < 0){
            System.out.println("Salary cannot be negative");
            System.exit(0); // close application
        }
             
          this.empGrossSalary = empGrossSalary;
        
    }

    public String getEmpJob() {
        return empJob;
    }

    public void setEmpJob(String empJob) {
        this.empJob = empJob;
    }
     
    
    
     public double getMonthlyNetSalary(){
         int tax = 10;
         return empGrossSalary - empGrossSalary * tax / 100.0;
     }
     
     public double getAnnualNetSalary(){
           return getMonthlyNetSalary() * 12;
     }

}
