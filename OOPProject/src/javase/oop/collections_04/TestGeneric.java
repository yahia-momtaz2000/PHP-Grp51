/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javase.oop.collections_04;

import java.util.ArrayList;
import javase.oop.inherit_02.Employee;

/**
 *
 * @author Administrator
 */
public class TestGeneric {

    public static void main(String[] args) {
//////// generics  >>> arraylist > specific type instead of Object
        Employee e1 = new Employee(101, "Ahmed", 7000, "java", 10, 20.0);
        Employee e2 = new Employee(102, "Aly", 3000, "java", 10, 30.0);
        Employee e3 = new Employee(103, "Mostafa", 8000, "java", 10, 20.0);
      
        // generics 
        ArrayList<Employee> empsList = new ArrayList();
        empsList.add(e1); empsList.add(e2);  empsList.add(e3);
            
        // loop for each ???
        // arraylist > Object +ve | -ve  
        for(Employee item : empsList){
             System.out.println(item.getPersonName());
        }
        
        

    }
}
