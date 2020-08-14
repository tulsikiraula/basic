package basic;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.gen5.api.DisplayName;
import org.junit.jupiter.api.Test;

class MathCalculationTest {

	MathCalculation mathCaculation = new MathCalculation();
	
	@Test
	@DisplayName(value = "addinh two ints")
	void add() { 
		assertEquals(3, mathCaculation.add(1,2),"adding 2 ints");
				
	}

}
