package cn.openread.prototype;

import org.junit.Test;

public class SimpleTest {

    @Test
    public void test() {
        Prototype source = new ConcretePrototype1();
        Client obj = new Client(source);
        obj.operation();
    }
}
