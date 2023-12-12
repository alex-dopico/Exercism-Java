import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class LasagnaTests {
	Lasagna lasagna = new Lasagna();

	@DisplayName("is 40 expected time in oven?")
	@Test
	public void isFortyTheExpectedTimeInOven() {
		int expectedTimeInOven = 40;
		assert(expectedTimeInOven == lasagna.getEXPECTED_TIME_IN_OVEN());
	}

	@DisplayName("is 2 the amount of minutes per layer?")
	@Test
	public void isTwoTheExpectedTimePerLayer() {
		int expectedTimePerLayer = 2;
		assert(expectedTimePerLayer == lasagna.getTIME_PER_LAYER());
	}
}
