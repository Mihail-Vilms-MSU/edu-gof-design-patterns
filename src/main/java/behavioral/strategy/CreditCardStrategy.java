package behavioral.strategy;

public class CreditCardStrategy implements PayStrategy {

    private String number;
    private String name;
    private String cvv;

    CreditCardStrategy(String number, String name, String cvv){
        this.number = number;
        this.name = name;
        this.cvv = cvv;
    }

    private boolean verify(){
        // some additional verification

        return !this.number.isEmpty() && !this.name.isEmpty() && !this.cvv.isEmpty();
    };

    @Override
    public String pay(int paymentAmount) {
        if (verify()) {
            return "Successfully paid by Credit card";
        } else {
            return "Failed to pay by Credit Card";
        }
    }
}
