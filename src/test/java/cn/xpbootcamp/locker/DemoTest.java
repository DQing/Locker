package cn.xpbootcamp.locker;

import org.junit.Assert;
import org.junit.Test;

public class DemoTest {
    //这个测试文件只是一个demo，仅供参考，提交代码时需要删除
    @Test
    public void should_return_correct_number_when_calculate_given_two_numbers() {
        Demo demo = new Demo();
        int result = demo.calculate(1, 1);
        Assert.assertEquals(2, result);
    }
}
