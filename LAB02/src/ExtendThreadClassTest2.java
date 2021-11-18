public class ExtendThreadClassTest2 { 
    public static void main(String args[]) { 
        PrintNameThread2 pnt1 = new PrintNameThread2("A");
        PrintNameThread2 pnt2 = new PrintNameThread2("B");
        PrintNameThread2 pnt3 = new PrintNameThread2("C");
        PrintNameThread2 myown = new PrintNameThread2("MyOwn");
    } 
}