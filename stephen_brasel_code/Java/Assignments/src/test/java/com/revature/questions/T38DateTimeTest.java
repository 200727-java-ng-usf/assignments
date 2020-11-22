package com.revature.questions;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import static org.junit.Assert.*;

public class T38DateTimeTest {
	Q38DateTime sut;

	@Before
	public void setUp() throws Exception {
		sut = new Q38DateTime();
	}

	@After
	public void tearDown() throws Exception {
		sut = null;
	}

	@Test
	public void getLocalDateTime() {
		System.out.println(sut.getLocalDateTime());
	}

	@Test
	public void getLocalDate() {
		System.out.println(sut.getLocalDate());
	}

	@Test
	public void getLocalTime() {
		System.out.println(sut.getLocalTime());
	}

	@Test
	public void testToString() {
		System.out.println(sut);
	}

	@Test
	public void setLocalDateTime() {
		LocalDate d = LocalDate.of(1992, 8, 25);
		LocalTime t = LocalTime.of(15,55);
		sut.setLocalDateTime(d, t);
		System.out.println(sut.getLocalDateTime());
	}

	@Test
	public void setLocalDateAndTime() {
		LocalDateTime ldt = LocalDateTime.of(1992, 8, 25, 15, 55);
		sut.setLocalDateAndTime(ldt);
		System.out.println(sut.getLocalDate() + "T" + sut.getLocalTime());
	}
}