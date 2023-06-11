/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javase.oop.exceptions_06;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class TestExceptions {

    public static void main(String[] args) {
        // runtime errors 
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Enter first No.");
            int firstNo = input.nextInt();

            System.out.println("Enter second No.");
            int secondNo = input.nextInt();

            int result = firstNo / secondNo;
            
            System.out.println("Result = " + result);
        } catch (InputMismatchException ex) {
            System.out.println("Plz enter only numbers");
        } finally{
            System.out.println("This is finally statement");
        } 

        System.out.println("++++ End of Program +++++++");
            // un checked exception : may be caught and may not
      /*
        try {
            // checked exception : must be caught
            FileReader fr = new FileReader("C\\test\\myfile.txt");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TestExceptions.class.getName()).log(Level.SEVERE, null, ex);
        }
       */
        
    }
}
