public class PrintStringsThreadSync2 implements Runnable {
    
    Thread thread;
    String str1, str2;
    TwoStringsSync2 ts;

    PrintStringsThreadSync2(String str1, String str2, TwoStringsSync2 ts) {

        this.str1 = str1;
        this.str2 = str2;
        this.ts = ts;

        thread = new Thread(this);
        thread.start();
    }

    public void run() {
        //Sync over TwoSringSync2 object
        synchronized (ts){
            ts.print(str1,str2);
        }
    }

}
