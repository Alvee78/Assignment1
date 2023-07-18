package Problem3;

public class ProductNumber {
    private int result;
    public ProductNumber(){
        result = 1 ;
    }
    public int getResult(int number){
        for (int loopcount = 1; loopcount <= number ; loopcount++) {
            result = result * loopcount ;
        }
        return result ;
    }
}
