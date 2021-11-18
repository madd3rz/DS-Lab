public class PrintNameThread2 extends Thread {
    PrintNameThread2(String name){
        super(name);
        start();
    }

    public void run(){
        System.out.println("run() method of the " + this.getName() + " thread is called");
        for(int i = 0; i < 10; i++){
            System.out.println(this.getName());
        }
    }
}
