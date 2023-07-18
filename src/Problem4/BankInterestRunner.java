package Problem4;

public class BankInterestRunner {
    public static void main(String[] args) {
        BankInterest bankInterest = new BankInterest();
        bankInterest.setBalance(1000);
        System.out.println("after first year "+bankInterest.printBalance(1));
        System.out.println("after second year "+bankInterest.printBalance(2));
        System.out.println("after third year "+bankInterest.printBalance(3));
    }
}
