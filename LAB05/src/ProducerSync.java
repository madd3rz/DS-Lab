public class ProducerSync extends Thread {

    private CubbyHoleSync cubbyhole;
    private int number;

    public ProducerSync(CubbyHoleSync c, int number) {
        cubbyhole = c;
        this.number = number;
    }
    
    public void run() {
        for (int i = 0; i < 10; i++) {
            cubbyhole.put(number, i);
            try {
                sleep((int)(Math.random() * 1000));
            } catch (InterruptedException e) {}
        }
    }
}
