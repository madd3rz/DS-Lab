package src;

import java.rmi.*;
import java.rmi.server.*;
// Implementing the remote interface
public class ImplExample extends UnicastRemoteObject implements Hello {
    protected ImplExample() throws RemoteException {
        super();
    }

    public String sayHello(String a) {
        return "Server:$ Hello Client " + a;
    }
}