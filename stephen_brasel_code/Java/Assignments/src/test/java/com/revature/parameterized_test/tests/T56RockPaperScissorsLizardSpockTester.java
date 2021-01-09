package com.revature.parameterized_test.tests;

import com.revature.questions.Q56RockPaperScissorsLizardSpock;
import com.revature.util.RPSLS;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class T56RockPaperScissorsLizardSpockTester {
	private Q56RockPaperScissorsLizardSpock sut;
	private RPSLS[] input;
	private String expectedResult;

	public T56RockPaperScissorsLizardSpockTester(RPSLS[] input, String expectedResult) {
		this.input = input;
		this.expectedResult = expectedResult;
	}

	@Parameterized.Parameters
	public static Collection PlayersAndResults() {
		return Arrays.asList(new Object[][]{
				{new RPSLS[]{RPSLS.ROCK, RPSLS.ROCK}, "TIE"}
				,{new RPSLS[]{RPSLS.ROCK, RPSLS.PAPER}, "Player 2 wins"}
				,{new RPSLS[]{RPSLS.ROCK, RPSLS.SCISSORS}, "Player 1 wins"}
				,{new RPSLS[]{RPSLS.ROCK, RPSLS.LIZARD}, "Player 1 wins"}
				,{new RPSLS[]{RPSLS.ROCK, RPSLS.SPOCK}, "Player 2 wins"}
				,{new RPSLS[]{RPSLS.PAPER, RPSLS.PAPER}, "TIE"}
				,{new RPSLS[]{RPSLS.PAPER, RPSLS.SCISSORS}, "Player 2 wins"}
				,{new RPSLS[]{RPSLS.PAPER, RPSLS.LIZARD}, "Player 2 wins"}
				,{new RPSLS[]{RPSLS.PAPER, RPSLS.SPOCK}, "Player 1 wins"}
				,{new RPSLS[]{RPSLS.SCISSORS, RPSLS.SCISSORS}, "TIE"}
				,{new RPSLS[]{RPSLS.SCISSORS, RPSLS.LIZARD}, "Player 1 wins"}
				,{new RPSLS[]{RPSLS.SCISSORS, RPSLS.SPOCK}, "Player 2 wins"}
				,{new RPSLS[]{RPSLS.LIZARD, RPSLS.LIZARD}, "TIE"}
				,{new RPSLS[]{RPSLS.LIZARD, RPSLS.SPOCK}, "Player 1 wins"}
				,{new RPSLS[]{RPSLS.SPOCK, RPSLS.SPOCK}, "TIE"}
		});
	}

	@Before
	public void t55Setup(){
		sut = new Q56RockPaperScissorsLizardSpock();
	}
	@Test
	public void T56RPSLS(){
		String result = sut.play(input[0], input[1]);
		System.out.println("Play Parameters are: " + Arrays.toString(input) + "\t" + result);
		assertEquals(expectedResult, result);
	}
}
