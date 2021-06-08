import static org.junit.Assert.*;
import org.junit.Test;

public class InHotelTest {
	protected DP dp=new DP();
	protected IData id=dp;
	protected InHotel ih=new InHotel(id);
	@Test
	public void testIn() {
		id.iniRooms();
		assertEquals("Ka成功入住801房间！", ih.in(801, "Ka"));
		assertEquals("WW成功入住801房间！", ih.in(801, "WW"));
	}

}
