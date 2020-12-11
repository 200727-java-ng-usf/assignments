package com.revature.questions;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

public class T48KSortedSLLMergeTest {
	Q48KSortedSLLMerge sut;

	@Before
	public void setUp() throws Exception {
		sut = new Q48KSortedSLLMerge();
	}

	@After
	public void tearDown() throws Exception {
		sut = null;
	}

	@Test
	public void SSLLNotNull() {
		assertNotNull(sut);
	}

	@Test
	public void mergeListsNull() {
		List<LinkedList<Integer>> l = null;
		LinkedList<Integer> expected = new LinkedList<>();
		assertArrayEquals(expected.toArray(), sut.mergeLists(l).toArray());
	}

	@Test
	public void mergeListsEmpty() {
		List<LinkedList<Integer>> l = new ArrayList<>();
		LinkedList<Integer> expected = new LinkedList<>();
		assertArrayEquals(expected.toArray(), sut.mergeLists(l).toArray());
	}

	@Test
	public void mergeListsSingleList() {
		LinkedList<Integer> ll1 = new LinkedList<>();
		ll1.add(1);
		ll1.add(3);
		ll1.add(5);
		List<LinkedList<Integer>> l = new ArrayList<>();
		l.add(ll1);
		LinkedList<Integer> expected = new LinkedList<>();
		expected.add(1);
		expected.add(3);
		expected.add(5);
		assertArrayEquals(expected.toArray(), sut.mergeLists(l).toArray());
	}

	@Test
	public void mergeLists2lists123456() {
		LinkedList<Integer> ll1 = new LinkedList<>();
		ll1.add(1);
		ll1.add(3);
		ll1.add(5);
		LinkedList<Integer> ll2 = new LinkedList<>();
		ll2.add(2);
		ll2.add(4);
		ll2.add(6);
		List<LinkedList<Integer>> l = new ArrayList<>();
		l.add(ll1);
		l.add(ll2);
		LinkedList<Integer> expected = new LinkedList<>();
		expected.add(1);
		expected.add(2);
		expected.add(3);
		expected.add(4);
		expected.add(5);
		expected.add(6);
		assertArrayEquals(expected.toArray(), sut.mergeLists(l).toArray());
	}

	@Test
	public void mergeLists3lists123456() {
		LinkedList<Integer> ll1 = new LinkedList<>();
		ll1.add(1);
		ll1.add(5);
		LinkedList<Integer> ll2 = new LinkedList<>();
		ll2.add(2);
		ll2.add(4);
		LinkedList<Integer> ll3 = new LinkedList<>();
		ll3.add(3);
		ll3.add(6);
		List<LinkedList<Integer>> l = new ArrayList<>();
		l.add(ll1);
		l.add(ll2);
		l.add(ll3);
		LinkedList<Integer> expected = new LinkedList<>();
		expected.add(1);
		expected.add(2);
		expected.add(3);
		expected.add(4);
		expected.add(5);
		expected.add(6);
		assertArrayEquals(expected.toArray(), sut.mergeLists(l).toArray());
	}

	@Test
	public void mergeLists111246() {
		LinkedList<Integer> ll1 = new LinkedList<>();
		ll1.add(1);
		ll1.add(1);
		ll1.add(1);
		LinkedList<Integer> ll2 = new LinkedList<>();
		ll2.add(2);
		ll2.add(4);
		ll2.add(6);
		List<LinkedList<Integer>> l = new ArrayList<>();
		l.add(ll1);
		l.add(ll2);
		LinkedList<Integer> expected = new LinkedList<>();
		expected.add(1);
		expected.add(1);
		expected.add(1);
		expected.add(2);
		expected.add(4);
		expected.add(6);
		assertArrayEquals(expected.toArray(), sut.mergeLists(l).toArray());
	}
}