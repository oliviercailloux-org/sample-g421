package io.github.oliviercailloux;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import io.github.oliviercailloux.g421.RandomDiceRoller;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class RandomDiceRollerTests {
	@SuppressWarnings("unused")
	private static final Logger LOGGER = LoggerFactory.getLogger(RandomDiceRollerTests.class);

	@Test
	void testNoRoll() {
		final RandomDiceRoller roller = new RandomDiceRoller();
		assertThrows(IllegalStateException.class, roller::first);
		assertThrows(IllegalStateException.class, roller::second);
		assertThrows(IllegalStateException.class, roller::third);
	}

	@Test
	void testRolls() {
		final RandomDiceRoller roller = new RandomDiceRoller();
		roller.roll();
		final int first = assertDoesNotThrow(roller::first);
		final int second = assertDoesNotThrow(roller::second);
		final int third = assertDoesNotThrow(roller::third);
		LOGGER.info("Thrown: {}, {} and {}.", first, second, third);
		final int first2 = assertDoesNotThrow(roller::first);
		final int second2 = assertDoesNotThrow(roller::second);
		final int third2 = assertDoesNotThrow(roller::third);
		assertEquals(first, first2);
		assertEquals(second, second2);
		assertEquals(third, third2);
	}

}
