/**
 * ISTRUCTIONS
 * 1. Check if a fast attack can be made:
 * A fast attack can be made when the knight is sleeping.
 * 2. Check if the group can be spied upon:
 * The group can be spied if one of them is awake.
 * 3. Check if the prisoner can be signaled:
 * The prisoner can be signaled if prisoner is awake
 * and the archer is sleeping.
 * 4. Check if the prisoner can be freed:
 * If Annalyn has her pet and the archer is asleep OR
 * if archer and knight are both sleeping.
 */

public class AnnalynInfiltration {
	boolean knight;
	boolean archer;
	boolean prisoner;
	boolean dog;

	public boolean checkIfFastAttackPossible() {
		return !knight;
	}

	public boolean canBeSpied() {
		return knight || archer || prisoner || dog;
	}

	public boolean prisonerCanBeSignaled() {
		return prisoner && !archer;
	}

	public boolean prisonerCanBeFreed() {
		return (dog && !archer) || (!knight && !archer);
	}
}
