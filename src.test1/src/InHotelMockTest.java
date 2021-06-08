import static org.junit.Assert.*;

import org.jmock.Expectations;
import org.jmock.Mockery;
import org.junit.Before;
import org.junit.Test;

public class InHotelMockTest {

	//构造一个Mockery对象
    private Mockery context=new Mockery();
    private IData iData=null;
    private InHotel ih=null;
	
	//用Mockery实例来构造一个模拟的IData对象
    @Before
    public void setUp() throws Exception{
   	 iData=context.mock(IData.class);
   	 ih=new InHotel(iData);
   	 context.checking(new Expectations(){{
   		allowing(iData).in_Out_Room(901, "Marry");
   		will(onConsecutiveCalls(returnValue("Marry成功入住901房间！")));
   		 }});
     }
    @Test
	public void testIn() {
		assertEquals("Marry成功入住901房间！",ih.in(901, "Marry"));
		//assertEquals("Kate成功入住901房间！",ih.in(901, "Kate"));
	}
}
