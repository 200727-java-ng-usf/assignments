package com.revature.questions;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class T47BSTCreationTest {
	Q47BSTCreation sut;

	@Before
	public void setUp() throws Exception {
		sut = new Q47BSTCreation();
	}

	@After
	public void tearDown() throws Exception {
		sut = null;
	}

	@Test
	public void mergeSortedLists() {
		BinaryTree bt = new BinaryTree();
		bt.add(8);
		bt.add(4);
		bt.add(2);
		bt.add(1);
		bt.add(3);
		bt.add(6);
		bt.add(5);
		bt.add(7);
		bt.add(12);
		bt.add(10);
		bt.add(9);
		bt.add(11);
		bt.add(14);
		bt.add(13);
		bt.add(15);
		System.out.println("Size: "+ bt.size() + "\tMax Depth: " + bt.maxDepth() + "\t, " +  bt);
	}

	@Test
	public void createBinaryTree15(){
		int len = 15, ar[] = new int[len];
		for (int i = 0; i < len; i++) {
			ar[i] = i+1;
		}
		System.out.println(Arrays.toString(ar));
		BinaryTree bt = sut.createBinaryTree(ar);
		System.out.println("Size: "+ bt.size() + "\tMax Depth: " + bt.maxDepth() + "\t, " +  bt);
		assertEquals(len,bt.size());
		assertEquals(((int)(Math.log(len) / Math.log(2))), bt.maxDepth());
	}

	@Test
	public void createBinaryTree7(){
		int len = 7, ar[] = new int[len];
		for (int i = 0; i < len; i++) {
			ar[i] = i+1;
		}
		System.out.println(Arrays.toString(ar));
		BinaryTree bt = sut.createBinaryTree(ar);
		System.out.println("Size: "+ bt.size() + "\tMax Depth: " + bt.maxDepth() + "\t, " +  bt);
		assertEquals(len,bt.size());
		assertEquals(((int)(Math.log(len) / Math.log(2))), bt.maxDepth());
	}
}