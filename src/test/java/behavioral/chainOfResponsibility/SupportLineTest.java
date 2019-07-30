package behavioral.chainOfResponsibility;

import org.junit.Test;

public class SupportLineTest {
    private FirstSupportLine first;
    private SupportLine second;
    private SupportLine third;

    @Test
    public void taskHasToBeHandledByAppropriateLine(){
        FirstSupportLine first = new FirstSupportLine();
        SupportLine second = new SecondSupportLine();
        SupportLine third = new ThirdSupportLine();
        first.setNextLine(second);
        second.setNextLine(third);

        SupportRequest request = new SupportRequest("Issue B", 2);
        first.handleRequest(request);

        request = new SupportRequest("Issue C", 3);
        first.handleRequest(request);

        request = new SupportRequest("Issue C", 4);
        first.handleRequest(request);
    }
}
