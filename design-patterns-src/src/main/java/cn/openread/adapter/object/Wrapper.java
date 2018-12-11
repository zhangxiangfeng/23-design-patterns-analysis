package cn.openread.adapter.object;

import cn.openread.adapter.clazz.Source;
import cn.openread.adapter.clazz.TargeTable;

public class Wrapper implements TargeTable {

    private Source source;

    public Wrapper(Source source) {
        super();
        this.source = source;
    }

    @Override
    public void method2() {
        System.out.println("新的方法!");
    }

    @Override
    public void method1() {
        source.method1();
    }
}
