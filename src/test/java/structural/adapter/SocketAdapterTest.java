package structural.adapter;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SocketAdapterTest {

    @Test
    public void get12Volt_Returns12Volt(){
        SocketAdapter adapter = new SocketAdapterImpl();
        assertEquals(adapter.get12Volt().getVolts(), 12);
    }

    @Test
    public void get3Volt_Returns3Volt(){
        SocketAdapter adapter = new SocketAdapterImpl();
        assertEquals(adapter.get3Volt().getVolts(), 3);
    }
}
