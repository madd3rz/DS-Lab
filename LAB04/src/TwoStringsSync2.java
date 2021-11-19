public class TwoStringsSync2 {
    
    void print(String str1, String str2){
        System.out.print(str1);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {}
        System.out.println(str2);
    }
}
