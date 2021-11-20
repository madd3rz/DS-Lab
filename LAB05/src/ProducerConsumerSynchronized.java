public class ProducerConsumerSynchronized {
    public static void main(String[] args) {

        CubbyHoleSync c = new CubbyHoleSync();

        ProducerSync p1 = new ProducerSync(c, 1);
        ConsumerSync c1 = new ConsumerSync(c, 1);

        p1.start();
        c1.start();
        
    }
}
