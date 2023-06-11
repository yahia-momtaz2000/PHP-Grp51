/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javase.oop.apis_05;
// application program interface = libraries

import java.util.Arrays;
import java.util.Date;


/**
 *
 * @author Administrator
 */
public class TestString {
    public static void main(String[] args) {
        
        // data types 
        // 1- primitive type  نوع البيانات الاصلية في الجافا
        // 2- class type   من نوع كلاس
        //-------------------
        // 1- primitive types
        // integers type: byte (8 bit ) - short (16 bit) - int (32 bit) - long (64bit)  
        // decimals :    float   -   double  
        // char   :   1 character 
        // boolean :  true - false
        // ++++++++++++++++++++++++++++++++++++++++++++++++++
        // 2- class type : 
        // String - Date - Calendar - Employee - Order - Customer .........
        
        int x = 10;       
        String name = "Ahmed"; 
                // name is object
        String s = new String("ahmed"); // it is not preferred
         // String is immutable class
        // object created cannot be modified 
        // create another object
        String s1 = "Ahmed";
        String s2 = "ahmed";
       //  System.out.println( s1 == s2 ); // XX string is object
        System.out.println(  s1.equals(s2) );
        System.out.println( s1.equalsIgnoreCase(s2) );
       //  System.out.println("Welcome to\n\tEgypt");
      String filePath = "C:\\Test\\java.pdf"; 
        System.out.println( filePath.endsWith(".pdf") );
       
        String mobile = "9662312312";
        if(mobile.startsWith("966")){
               System.out.println("Saudi Number"); 
        }else if (mobile.startsWith("200")){
            System.out.println("Egypt no");
        }
        
        String empName = "Ahmed Mostafa";  
         System.out.println(empName.indexOf(" "));
        
        String firstName = empName.substring(0, 5);
         System.out.println(firstName);
         String lastName = empName.substring(6);
         System.out.println(lastName);
         
        System.out.println(  empName.replace(" ", "_") ); 
        String t = "I Love Java";
        t = t.replace("Java", "Oracle");
        System.out.println(t);
        System.out.println(empName.length());
        System.out.println( empName.toUpperCase());
        System.out.println( empName.toLowerCase());
        System.out.println(t);
        System.out.println( empName.contains("Mosy"));
        System.out.println(t.contains("Oracle"));
        System.out.println(t);
         // concat
        t = t + " and Java and C++";
        System.out.println(t);
        System.out.println("Result = "+ (4 + 5) );
        
        
        // String to integer
          String n = "125";
          System.out.println(n + 5);
        int num = Integer.parseInt(n); // Double.parseDouble(n);
        System.out.println(num + 5);
        
       /// Integer to String
         int empId = 101;
         String empCode = String.valueOf(empId);
       
         String courses = "Oracle;Java;C++;PHP";
         String[] coursesArr =   courses.split(";");
      
        System.out.println(Arrays.toString(coursesArr));
         
        
     /////////// StringBuilder is mutable 
        String ss = "Java";
        StringBuilder builder = new StringBuilder(ss);
       // builder.reverse();
        System.out.println(builder);
        builder.insert(0,"Welcome to ");
        System.out.println(builder);
        builder.append(" and Oracle");
        System.out.println(builder);
        
    }
}
