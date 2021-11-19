public class SynchronizedExample1 {
    public static void main(String[] args){
        new PrintStringsThreadSynchronized("Hello ", "there.");
        new PrintStringsThreadSynchronized("How are ", "you?");
        new PrintStringsThreadSynchronized("Thank you ", "very much");
    }
}
