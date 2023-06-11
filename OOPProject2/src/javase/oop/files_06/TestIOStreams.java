/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javase.oop.files_06;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class TestIOStreams {
    public static void main(String[] args) {
        try { 
            FileInputStream fIs = new FileInputStream("C:\\Java 8\\Round 1\\inheritance.jpg");
            BufferedInputStream bIs = new BufferedInputStream(fIs);
               
           FileOutputStream fOs = new FileOutputStream("C:\\Java 8\\Round 1\\inheritance_copy.jpg");
             BufferedOutputStream bOs = new BufferedOutputStream(fOs);   
           
                byte[] buffer = new byte[10240]; // 10kb 
              int i =  bIs.read(buffer);
               while( i != -1 ){
                       bOs.write(buffer, 0, i);
                   i = bIs.read(buffer);
               }
                   bOs.flush();
             
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TestIOStreams.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TestIOStreams.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
