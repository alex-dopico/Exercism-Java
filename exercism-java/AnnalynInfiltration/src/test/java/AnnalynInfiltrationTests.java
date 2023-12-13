import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AnnalynInfiltrationTests {
	AnnalynInfiltration infiltration = new AnnalynInfiltration();

	@DisplayName ("can prisoner be freed?")
	@Test
	public void canPrisonerBeFreed() {
		infiltration.knight = true;
		infiltration.archer = true;
		infiltration.dog = true;
		assertFalse(infiltration.prisonerCanBeFreed());
	}
}
