package com.revature.util;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TTimer {
	Timer sut;

	@Before
	public void setUp() throws Exception {
		sut = new Timer();
	}

	@After
	public void tearDown() throws Exception {
		sut = null;
	}

	@Test
	public void timerNotNull(){
		assertNotNull(sut);
	}

	@Test
	public void time() {
		assertEquals(0, Timer.time(() -> {return;}));
	}

	@Test
	public void printTime() {
		Timer.printTime(() -> {return;});
	}
}