package rmi_server;

import control.IRegistration;
import control.Registration;
import java.net.MalformedURLException;
import java.net.UnknownHostException;
import java.rmi.RemoteException;
import view.ClientList;

public class RMI_Server {
    public static void main(String[] args) throws RemoteException, MalformedURLException, UnknownHostException {
        ClientList view = new ClientList();
        IRegistration reg = new Registration(view);
    }
    
}
