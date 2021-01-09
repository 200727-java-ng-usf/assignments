package com.revature.util;

import com.revature.util.operators.VoidOperator;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TTimer {
	Timer sut;
	VoidOperator v = new VoidOperator() {
		@Override
		public void execute(Object... args) {
			return;
		}
	};

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
		Object[] o = new Object[]{};
		assertEquals(0, Timer.time(v, o));
	}

	@Test
	public void printTime() {
		Timer.printTime(v);
	}
}