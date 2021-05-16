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
        
        for (int i=0; i<ip.length; i++){
            
           if (i<1){
               ipDefanged.add((ip[i]));
              
           
               
           }else{
           ipDefanged.add("[.]");
           ipDefanged.add((ip[i]));
           }
           
           
           
           
           
            
        }
        
        String defangedIpAdress = ipDefanged.toString().replaceAll(",", "").replaceFirst("\\[", "").replaceAll(" ", "");
        
        String reverseIP = new StringBuffer(defangedIpAdress).reverse().toString().replaceFirst("\\]", "");
        String finalIP = new StringBuffer(reverseIP).reverse().toString();
        
        System.out.println(finalIP);
        
        
        
        
        
        
        
             
    }

    
    
}
