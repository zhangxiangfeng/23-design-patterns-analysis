package cn.openread.decorator;

public class Decorator implements Sourceable {
    private Sourceable origin;

    public Decorator(Sourceable origin) {
        this.origin = origin;
    }

    @Override
    public void method() {
        //自定义实现
    }
}
