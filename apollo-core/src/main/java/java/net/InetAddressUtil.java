package java.net;

public class InetAddressUtil {

    static InetAddressImpl  impl = InetAddress.impl;


    public static InetAddress getLoopbackAddress() {
        return impl.loopbackAddress();
    }
}
