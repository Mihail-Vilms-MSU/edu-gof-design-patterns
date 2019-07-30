package behavioral.chainOfResponsibility;

public class FirstSupportLine implements SupportLine{

    private SupportLine nextSupportLine;

    @Override
    public void setNextLine(SupportLine nextSupportLine) {
        this.nextSupportLine = nextSupportLine;
    }

    @Override
    public void handleRequest(SupportRequest request) {
        if (request.getType() <= 1) {
            System.out.println("Request" + "\"" + request.getTitle() + "\"" + " has been handled by First Line");
        } else {
            System.out.println("Request" + "\"" + request.getTitle() + "\"" + " has not been handled by First Line; Escalated to the Second Line");
            nextSupportLine.handleRequest(request);
        }
    }
}
