/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ontapudp;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Student;

public class OnTapUDP {

    static int PORT = 11310;
    static String IP = "192.168.0.2";
    
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        try {
            InetAddress add = InetAddress.getByName(IP);
            DatagramSocket mySocket = new DatagramSocket();
            sendStudent(mySocket, add);
            receiveStudent(mySocket);
            
        } catch (SocketException ex) {
            Logger.getLogger(OnTapUDP.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public static void sendStudent(DatagramSocket mySocket, InetAddress add) throws IOException{
        byte[] sendData = new byte[1024];

        Student st = new Student("B19DCCN186", "Bui Minh Duc", "192.168.68.113", 6);

        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(st);
        oos.flush();
        sendData = bos.toByteArray();
        bos.flush();
        DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, add, PORT);

        mySocket.send(sendPacket);
        
    }
    
    public static void receiveStudent(DatagramSocket mySocket) throws IOException, ClassNotFoundException{
        System.out.println("Receiving Data");
        byte[] receiveData = new byte[1024];
        DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
        mySocket.receive(receivePacket);
        
        ByteArrayInputStream bis = new ByteArrayInputStream(receiveData);
        ObjectInputStream ois = new ObjectInputStream(bis);
        Student receiveStudent = (Student) ois.readObject();
        
        System.out.println("+++++++++++++----------+++++++++++"+receiveStudent.getHovaten());
    }
    
    public static int gcd(int a, int b){
        if(a == 0){
            return b;
        }
        return gcd(b%a, a);
    }

    public static int lcm(int a, int b){
        return (a / gcd(a, b)) * b;
    }

    public boolean isPrime(int n){
        if(n <= 1){
            return false;
        }
        for(int i = 2; i < n; i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
}
