package structural.adapter;

public class SocketAdapterImpl implements SocketAdapter {
    Socket socket = new Socket();

    public Volt get120Volt() {
        return socket.getVolt();
    }

    public Volt get12Volt() {
        Volt defaultVolt = socket.getVolt();
        return convertVolt(defaultVolt, 10);
    }

    public Volt get3Volt() {
        Volt defaultVolt = socket.getVolt();
        return convertVolt(defaultVolt, 40);
    }

    private Volt convertVolt(Volt inputVolt, int i){
        return new Volt(inputVolt.getVolts()/i);
    }

}
