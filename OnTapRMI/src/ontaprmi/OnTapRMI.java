
package ontaprmi;

import control.CalculatorImpl;
import control.ICalculator;
import control.IRegistration;
import java.net.UnknownHostException;
import java.rmi.AlreadyBoundException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import model.Student;

/**
 *
 * @author duc
 */
public class OnTapRMI {

    public static void main(String[] args) throws RemoteException, NotBoundException, UnknownHostException, AlreadyBoundException {
        Registry reg = LocateRegistry.getRegistry("192.168.0.2", 1099);
        System.out.println("connected");
        
        IRegistration server = (IRegistration) reg.lookup("Server");
        
        System.out.println(server.register(new Student("B19DCCN186", "Bui Minh Duc", "192.168.0.3", 6)));
        
//        ICalculator cal = new CalculatorImpl();
        
    }
    
}
