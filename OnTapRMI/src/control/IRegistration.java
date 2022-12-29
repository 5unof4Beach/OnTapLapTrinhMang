package control;

import java.rmi.Remote;
import java.rmi.RemoteException;
import model.Answer;
import model.Student;

public abstract interface IRegistration
  extends Remote
{
  public abstract Student register(Student paramStudent)
    throws RemoteException;
  
  public abstract Answer answer(Answer paramAnswer)
    throws RemoteException;
}
