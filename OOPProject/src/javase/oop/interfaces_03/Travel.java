/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javase.oop.interfaces_03;

/**
 *
 * @author Administrator
 */
public interface Travel {
    public final int DAY_COST = 50;
    
    public abstract double getTicketCost();
    public abstract double getPerdimCost();
    public abstract double getAccomodationCost(int noDays);
    
}
