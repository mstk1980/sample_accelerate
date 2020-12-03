package test1;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class Color1Test {

	@Test
	public void testGetColor1() {
		Color1 c1 = new Color1();
		String t1 = c1.getColor(1);
		assertThat(t1,is("赤"));
	}
	@Test
	public void testGetColor2() {
		Color1 c1 = new Color1();
		String t1 = c1.getColor(2);
		assertThat(t1,is("test"));
	}
	@Test
	public void testGetColor3() {
		Color1 c1 = new Color1();
		String t1 = c1.getColor(3);
		assertThat(t1,is("1or2を入力して下さい"));
	}
}