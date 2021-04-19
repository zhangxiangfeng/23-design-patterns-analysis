package cn.openread.proxy;

import org.junit.Test;

public class SimpleTest {

    @Test
    public void test() {
        RealObject source = new RealObject();
        ProxyObject obj = new ProxyObject(source);
        obj.operation();
    }
}
