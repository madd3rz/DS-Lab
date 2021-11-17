package src;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class HelloClient {
    private HelloClient(){}
    public static void main(String[] args) {
        try {
            //System.setProperty("java.rmi.server.hostname", "192.168.1.150");
            Registry registry = LocateRegistry.getRegistry(5000); 
            Hello stub = (Hello) registry.lookup("rmi://127.0.0.1:5000/Hello");
            stub.sayHello("test1");

            System.out.println(stub.sayHello("mint01"));
        } catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
        }
    }
    
}