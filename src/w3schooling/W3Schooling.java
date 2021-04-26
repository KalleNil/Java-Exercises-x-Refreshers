/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w3schooling;

import java.io.File;

/**
 *
 * @author Kalle
 */
public class W3Schooling {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File file = new File("B:\\lokalaDataBasen");
        String[] fileList = file.list();
        for(String name:fileList){
            System.out.println(name);
        }
    }
}


    

