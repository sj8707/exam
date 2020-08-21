package aaa.bbb.ccc;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculaotTest {

	@Test
	
		public void evalutesExpression() {
			Calculator cal = new Calculator();
			int sum = cal.evaluate("1+2+3");
			assertEquals(6,sum);
		}
	}


