public class RunnableThreadTest2 {
    public static void main(String[] args){

        PrintNameRunnable pnt1 = new PrintNameRunnable("Instance A");
        Thread t1 = new Thread(pnt1);
        t1.start();

        PrintNameRunnable pnt2 = new PrintNameRunnable("Instance B");
        Thread t2 = new Thread(pnt2);
        t2.start();
    }
}

