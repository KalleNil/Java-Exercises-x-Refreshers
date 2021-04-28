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
public class DigitSplitter {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        
        String[] hej = scan.nextLine().split("");
        
        int nummer1 = Integer.parseInt(hej[0]);
        int nummer2 = Integer.parseInt(hej[1]);
        int nummer3 = Integer.parseInt(hej[2]);
        
        int sumOfDigits = nummer1 + nummer2 + nummer3;
        
        System.out.println(sumOfDigits);
        
        
        
        
        
        
    }
    
}
