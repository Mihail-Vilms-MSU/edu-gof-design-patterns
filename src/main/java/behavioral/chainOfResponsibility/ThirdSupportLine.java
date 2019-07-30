package behavioral.chainOfResponsibility;

public class ThirdSupportLine implements SupportLine {

    private SupportLine nextSupportLine;

    @Override
    public void setNextLine(SupportLine nextLine) {
        this.nextSupportLine = nextLine;
    }

    @Override
    public void handleRequest(SupportRequest request) {
        if (request.getType() <= 3) {
            System.out.println("Request has been handled by Third Line");
        } else {
            System.out.println("Request has not been handled by Third Line");
        }
    }
}
