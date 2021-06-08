import static org.junit.Assert.*;
import junit.framework.Assert;
import org.junit.Test;
public class CalculatorTest1 {
    private Calculator cal=new Calculator();
 @Test
    public void testAdd1(){
        int result;
        result=cal.add(2,3);
        assertEquals(5,result);

    }
    @Test
    public void testAddzero(){
        int result;
        result=cal.add(0,3);
        assertEquals(0,result);
    }
     @Test
    public void testAdd3(){
        fail("测试失败");
    }
    //语句覆盖
    @Test
    public void testcommission1()throws Exception {
        float result1;
        float result2;
        float result3;
        result1 = cal.commission(10, 1, 5);
        result2 = cal.commission(1, 1, 1);
        result3 = cal.commission(100, 150, 100);
        Assert.assertEquals(85.0, result1, 0.0);
        Assert.assertEquals(9.8, result2, 0.0);
        Assert.assertEquals(1830.0, result3, 0.0);
    }
    //判定覆盖
    @Test
    public void testcommission2()throws Exception {
        float result;
        result = cal.commission(100, 150, 100);
        Assert.assertEquals(1920.0, result, 0.0);
    }
    //条件覆盖
    @Test
    public void testcommission3()throws Exception {
        float result1;
        float result2;
        result1 = cal.commission(1, 1, 1);
        result2 = cal.commission(100, 150, 100);
        Assert.assertEquals(9.8,result1,0.1);
        Assert.assertEquals(1920.0, result2, 0.0);
    }
    //条件判定覆盖
    @Test
    public void testcommission4()throws Exception {
        float result1;
        float result2;
        result1 = cal.commission(1, 1, 1);
        result2 = cal.commission(200, 100, 100);
        Assert.assertEquals(9.8,result1,0.1);
        Assert.assertEquals(2000.0, result2, 0.0);
    }
    //条件组合覆盖
    @Test
    public void testcommission5()throws Exception {
        float result1;
        float result2;
        float result3;
        result1 = cal.commission(1, 1, 1);
        result2 = cal.commission(10, 30, 5);
        result3 = cal.commission(100,150,100);
        Assert.assertEquals(9.8,result1,0.1);
        Assert.assertEquals(121.0,result2,0.0);
        Assert.assertEquals(1830.0, result3, 0.0);
    }
    //路径覆盖
    @Test
    public void testcommission6()throws Exception {
        float result1;
        float result2;
        float result3;
        result1 = cal.commission(1, 1, 1);
        result2 = cal.commission(10, 30, 5);
        result3 = cal.commission(100, 150, 100);
        Assert.assertEquals(9.8,result1,0.1);
        Assert.assertEquals(121.0,result2,0.0);
        Assert.assertEquals(1920.0, result3, 0.0);
    }
    //MC/CD覆盖
    @Test
    public void testcommission7()throws Exception {
        float result1;
        float result2;
        result1 = cal.commission(1, 1, 1);
        result2 = cal.commission(10, 30, 5);
        Assert.assertEquals(9.8,result1,0.1);
        Assert.assertEquals(121.0,result2,0.0);
    }
}
