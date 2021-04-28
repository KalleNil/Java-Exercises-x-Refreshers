/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w3schooling;

import java.util.Scanner;

/**
 *
 * @author Kalle
 */
public class MinutesToYearsAndDaysConverter {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int minutes = scan.nextInt();
        
        int years = minutes / 525600;
        
        int days = (minutes %525600)/1440 ;
        
        
        System.out.println(minutes +" minutes is approximatelt "+ years+ " years " + " and " + days +" days");
       
    }
    
}
