package Problem5;

public class PrintName {
    public void print(){
        for (int i = 0; i <= 20; i++) {
            if(i%2==0)
                System.out.print("+");
            else
                System.out.print("-");
        }
        System.out.println();
        System.out.println("|       alvee       |");
        for (int i = 0; i <= 20; i++) {
            if(i%2==0)
                System.out.print("+");
            else
                System.out.print("-");
        }
    }
}
