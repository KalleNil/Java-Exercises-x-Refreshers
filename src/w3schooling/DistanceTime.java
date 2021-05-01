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
public class DistanceTime {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        float inputDistance = scan.nextFloat();
        
        float inputHour = scan.nextFloat();
        float hour = inputHour * 60 * 60;
        
        float inputMinutes = scan.nextFloat();
        float minutes = inputMinutes * 60;
        
        float sumOfHourAndMin = hour + minutes;
        
        float sec = scan.nextFloat();
        
        float km = inputDistance/1000;
        
        float miles = (float) (km * 0.622);
        
        float sumOfAllInHours = (sumOfHourAndMin + sec)/3600;
        
        
       
       
       
       float sumOfAll = sec + sumOfHourAndMin;
      
        System.out.println("M/S: " + inputDistance/sumOfAll);
        System.out.println("KM/H: " + km/sumOfAllInHours );
        System.out.println("MILES/H: " + miles/sumOfAllInHours );
        
        
    }
    
}
