package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.UnknownHostException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.Iterator;
import model.Answer;
import model.Student;
import view.ClientList;








public class Registration
  extends UnicastRemoteObject
  implements IRegistration, ActionListener
{
  ArrayList<Student> studentLists;
  ArrayList<Answer> answerLists;
  ClientList view;
  
  public Registration(ClientList view)
    throws RemoteException, MalformedURLException, UnknownHostException
  {
    studentLists = new ArrayList();
    answerLists = new ArrayList();
    Registry reg = LocateRegistry.createRegistry(1099);
    System.out.println("IP " + InetAddress.getLocalHost().getHostAddress());
    reg.rebind("Server", this);
    
    this.view = view;
    this.view.setVisible(true);
  }
  
  public synchronized Student register(Student s) throws RemoteException
  {
    Iterator<Student> it = studentLists.iterator();
    if (s.getMaSV() == null)
      return null;
    while (it.hasNext()) {
      Student next = (Student)it.next();
      if ((s.getMaSV().equalsIgnoreCase(next.getMaSV())) && (s.getMaSV() != null)) {
        return next;
      }
    }
    
    s.setIsAlreadyRegistration(true);
    if (s.getMaSV() != null) {
      studentLists.add(s);
      view.addNewRow(s);
    }
    return s;
  }
  


  public synchronized Answer answer(Answer answer)
    throws RemoteException
  {
    Iterator<Student> it_s = studentLists.iterator();
    if (it_s.hasNext()) {
      Student next = (Student)it_s.next();
      if (next.getMaSV().equalsIgnoreCase(answer.getStudent().getMaSV())) {
        answer.setIsAlreadyRegistration(true);
      }
    }
    Iterator<Answer> it = answerLists.iterator();
    int index = 0;
    while (it.hasNext()) {
      Answer next = (Answer)it.next();
      if (next.getStudent().getMaSV().equalsIgnoreCase(answer.getStudent().getMaSV())) {
        answer.setIsAlreadyRegistration(true);
        answerLists.set(index, answer);
        view.updateAnswerView(answer);
        return answer;
      }
      index++;
    }
    System.out.println("Get answer from " + answer.getStudent().getMaSV() + " IP " + answer.getStudent().getIP());
    
    view.updateAnswerView(answer);
    answerLists.add(answer);
    return answer;
  }
  


  public void actionPerformed(ActionEvent e)
  {
    throw new UnsupportedOperationException("Not supported yet.");
  }
}
