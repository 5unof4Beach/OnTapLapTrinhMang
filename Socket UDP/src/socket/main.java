/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socket;

import control.TCPServer;
import control.UDPServer;
import java.net.Socket;
import view.ClientList;

/**
 *
 * @author suckm
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        startTCP();
        startUDP();
        
    }
    
    public static void startTCP(){
        ClientList view = new ClientList();
        TCPServer s = new TCPServer(view);
        s.start();
    }
    
    public static void startUDP(){
        ClientList view = new ClientList();
        UDPServer s = new UDPServer(view);
        s.start();
    }
}
