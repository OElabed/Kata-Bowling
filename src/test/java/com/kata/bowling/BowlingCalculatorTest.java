package com.kata.bowling;

import org.junit.Assert;
import org.junit.Test;

public class BowlingCalculatorTest {

	@Test
	public void testComputeScoreWithSequenceOne() {

		String sequenceRolls = "9-9-9-9-9-9-9-9-9-9-";

		int score = BowlingCalculator.computeScore(sequenceRolls);

		Assert.assertTrue(score == 90);

	}
	
	
	@Test
	public void testComputeScoreWithSequenceTow() {

		String sequenceRolls = "XXXXXXXXXXXX";

		int score = BowlingCalculator.computeScore(sequenceRolls);

		Assert.assertTrue(score == 300);

	}
	
	
	@Test
	public void testComputeScoreWithSequenceThree() {

		String sequenceRolls = "5/5/5/5/5/5/5/5/5/5/5";

		int score = BowlingCalculator.computeScore(sequenceRolls);

		Assert.assertTrue(score == 150);

	}
	
	@Test
	public void testComputeScoreWithSequenceFour() {

		String sequenceRolls = "546/X8/XX5427X44";

		int score = BowlingCalculator.computeScore(sequenceRolls);

		Assert.assertTrue(score == 157);

	}
}
