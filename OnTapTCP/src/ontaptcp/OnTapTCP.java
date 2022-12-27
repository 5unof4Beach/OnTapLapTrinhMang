/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ontaptcp;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import model.Answer;
import model.Student;

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
            Socket s = new Socket("192.168.0.6", 11310);
            DataOutputStream dos = new DataOutputStream(s.getOutputStream());
            ObjectOutputStream oos = new ObjectOutputStream(s.getOutputStream());
            DataInputStream dis = new DataInputStream(s.getInputStream());
            ObjectInputStream ois = new ObjectInputStream(s.getInputStream());
            dos.writeUTF("B19DCCN186");
            Student student = (Student) ois.readObject();
            System.out.println(student.getMaSV());
            student.setGroup(6);
            student.setHovaten("Bui Minh Duc dep trai vl");
            student.setIP("192.168.0.2");
            
            oos.writeObject(student);
            oos.flush(); 
            dos.writeUTF(student.getHovaten()); 
            dos.writeInt(6); 
            oos.writeObject(new Answer(student));
            oos.close();
            
            System.out.println("Server connected");
        }catch(Exception e){
            
        }
    }
    
}
