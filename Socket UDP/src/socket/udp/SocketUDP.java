/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socket.udp;

import control.TCPServer;
import java.net.Socket;
import view.ClientList;

/**
 *
 * @author suckm
 */
public class SocketUDP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        startServer();
        
    }
    
    public static void startServer(){
        ClientList view = new ClientList();
        TCPServer s = new TCPServer(view);
        s.start();
    }
}
