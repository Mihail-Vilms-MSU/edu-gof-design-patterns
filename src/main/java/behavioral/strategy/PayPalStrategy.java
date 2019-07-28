package behavioral.strategy;

public class PayPalStrategy implements PayStrategy {

    private String emailId;
    private String password;

    PayPalStrategy(String emailId, String password){
        this.emailId = emailId;
        this.password = password;
    }

    private boolean verify(){
        // some additional verification

        return !this.emailId.isEmpty() && !this.password.isEmpty();
    };

    @Override
    public String pay(int paymentAmount) {
        if (verify()) {
            return "Successfully paid by PayPal";
        } else {
            return "Failed to pay by PayPal";
        }
    }
}
