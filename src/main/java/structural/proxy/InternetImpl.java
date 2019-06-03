package structural.proxy;

public class InternetImpl implements Internet {
    public String connectTo(String serverHost) {
        return "Connecting to " + serverHost;
    }
}
