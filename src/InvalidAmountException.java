public class InvalidAmountException extends Exception {
    public  InvalidAmountException(){
        super("amount cannot be zero.");
    }
}
