package com.revature.questions;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class T53BackupHistoryTest {
	Q53BackupHistory sut;

	@Before
	public void setUp() throws Exception {
		sut = new Q53BackupHistory();
	}

	@After
	public void tearDown() throws Exception {
		sut = null;
	}

	@Test
	public void T53NotNull() {
		assertNotNull(sut);
	}

	@Test
	public void backupHistory() {
		int[] creationTimes = {461620201, 461620203, 461620207};
		int[][] backupRequests =
				{{1,0,461620202},
						{1,2,461620208},
						{0,2,461620210},
						{1,0,461620204},
						{1,1,461620209},
						{1,1,461620203}};
		int k = 3;
		int t = 461620210;
		int[] expected = {4, 3, 1};
		assertArrayEquals(expected, sut.backupHistory(creationTimes, backupRequests, k, t));
	}
}