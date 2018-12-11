package cn.openread.adapter.clazz;

public class Adapter extends Source implements TargeTable {

    @Override
    public void method2() {
        System.out.println("新的方法");
    }
}