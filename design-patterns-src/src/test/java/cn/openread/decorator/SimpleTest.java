package cn.openread.decorator;

import org.junit.Test;

public class SimpleTest {

    @Test
    public void test() {
        Sourceable source = new Source();
        Sourceable obj = new Decorator(source);
        obj.method();
    }
}
