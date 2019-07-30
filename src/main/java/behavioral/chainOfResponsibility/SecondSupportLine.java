package behavioral.chainOfResponsibility;

public class SecondSupportLine implements SupportLine {

    private SupportLine nextSupportLine;

    @Override
    public void setNextLine(SupportLine nextLine) {
        this.nextSupportLine = nextLine;
    }

    @Override
    public void handleRequest(SupportRequest request) {
        if (request.getType() <= 2) {
            System.out.println("Request has been handled by Second Line");
        } else {
            System.out.println("Request has not been handled by Second Line; Escalated to the Third Line");
            nextSupportLine.handleRequest(request);
        }
    }
}
