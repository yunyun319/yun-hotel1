
import static org.junit.Assert.*;

import org.jmock.Expectations;
import org.jmock.Mockery;
import org.junit.Before;
import org.junit.Test;
public class OutHotelMockTest {
    //构造一个Mockery对象
    private Mockery context = new Mockery();
    private IData iData = null;
    private OutHotel oh = null;

    //用Mockery实例来构造一个模拟的IData对象
    @Before
    public void setUp() throws Exception {
        iData = context.mock(IData.class);
        oh = new OutHotel(iData);
        context.checking(new Expectations() {{
            allowing(iData).in_Out_Room(901, "EMPTY");
            will(returnValue("901退房成功!"));
        }});
    }

    @Test
    public void testOut() {
        assertEquals("901退房成功!", oh.out(901));
        //assertEquals("701退房成功!", oh.out(701));
    }
}
