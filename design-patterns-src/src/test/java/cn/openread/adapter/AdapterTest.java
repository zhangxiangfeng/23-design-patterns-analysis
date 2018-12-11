package cn.openread.adapter;

import cn.openread.adapter.clazz.Adapter;
import cn.openread.adapter.clazz.Source;
import cn.openread.adapter.clazz.TargeTable;
import cn.openread.adapter.interfaces.SourceAble;
import cn.openread.adapter.interfaces.SourceSub1;
import cn.openread.adapter.interfaces.SourceSub2;
import cn.openread.adapter.object.Wrapper;
import org.junit.Test;

/**
 * 适配器模式测试
 */
public class AdapterTest {


    /**
     * 1.基于类实现的适配器模式测试
     * <p>
     * 这样Targetable接口的实现类就具有了Source类的功能。
     */
    @Test
    public void testClassAdapter() {

        TargeTable targeTable = new Adapter();
        targeTable.method1();
        targeTable.method2();
    }


    /**
     * 2.基于对象的适配器模式测试
     */
    @Test
    public void testObjectAdapter() {

        Source source = new Source();
        TargeTable targeTable = new Wrapper(source);
        targeTable.method1();
        targeTable.method2();
    }

    /**
     * 3.基于接口的适配器模式
     */
    @Test
    public void testInterfaceAdapter() {

        SourceAble source1 = new SourceSub1();
        SourceAble source2 = new SourceSub2();

        source1.method1();
        source2.method2();
    }
}
