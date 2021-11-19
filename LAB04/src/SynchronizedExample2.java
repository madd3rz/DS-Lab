public class SynchronizedExample2 {
    public static void main(String[] args){
        
        TwoStringsSync2 s = new TwoStringsSync2();

        new PrintStringsThreadSync2("Hello ", "there.", s);
        new PrintStringsThreadSync2("How are ", "you?", s);
        new PrintStringsThreadSync2("Thank you ", "very much!", s);
    }
}
