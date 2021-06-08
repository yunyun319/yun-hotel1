import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OutHotelTest {
    protected DP dp=new DP();
    protected IData id=dp;
    protected OutHotel oh=new OutHotel(id);
    @Test
    public void testIn() {
        id.iniRooms();
        assertEquals("退房成功！", oh.out(801));
        assertEquals("退房成功！", oh.out(803));
    }
}
