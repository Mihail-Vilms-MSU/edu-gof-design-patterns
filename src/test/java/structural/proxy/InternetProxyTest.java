package structural.proxy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class InternetProxyTest {
    @Test
    public void connectTo_connectsSuccessfully(){

        Internet internet = new InternetImpl();
        List<String> bannedSites = new ArrayList<>();
        bannedSites.add("abc.com");
        bannedSites.add("def.com");

        InternetProxy internetProxy = new InternetProxy();
        internetProxy.setInternet(internet);
        internetProxy.setBannedSites(bannedSites);

        Assert.assertEquals("Connecting to aaa.com", internetProxy.connectTo("aaa.com"));
    }

    @Test
    public void connectTo_accessDenied(){

        Internet internet = new InternetImpl();
        List<String> bannedSites = new ArrayList<>();
        bannedSites.add("abc.com");
        bannedSites.add("def.com");;

        InternetProxy internetProxy = new InternetProxy();
        internetProxy.setInternet(internet);
        internetProxy.setBannedSites(bannedSites);

        Assert.assertEquals("Access Denied", internetProxy.connectTo("abc.com"));
    }
}
