package cn.openread.decorator;

public class Source implements Sourceable {
    @Override
    public void method() {
        System.out.println(1);
    }
}
