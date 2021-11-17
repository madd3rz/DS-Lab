package src;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class HelloServer {
    public static void main(String[] args) {
        try {
            System.setProperty("java.rmi.server.hostname", "127.0.0.1");
            // Instantiating implpemtation class
            ImplExample obj = new ImplExample();

            Registry registry = LocateRegistry.createRegistry(5000);
            //LocateRegistry.createRegistry(5000);
            //Naming.rebind("rmi://192.168.1.150:5000/Hello", obj);
            registry.bind("rmi://127.0.0.1:5000/Hello",obj);
            System.err.println("Server ready!!");
        } catch (Exception e) {
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
