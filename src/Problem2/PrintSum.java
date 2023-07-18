package Problem2;

public class PrintSum {
    private int result;
    public PrintSum(){
        result = 0;
    }
    public int getResult(int number) {
        for (int loopCount = 0; loopCount <= number; loopCount++) {
            result = result + loopCount ;
        }
        return result;
    }
}
