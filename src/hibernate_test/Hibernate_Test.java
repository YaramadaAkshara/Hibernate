/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate_test;

import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author User
 */
public class Hibernate_Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Session s=connection.controller.getSessionFactory().openSession();
        Transaction tr=s.beginTransaction();
        
        pojos.Actor act1=new pojos.Actor();
        act1.setActorid(2);
        act1.setActorname("abhi");
        act1.setActorage(25);
        
        s.save(act1);
        tr.commit();
        
        System.out.println("saved successfully.....");
        s.close();
        tr=null;
        
                
    }
    
}
