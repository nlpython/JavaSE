package Junit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestJunit {
    @Before
    public void init() {
        System.out.println("测试开始---");
    }

    @After
    public void close() {
        System.out.println("测试结束---");
    }

    //测试add方法
    @Test
    public void testAdd() {
        System.out.println("add测试方法");
        Calculator cal = new Calculator();
        int result = cal.add(10, 30);
        //加入断言: 预测结果, 判断预测结果和实际结果是否一致
        Assert.assertEquals(40, result);
    }
    //测试sub方法
    @Test
    public void testSub() {
        System.out.println("测试sub方法");
        Calculator cal = new Calculator();
        System.out.println(cal.sub(10, 49));
    }
}
