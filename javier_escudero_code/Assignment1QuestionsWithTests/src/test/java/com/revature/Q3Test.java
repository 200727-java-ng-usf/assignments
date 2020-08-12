package com.revature;

import org.junit.Test;


public class Q3Test {

    private Q3 q3; // SUT = System Under Test
    @Test
    public void testQ3() {
        q3 = new Q3(); // creating a class object
        StringBuilder sb = new StringBuilder("abc");
        System.out.println("String was: " + sb);
        q3.reverseMethod(sb);
        System.out.println("\nAfter reversing it:\n" + sb);
    }
//	public static void main(String[] args) {
//		//StringBuffer sb = new StringBuffer("Hello ");
//		Q3a q3a = new Q3a(); // creating a class object
//		StringBuffer sb = new StringBuffer("Hello ");
//		q3a.reverseMethod(sb);
//		System.out.println("in main" + sb);
//	}
}

//package com.revature;
//
//import org.junit.Before;
//import org.junit.Test;
//
//import static org.junit.Assert.*;
//import static org.junit.Assert.assertSame;
//
//public class Q3Test {
//    private Q3 sut; // SUT = System Under Test
//   // delete public static void main(String[] args) {
//
//   @Before
//   public void t1Setup(){
//       sut = new Q3();
//   }
//
//    @Test
//    public void expectedString() {
//        // string to be passed
//      //  String stringToBePassed = sut.reverseString("abc d123");
//
//        // string expected
//        String  expectedReversedString= "321d abc";
//        System.out.println("Q3Testing" + );
//        System.out.println(sut.reverseString("abc d123") );
//     //   assertSame(expectedReversedString, sut.reverseString("abc d123") );
//    }
//    //}
//
//}