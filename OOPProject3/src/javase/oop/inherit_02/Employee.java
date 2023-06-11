/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javase.oop.inherit_02;

/**
 *
 * @author Administrator
 */
public class Employee extends Person {
    
    private int overTimeHours;
    private double overTimeRate;

    public Employee( int personId, String personName, double personGrossSalary, 
            String personJob, int overTimeHours, double overTimeRate) {
      // calling parent constructor from child constructor
        super(personId, personName, personGrossSalary, personJob);
        this.overTimeHours = overTimeHours;
        this.overTimeRate = overTimeRate;
    }

    

    public int getOverTimeHours() {
        return overTimeHours;
    }

    public void setOverTimeHours(int overTimeHours) {
        this.overTimeHours = overTimeHours;
    }

    public double getOverTimeRate() {
        return overTimeRate;
    }

    public void setOverTimeRate(double overTimeRate) {
        this.overTimeRate = overTimeRate;
    }
    
    public double getMonthlyNetSalary(){
         int tax = 10;
         return getPersonGrossSalary() - getPersonGrossSalary() * tax / 100.0
                + overTimeHours * overTimeRate ;
    }
    
    public double getAnnualNetSalary(){
        return getMonthlyNetSalary() * 12;
    }
    
    public void printPersonDetails(){
        // call parent method during overriding
          super.printPersonDetails();
        System.out.println("Monthly net = "+getMonthlyNetSalary());
        System.out.println("Annual Net = "+getAnnualNetSalary());
    }
    
   // overriding toString() method : in  Object class   

    @Override
    public String toString() {
        return "Employee id "+getPersonId()+", person name "+getPersonName();
    }

    @Override
    public int calcLeavesDays(int noDays) {
        ///
        return 7; 
    }
       
            
}

