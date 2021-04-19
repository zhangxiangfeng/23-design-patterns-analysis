package cn.openread.decorator;

public class Decorator implements Sourceable {
    private Sourceable origin;

    public Decorator(Sourceable origin) {
        this.origin = origin;
    }

    @Override
    public void method() {
        System.out.println(0);
        origin.method();
        System.out.println(2);
    }
}
