package August12;

public class InsuficiantBalanceExeception extends RuntimeException{
    public InsuficiantBalanceExeception(String message) {
        System.out.println("Insufficient Balance");
    }
}
