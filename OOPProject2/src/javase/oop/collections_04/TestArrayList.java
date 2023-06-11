/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javase.oop.collections_04;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Administrator
 */
public class TestArrayList {

    public static void main(String[] args) {

        // arrays ?
        int[] myArray = new int[5];
        myArray[0] = 33;
        //  System.out.println(Arrays.toString(myArray));
        // 1- fixed start size   2- single data type
        // >> Arraylist : builtin class > builtin methods 
        ArrayList myList = new ArrayList();
        myList.add(33);
        myList.add(50);
        myList.add(44.65);
        myList.add("Yahia");
        myList.add(100);
        System.out.println(myList);
        System.out.println(myList.size());
        myList.add(3, 70);
        System.out.println(myList);
        System.out.println(myList.get(4));
        System.out.println(myList.indexOf("Yahia"));
        System.out.println(myList.contains(75));
        myList.remove(3);
        System.out.println(myList);
        myList.remove("Yahia");
        System.out.println(myList);
        
       // loop on arraylist
       // for i loop
        System.out.println("+++ for i loop +++");
        for(int i = 0; i < myList.size(); i++){
            System.out.println( myList.get(i) );
        }
    
        System.out.println("+++++++ foreach loop +++++");
        for(Object item : myList){
            System.out.println(item);
        }
        
    }

}
