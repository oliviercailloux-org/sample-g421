package io.github.oliviercailloux.g421;

/**
 * Rolls three dice on demand.
 */
public interface DiceRoller {
	/**
	 * Roll the three dice.
	 */
	void roll();

	/**
	 * Returns the result of the last roll shown by the first die.
	 *
	 * @return a number between 1 and 6.
	 * @throws IllegalStateException iff the dice have not been rolled yet.
	 */
	int first() throws IllegalStateException;

	/**
	 * Returns the result of the last roll shown by the second die.
	 *
	 * @return a number between 1 and 6.
	 * @throws IllegalStateException iff the dice have not been rolled yet.
	 */
	int second() throws IllegalStateException;

	/**
	 * Returns the result of the last roll shown by the third die.
	 *
	 * @return a number between 1 and 6.
	 * @throws IllegalStateException iff the dice have not been rolled yet.
	 */
	int third() throws IllegalStateException;
}
