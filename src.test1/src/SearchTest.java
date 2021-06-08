import static org.junit.Assert.*;
import org.junit.Test;

public class SearchTest {
	IData id;
	DP dp=new DP();
	Search search=new Search();
	
	@Test
	public void test_Empty_Room() {
		id=dp;
		id.iniRooms();
		assertEquals("�÷���Ϊ��",search.status(801));
	}
	
	@Test
	public void test_NotEmpty_Room() {
		id=dp;
		id.iniRooms();
		id.in_Out_Room(901, "Marry");
		assertEquals("Marry",search.status(901));
	}
	
	@Test
	public void test_Wrong_RoomNumber() {
		assertEquals("��������ȷ�ķ����",search.status(915));
	}
}
