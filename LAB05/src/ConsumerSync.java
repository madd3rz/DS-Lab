public class ConsumerSync extends Thread {

    private CubbyHoleSync cubbyhole;
    private int number;

    public ConsumerSync(CubbyHoleSync c, int number) {
        cubbyhole = c;
        this.number = number;
    }

    public void run() {
        int value = 0;

        for (int i = 0; i < 10; i++) {
            value = cubbyhole.get(number);
        }
    }
    
}
