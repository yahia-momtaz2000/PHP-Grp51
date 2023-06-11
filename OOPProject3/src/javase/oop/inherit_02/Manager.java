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
public class Manager extends Person{
    private int profitPercentage;
     // constructor

    public Manager(int personId, String personName,
            double personGrossSalary, String personJob, int profitPercentage) {
        super(personId, personName, personGrossSalary, personJob);
        this.profitPercentage = profitPercentage;
    }
    
    // accessors Getters & setters
    public int getProfitPercentage() {
        return profitPercentage;
    }

    public void setProfitPercentage(int profitPercentage) {
        this.profitPercentage = profitPercentage;
    }
    
    // our methods
     public double getMonthlyNetSalary(){
         int tax = 10; // 10%
         return getPersonGrossSalary() - getPersonGrossSalary() * tax / 100.0;
     }
    
    public double getAnnualNetSalary(){
         return getMonthlyNetSalary() * 12;
    }
    
    // annual salary + manager profit percentage from company profit
    // overloading : 2 methods or more with the same name in the same class
    //         must have different parameters ( count | order | data types )
    
    public double getAnnualNetSalary(double companyProfit){
        return getAnnualNetSalary() + companyProfit * profitPercentage / 100.0;
    }

    @Override
    public int calcLeavesDays(int noDays) {
       return 0;
    }
    
}
