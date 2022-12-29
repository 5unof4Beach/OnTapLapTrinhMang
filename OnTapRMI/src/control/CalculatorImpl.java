/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author duc
 */
public class CalculatorImpl extends UnicastRemoteObject implements ICalculator{

    public CalculatorImpl() throws RemoteException, UnknownHostException, AlreadyBoundException {
        Registry reg = LocateRegistry.createRegistry(1099);
        System.out.println("Calculator server running on "+ InetAddress.getLocalHost().getHostAddress());
        reg.rebind("Ducbui", this);
    }
    

    @Override
    public synchronized int add(int a, int b) {
        return a + b;
    }

    @Override
    public synchronized int subtract(int a, int b) {
        return a-b;
    }
    
}
