package com.revature.questions;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class T34ParenthesisReversalTest {
	Q34ParenthesisReversal sut;
	String parens = "()",
			parparens = "(())",
			parparparens = "((()))",
			startparens = "()abcdef",
			midparens = "abc()def",
			endparens = "abcdef()",
			startparensfilled = "(abc)def",
			midparensfilled = "a(bcde)f",
			endparensfilled = "abc(def)",
			dualparensfilled = "(abc)(def)",
			parensfilled = "(abcdef)",
			parensnested = "((ab)c(de))f";

	@Before
	public void setUp() throws Exception {
		sut = new Q34ParenthesisReversal();
	}

	@After
	public void tearDown() throws Exception {
		sut = null;
	}

	@Test
	public void notNull(){
		assertNotNull(sut);
	}

	@Test
	public void reverseInParenthesesNull() {
		assertEquals("", sut.reverseInParentheses(null));
	}
	@Test
	public void reverseInParenthesesEmpty() {
		assertEquals("", sut.reverseInParentheses(""));
	}
	@Test
	public void reverseInParenthesesparens() {
		assertEquals("", sut.reverseInParentheses(parens));
	}
	@Test
	public void reverseInParenthesesparparens() {
		assertEquals("", sut.reverseInParentheses(parparens));
	}
	@Test
	public void reverseInParenthesesparparparens() {
		assertEquals("", sut.reverseInParentheses(parparparens));
	}
	@Test
	public void reverseInParenthesesStartParens() {
		assertEquals("abcdef", sut.reverseInParentheses(startparens));
	}
	@Test
	public void reverseInParenthesesMidParens() {
		assertEquals("abcdef", sut.reverseInParentheses(midparens));
	}
	@Test
	public void reverseInParenthesesEndParens() {
		assertEquals("abcdef", sut.reverseInParentheses(endparens));
	}
	@Test
	public void reverseInParenthesesStartparensFilled() {
		assertEquals("cbadef", sut.reverseInParentheses(startparensfilled));
	}
	@Test
	public void reverseInParenthesesMidparensFilled() {
		assertEquals("aedcbf", sut.reverseInParentheses(midparensfilled));
	}
	@Test
	public void reverseInParenthesesEndparensFilled() {
		assertEquals("abcfed", sut.reverseInParentheses(endparensfilled));
	}
	@Test
	public void reverseInParenthesesDualparensFilled() {
		assertEquals("cbafed", sut.reverseInParentheses(dualparensfilled));
	}
	@Test
	public void reverseInParenthesesParensFilled() {
		assertEquals("fedcba", sut.reverseInParentheses(parensfilled));
	}
	@Test
	public void reverseInParenthesesParensNested() {
		assertEquals("decabf", sut.reverseInParentheses(parensnested));
	}
}
