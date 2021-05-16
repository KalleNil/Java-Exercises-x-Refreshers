/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w3schooling;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Kalle
 */
public class DefangingAnIP_Adress {
    //skapa en array
   
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] ip = scan.nextLine().split("\\.");
        
        ArrayList<String> ipDefanged = new ArrayList<String>();
        String defangedIpString;
        for (int i=0; i<ip.length; i++){
           ipDefanged.add("[");
           ipDefanged.add((ip[i]));
           ipDefanged.add("]");
           
           defangedIpString = ipDefanged.toString();
            System.out.println(defangedIpString);
           
           
            
        }
        
             
    }

    
    
}
