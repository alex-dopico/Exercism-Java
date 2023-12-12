/**
 * INSTRUCTIONS:
 *     1. Define the expected oven time in minutes:
 *     According to the book the expected time in minutes is 40.
 *     2. Calculate the remaining oven time in minutes:
 *     Takes actualMinutes the lasagna has been in the oven
 *     and returns how many time left in minutes
 *     3. Calculate the preparation time in minutes:
 *     Takes the number of layers and returns the number of
 *     minutes it will take, each layer takes 2 minutes.
 *     4. Calculate the total working time in minutes:
 *     Takes the number of layers and the number of minutes
 *     the lasagna has already been in oven. Returns the sum of
 *     preparation time and the time the lasagna has been in oven.
 */

public class Lasagna {
	private final int EXPECTED_TIME_IN_OVEN = 40;
	private final int TIME_PER_LAYER = 2;

	public int getTIME_PER_LAYER() {
		return this.TIME_PER_LAYER;
	}

	public int getEXPECTED_TIME_IN_OVEN() {
		return this.EXPECTED_TIME_IN_OVEN;
	}

	public int preparationTimeInMinutes(int numberLayers) {
		return numberLayers * getTIME_PER_LAYER();
	}

	public int remainingTimeInOven(int actualMinutes) {
		return getEXPECTED_TIME_IN_OVEN() - actualMinutes;
	}

	public int totalWorkingTimeInMinutes(int numberLayers, int actualMinutes) {
		return preparationTimeInMinutes(numberLayers) + actualMinutes;
	}
}
