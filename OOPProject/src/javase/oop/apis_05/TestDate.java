/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javase.oop.apis_05;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Administrator
 */
public class TestDate {
    public static void main(String[] args) {
        
        Date today = new Date();
        System.out.println(today);
        // custom date : 12 April 2021  > year + 1900 | month start 0
        Date customDate = new Date(121, 3, 12 );
        System.out.println(customDate);
        System.out.println(customDate.after(today));
        
       // 12-4-2021   dd-MM-yyyy
       SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss"); 
        System.out.println(   sdf.format(today)       );
        System.out.println("+++++++ Calendar +++++++++");
      // Calendar
       GregorianCalendar gcToday = new GregorianCalendar();
         // convert back to util Date
          Date d = gcToday.getTime();
        System.out.println(d);
        System.out.println(gcToday.getTime());
        System.out.println("_________");
        // custom date 12 April 2021
        GregorianCalendar gcCustom = new GregorianCalendar(2021, 3, 12);
        System.out.println( gcCustom.getTime() );
        System.out.println("------");
           System.out.println( gcToday.get( Calendar.YEAR )  );
           System.out.println( gcToday.get(Calendar.MONTH ));
           System.out.println( gcToday.get(Calendar.DAY_OF_MONTH ) );
           System.out.println( gcToday.get(Calendar.DAY_OF_WEEK));
           System.out.println( gcToday.get(Calendar.WEEK_OF_MONTH));
        System.out.println("-----------");
         gcToday.add(Calendar.DAY_OF_MONTH, 2);
         System.out.println(gcToday.getTime());
           
       if(gcToday.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY){
           System.out.println("Today is Saturday");
       } else{
           System.out.println("Today is not Saturday");
       }
         
       
     System.out.println("++++++++++++++++ Business days example +++++++");
       // weekend : FRI + SAT
       // example; What is the date after 10 business days from today > 14-jan-2021
      gcToday = new GregorianCalendar();
        System.out.println(gcToday.getTime());
       int noDays = 10;
        
      for(int i = 0; i < noDays; i++){
          if(gcToday.get(Calendar.DAY_OF_WEEK) == Calendar.THURSDAY ){
                gcToday.add(Calendar.DAY_OF_MONTH, 3);
          }else{ 
             gcToday.add(Calendar.DAY_OF_MONTH, 1);
          }
      }  
         System.out.println(gcToday.getTime());

      
        
        
       
    }
}
