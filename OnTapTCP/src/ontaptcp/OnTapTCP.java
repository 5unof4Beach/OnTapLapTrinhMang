/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ontaptcp;

import java.net.Socket;

/**
 *
 * @author suckm
 */
public class OnTapTCP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try{
            Socket s = new Socket("192.168.0.2", 11310);
            System.out.println("Server connected");
        }catch(Exception e){
            
        }
    }
    
}
