public class MyOwnRunnableClass implements Runnable {

    String name;
    MyOwnRunnableClass(String name) {
        this.name = name;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        
    }
    
}
