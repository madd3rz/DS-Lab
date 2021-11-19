public class PrintNameRunnable implements Runnable {

    String name;
    PrintNameRunnable(String name) {
        this.name = name;
    }


    //Implementing run() method defined in Runnable interface.

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(name);
        }
    }
    
}
