/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w3schooling;

/**
 *
 * @author Kalle
 */
public class ParkingSystem {
    
    int big;
    int medium;
    int small;
    public ParkingSystem(int big, int medium, int small){
        this.big = big;
        this.medium = medium;
        this.small = small;
        
    }
    
    public boolean addCar(int carType){
        switch (carType){
            case 1:{
                if (0<this.big){
                    this.big--;
                    return true;
                    
                }else{
                    return false;
                }
                
                
            }
            case 2:{
                if (0<this.medium){
                    this.medium--;
                    return true;
                }
                
            }
            case 3:{
                if (0<this.small){
                    this.small--;
                    return true;
                }
            }
            default:{
                return false;
            }
        }
            
        
        
    }
    public static void main(String[] args) {
        ParkingSystem platser = new ParkingSystem(1, 0, 2);
        System.out.println(platser.addCar(1));
        System.out.println(platser.addCar(2));
        System.out.println(platser.addCar(3));
        System.out.println(platser.addCar(1));
    }
    
}
