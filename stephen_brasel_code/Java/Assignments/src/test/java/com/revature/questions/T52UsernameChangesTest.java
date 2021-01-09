package com.revature.questions;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class T52UsernameChangesTest {
	Q52UsernameChanges sut;

	@Before
	public void setUp() throws Exception {
		sut = new Q52UsernameChanges();
	}

	@After
	public void tearDown() throws Exception {
		sut = null;
	}

	@Test
	public void Q52NotNull() {
		assertNotNull(sut);
	}

	@Test
	public void possibleChanges(){
		List<String> l = new ArrayList<>();
		l.add("hydra");
		l.add("zyxwvutsrqponmlkjihgfedcba");
		l.add("abcdefghijklmnopqrstuvwxyz");

		l.add("aaaaaaaaaaaaaaaaaaaaaaaaaa");
		l.add("bbbbbbbbbbbbbbbbbbbbbbbbbb");
		l.add("cccccccccccccccccccccccccc");
		l.add("dddddddddddddddddddddddddd");
		l.add("eeeeeeeeeeeeeeeeeeeeeeeeee");
		l.add("ffffffffffffffffffffffffff");
		l.add("gggggggggggggggggggggggggg");
		l.add("hhhhhhhhhhhhhhhhhhhhhhhhhh");
		l.add("iiiiiiiiiiiiiiiiiiiiiiiiii");
		l.add("jjjjjjjjjjjjjjjjjjjjjjjjjj");
		l.add("kkkkkkkkkkkkkkkkkkkkkkkkkk");
		l.add("llllllllllllllllllllllllll");
		l.add("mmmmmmmmmmmmmmmmmmmmmmmmmm");
		l.add("nnnnnnnnnnnnnnnnnnnnnnnnnn");
		l.add("oooooooooooooooooooooooooo");
		l.add("pppppppppppppppppppppppppp");
		l.add("qqqqqqqqqqqqqqqqqqqqqqqqqq");
		l.add("rrrrrrrrrrrrrrrrrrrrrrrrrr");
		l.add("ssssssssssssssssssssssssss");
		l.add("tttttttttttttttttttttttttt");
		l.add("uuuuuuuuuuuuuuuuuuuuuuuuuu");
		l.add("vvvvvvvvvvvvvvvvvvvvvvvvvv");
		l.add("wwwwwwwwwwwwwwwwwwwwwwwwww");
		l.add("xxxxxxxxxxxxxxxxxxxxxxxxxx");
		l.add("yyyyyyyyyyyyyyyyyyyyyyyyyy");
		l.add("zzzzzzzzzzzzzzzzzzzzzzzzzz");

		l.add("z");
		l.add("a");
		l.add("b");
		l.add("c");
		l.add("d");
		l.add("e");
		l.add("f");
		l.add("g");
		l.add("h");
		l.add("i");
		l.add("j");
		l.add("k");
		l.add("l");
		l.add("m");
		l.add("n");
		l.add("o");
		l.add("p");
		l.add("q");
		l.add("r");
		l.add("s");
		l.add("t");
		l.add("u");
		l.add("v");
		l.add("w");
		l.add("x");
		l.add("y");
		l.add("z");

		List<String> result = new ArrayList<>();
		result.add("YES");
		result.add("YES");
		result.add("NO");

		result.add("NO");
		result.add("NO");
		result.add("NO");
		result.add("NO");
		result.add("NO");
		result.add("NO");
		result.add("NO");
		result.add("NO");
		result.add("NO");
		result.add("NO");
		result.add("NO");
		result.add("NO");
		result.add("NO");
		result.add("NO");
		result.add("NO");
		result.add("NO");
		result.add("NO");
		result.add("NO");
		result.add("NO");
		result.add("NO");
		result.add("NO");
		result.add("NO");
		result.add("NO");
		result.add("NO");
		result.add("NO");
		result.add("NO");

		result.add("NO");
		result.add("NO");
		result.add("NO");
		result.add("NO");
		result.add("NO");
		result.add("NO");
		result.add("NO");
		result.add("NO");
		result.add("NO");
		result.add("NO");
		result.add("NO");
		result.add("NO");
		result.add("NO");
		result.add("NO");
		result.add("NO");
		result.add("NO");
		result.add("NO");
		result.add("NO");
		result.add("NO");
		result.add("NO");
		result.add("NO");
		result.add("NO");
		result.add("NO");
		result.add("NO");
		result.add("NO");
		result.add("NO");
		result.add("NO");
		String s = "substring";
		assertArrayEquals(result.toArray(), Q52UsernameChanges.possibleChanges(l).toArray());
	}
}