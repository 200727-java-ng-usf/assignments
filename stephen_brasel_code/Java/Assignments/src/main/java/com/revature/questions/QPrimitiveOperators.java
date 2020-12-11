package com.revature.questions;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * ******************************
 *
 * Operator Precedence
 * postfix					expr++ expr--
 * unary					+=expr --expr +expr -expr ~ !
 * multiplicative			* / %
 * additive					+ -
 * shift					>> << <<<
 * relational				< > <= >= instanceof
 * equality					== !=
 * bitwise AND				&
 * bitwise exclusive OR		^
 * bitwise inclusive OR		|
 * logical AND				&&
 * logical OR				||
 * ternary					?:
 * assignment				= += -= *= /= %= &= ^= |= <<= >>= >>>=
 *
 * ******************************
 * Operator return types for primitive and Object data types
 * =	Object, Primitive
 * +=	char, String, byte, short, int, long, float, double
 * -=	Type
 * *=	Type
 * /=	Type
 * %=	Type
 * <<=	Number (byte, short, int, long, float, and double)
 * >>=	Number (byte, short, int, long, float, and double)
 * >>>=	Number (byte, short, int, long, float, and double)
 * +	Type
 * -	Type
 * *	Type
 * /	Type
 * %	Type
 * &	int (byte, short, int, long)
 * |	int (byte, short, int, long)
 * ^	int (byte, short, int, long)
 * &=	int (byte, short, int, long)
 * |=	int (byte, short, int, long)
 * ^=	int (byte, short, int, long)
 * ++	Number (byte, short, int, long, float, and double)
 * --	Number (byte, short, int, long, float, and double)
 * &&	boolean
 * ||	boolean
 * ==	boolean
 * <	boolean
 * >	boolean
 * <=	boolean
 * >=	boolean
 */
public class QPrimitiveOperators {
	boolean b = false;
	Boolean B = false;
	char c = 'c';
	Character C = 'C';
	String str = "Str";
	short s = 1;
	Short S = 1;
	byte by = 2;
	Byte By = 2;
	int i = 3;
	Integer I = 3;
	long l = 4;
	Long L = 4L;
	float f = 1.0f;
	Float F = 1.0F;
	double d = 2.0d;
	Double D = 2.0D;
	BigInteger BI = new BigInteger("9223372036854776807");
	BigDecimal BD = new BigDecimal("9223372036864775807.9223372036854875807");
	Number newNum = 9;
	Object tim = 10;
//	NumCommand command = new;

	public void testboolean(boolean x){
		x = b;
		x = B;

		x = !b;
		x = !B;

		x &= b;
		x &= B;

		x |= b;
		x |= B;

		x ^= b;
		x ^= B;
		System.out.println("booleans can operate on \nbooleans and Booleans, \n=, &=, |=, ^=");
	}

	public void testBoolean(Boolean x){
		x = b;
		x = B;

		x = !b;
		x = !B;

		x &= b;
		x &= B;

		x |= b;
		x |= B;

		x ^= b;
		x ^= B;
		System.out.println("Booleans can operate on \nbooleans and Booleans, \n=, &=, |=, ^=");
	}

	public void testchar(char x){
		x = c;
		x = C;

		if(x == s){
			System.out.println("Chars can equal shorts");
		} else {
			System.out.println("Chars cannot equal shorts");
		}

		x += c;
		x += C;
		x += s;
		x += S;
		x += by;
		x += By;
		x += i;
		x += I;
		x += l;
		x += L;
		x += f;
		x += F;
		x += D;
		x += d;

		x -= c;
		x -= C;
		x -= s;
		x -= S;
		x -= by;
		x -= By;
		x -= i;
		x -= I;
		x -= l;
		x -= L;
		x -= f;
		x -= F;
		x -= D;
		x -= d;

		x *= c;
		x *= C;
		x *= s;
		x *= S;
		x *= by;
		x *= By;
		x *= i;
		x *= I;
		x *= l;
		x *= L;
		x *= f;
		x *= F;
		x *= D;
		x *= d;

		x /= c;
		x /= C;
		x /= s;
		x /= S;
		x /= by;
		x /= By;
		x /= i;
		x /= I;
		x /= l;
		x /= L;
		x /= f;
		x /= F;
		x /= D;
		x /= d;

		x %= c;
		x %= C;
		x %= s;
		x %= S;
		x %= by;
		x %= By;
		x %= i;
		x %= I;
		x %= l;
		x %= L;
		x %= f;
		x %= F;
		x %= D;
		x %= d;


		x &= c;
		x &= C;
		x &= s;
		x &= S;
		x &= by;
		x &= By;
		x &= i;
		x &= I;
		x &= l;
		x &= L;

		x |= c;
		x |= C;
		x |= s;
		x |= S;
		x |= by;
		x |= By;
		x |= i;
		x |= I;
		x |= l;
		x |= L;

		x ^= c;
		x ^= C;
		x ^= s;
		x ^= S;
		x ^= by;
		x ^= By;
		x ^= i;
		x ^= I;
		x ^= l;
		x ^= L;
	}

	public void testCharacter(Character x){
		x = c;
		x = C;
	}

	public void testString(String x){
		x = str;

		x += b;
		x += B;
		x += c;
		x += C;
		x += str;
		x += s;
		x += S;
		x += by;
		x += By;
		x += i;
		x += I;
		x += l;
		x += L;
		x += f;
		x += F;
		x += D;
		x += d;
	}

	public void testshort(short x){
		x = s;
		x = S;
		x = by;
		x = By;

		x += c;
		x += C;
		x += s;
		x += S;
		x += by;
		x += By;
		x += i;
		x += I;
		x += l;
		x += L;
		x += f;
		x += F;
		x += D;
		x += d;

		x -= c;
		x -= C;
		x -= s;
		x -= S;
		x -= by;
		x -= By;
		x -= i;
		x -= I;
		x -= l;
		x -= L;
		x -= f;
		x -= F;
		x -= D;
		x -= d;

		x *= c;
		x *= C;
		x *= s;
		x *= S;
		x *= by;
		x *= By;
		x *= i;
		x *= I;
		x *= l;
		x *= L;
		x *= f;
		x *= F;
		x *= D;
		x *= d;

		x /= c;
		x /= C;
		x /= s;
		x /= S;
		x /= by;
		x /= By;
		x /= i;
		x /= I;
		x /= l;
		x /= L;
		x /= f;
		x /= F;
		x /= D;
		x /= d;

		x %= c;
		x %= C;
		x %= s;
		x %= S;
		x %= by;
		x %= By;
		x %= i;
		x %= I;
		x %= l;
		x %= L;
		x %= f;
		x %= F;
		x %= D;
		x %= d;


		x &= c;
		x &= C;
		x &= s;
		x &= S;
		x &= by;
		x &= By;
		x &= i;
		x &= I;
		x &= l;
		x &= L;

		x |= c;
		x |= C;
		x |= s;
		x |= S;
		x |= by;
		x |= By;
		x |= i;
		x |= I;
		x |= l;
		x |= L;

		x ^= c;
		x ^= C;
		x ^= s;
		x ^= S;
		x ^= by;
		x ^= By;
		x ^= i;
		x ^= I;
		x ^= l;
		x ^= L;
	}

	public void testShort(Short x){
		x = s;
		x = S;
	}

	public void testbyte(byte x){
		x = by;
		x = By;

		x += c;
		x += C;
		x += s;
		x += S;
		x += by;
		x += By;
		x += i;
		x += I;
		x += l;
		x += L;
		x += f;
		x += F;
		x += D;
		x += d;

		x -= c;
		x -= C;
		x -= s;
		x -= S;
		x -= by;
		x -= By;
		x -= i;
		x -= I;
		x -= l;
		x -= L;
		x -= f;
		x -= F;
		x -= D;
		x -= d;

		x *= c;
		x *= C;
		x *= s;
		x *= S;
		x *= by;
		x *= By;
		x *= i;
		x *= I;
		x *= l;
		x *= L;
		x *= f;
		x *= F;
		x *= D;
		x *= d;

		x /= c;
		x /= C;
		x /= s;
		x /= S;
		x /= by;
		x /= By;
		x /= i;
		x /= I;
		x /= l;
		x /= L;
		x /= f;
		x /= F;
		x /= D;
		x /= d;

		x %= c;
		x %= C;
		x %= s;
		x %= S;
		x %= by;
		x %= By;
		x %= i;
		x %= I;
		x %= l;
		x %= L;
		x %= f;
		x %= F;
		x %= D;
		x %= d;


		x &= c;
		x &= C;
		x &= s;
		x &= S;
		x &= by;
		x &= By;
		x &= i;
		x &= I;
		x &= l;
		x &= L;

		x |= c;
		x |= C;
		x |= s;
		x |= S;
		x |= by;
		x |= By;
		x |= i;
		x |= I;
		x |= l;
		x |= L;

		x ^= c;
		x ^= C;
		x ^= s;
		x ^= S;
		x ^= by;
		x ^= By;
		x ^= i;
		x ^= I;
		x ^= l;
		x ^= L;
	}

	public void testByte(Byte x){
		x = by;
		x = By;
	}

	public void testint(int x){
		x = c;
		x = C;
		x = s;
		x = S;
		x = by;
		x = By;
		x = i;
		x = I;

		x += c;
		x += C;
		x += s;
		x += S;
		x += by;
		x += By;
		x += i;
		x += I;
		x += l;
		x += L;
		x += f;
		x += F;
		x += D;
		x += d;

		x -= c;
		x -= C;
		x -= s;
		x -= S;
		x -= by;
		x -= By;
		x -= i;
		x -= I;
		x -= l;
		x -= L;
		x -= f;
		x -= F;
		x -= D;
		x -= d;

		x *= c;
		x *= C;
		x *= s;
		x *= S;
		x *= by;
		x *= By;
		x *= i;
		x *= I;
		x *= l;
		x *= L;
		x *= f;
		x *= F;
		x *= D;
		x *= d;

		x /= c;
		x /= C;
		x /= s;
		x /= S;
		x /= by;
		x /= By;
		x /= i;
		x /= I;
		x /= l;
		x /= L;
		x /= f;
		x /= F;
		x /= D;
		x /= d;

		x %= c;
		x %= C;
		x %= s;
		x %= S;
		x %= by;
		x %= By;
		x %= i;
		x %= I;
		x %= l;
		x %= L;
		x %= f;
		x %= F;
		x %= D;
		x %= d;


		x &= c;
		x &= C;
		x &= s;
		x &= S;
		x &= by;
		x &= By;
		x &= i;
		x &= I;
		x &= l;
		x &= L;

		x |= c;
		x |= C;
		x |= s;
		x |= S;
		x |= by;
		x |= By;
		x |= i;
		x |= I;
		x |= l;
		x |= L;

		x ^= c;
		x ^= C;
		x ^= s;
		x ^= S;
		x ^= by;
		x ^= By;
		x ^= i;
		x ^= I;
		x ^= l;
		x ^= L;
	}

	public void testInteger(Integer x){
		x = i;
		x = I;

		x += c;
		x += C;
		x += s;
		x += S;
		x += by;
		x += By;
		x += i;
		x += I;

		x -= c;
		x -= C;
		x -= s;
		x -= S;
		x -= by;
		x -= By;
		x -= i;
		x -= I;

		x *= c;
		x *= C;
		x *= s;
		x *= S;
		x *= by;
		x *= By;
		x *= i;
		x *= I;

		x /= c;
		x /= C;
		x /= s;
		x /= S;
		x /= by;
		x /= By;
		x /= i;
		x /= I;

		x %= c;
		x %= C;
		x %= s;
		x %= S;
		x %= by;
		x %= By;
		x %= i;
		x %= I;


		x &= c;
		x &= C;
		x &= s;
		x &= S;
		x &= by;
		x &= By;
		x &= i;
		x &= I;

		x |= c;
		x |= C;
		x |= s;
		x |= S;
		x |= by;
		x |= By;
		x |= i;
		x |= I;

		x ^= c;
		x ^= C;
		x ^= s;
		x ^= S;
		x ^= by;
		x ^= By;
		x ^= i;
		x ^= I;
	}

	public void testlong(long x){
		x = c;
		x = C;
		x = s;
		x = S;
		x = by;
		x = By;
		x = i;
		x = I;
		x = l;
		x = L;

		x += c;
		x += C;
		x += s;
		x += S;
		x += by;
		x += By;
		x += i;
		x += I;
		x += l;
		x += L;
		x += f;
		x += F;
		x += D;
		x += d;

		x -= c;
		x -= C;
		x -= s;
		x -= S;
		x -= by;
		x -= By;
		x -= i;
		x -= I;
		x -= l;
		x -= L;
		x -= f;
		x -= F;
		x -= D;
		x -= d;

		x *= c;
		x *= C;
		x *= s;
		x *= S;
		x *= by;
		x *= By;
		x *= i;
		x *= I;
		x *= l;
		x *= L;
		x *= f;
		x *= F;
		x *= D;
		x *= d;

		x /= c;
		x /= C;
		x /= s;
		x /= S;
		x /= by;
		x /= By;
		x /= i;
		x /= I;
		x /= l;
		x /= L;
		x /= f;
		x /= F;
		x /= D;
		x /= d;

		x %= c;
		x %= C;
		x %= s;
		x %= S;
		x %= by;
		x %= By;
		x %= i;
		x %= I;
		x %= l;
		x %= L;
		x %= f;
		x %= F;
		x %= D;
		x %= d;


		x &= c;
		x &= C;
		x &= s;
		x &= S;
		x &= by;
		x &= By;
		x &= i;
		x &= I;
		x &= l;
		x &= L;

		x |= c;
		x |= C;
		x |= s;
		x |= S;
		x |= by;
		x |= By;
		x |= i;
		x |= I;
		x |= l;
		x |= L;

		x ^= c;
		x ^= C;
		x ^= s;
		x ^= S;
		x ^= by;
		x ^= By;
		x ^= i;
		x ^= I;
		x ^= l;
		x ^= L;
	}

	public void testLong(Long x){
		x = l;
		x = L;

		x += c;
		x += C;
		x += s;
		x += S;
		x += by;
		x += By;
		x += i;
		x += I;
		x += l;
		x += L;

		x -= c;
		x -= C;
		x -= s;
		x -= S;
		x -= by;
		x -= By;
		x -= i;
		x -= I;
		x -= l;
		x -= L;

		x *= c;
		x *= C;
		x *= s;
		x *= S;
		x *= by;
		x *= By;
		x *= i;
		x *= I;
		x *= l;
		x *= L;

		x /= c;
		x /= C;
		x /= s;
		x /= S;
		x /= by;
		x /= By;
		x /= i;
		x /= I;
		x /= l;
		x /= L;

		x %= c;
		x %= C;
		x %= s;
		x %= S;
		x %= by;
		x %= By;
		x %= i;
		x %= I;
		x %= l;
		x %= L;


		x &= c;
		x &= C;
		x &= s;
		x &= S;
		x &= by;
		x &= By;
		x &= i;
		x &= I;
		x &= l;
		x &= L;

		x |= c;
		x |= C;
		x |= s;
		x |= S;
		x |= by;
		x |= By;
		x |= i;
		x |= I;
		x |= l;
		x |= L;

		x ^= c;
		x ^= C;
		x ^= s;
		x ^= S;
		x ^= by;
		x ^= By;
		x ^= i;
		x ^= I;
		x ^= l;
		x ^= L;
	}

	public void testfloat(float x){
		x = c;
		x = C;
		x = s;
		x = S;
		x = by;
		x = By;
		x = i;
		x = I;
		x = l;
		x = L;
		x = f;
		x = F;

		x += c;
		x += C;
		x += s;
		x += S;
		x += by;
		x += By;
		x += i;
		x += I;
		x += l;
		x += L;
		x += f;
		x += F;
		x += D;
		x += d;

		x -= c;
		x -= C;
		x -= s;
		x -= S;
		x -= by;
		x -= By;
		x -= i;
		x -= I;
		x -= l;
		x -= L;
		x -= f;
		x -= F;
		x -= D;
		x -= d;

		x *= c;
		x *= C;
		x *= s;
		x *= S;
		x *= by;
		x *= By;
		x *= i;
		x *= I;
		x *= l;
		x *= L;
		x *= f;
		x *= F;
		x *= D;
		x *= d;

		x /= c;
		x /= C;
		x /= s;
		x /= S;
		x /= by;
		x /= By;
		x /= i;
		x /= I;
		x /= l;
		x /= L;
		x /= f;
		x /= F;
		x /= D;
		x /= d;

		x %= c;
		x %= C;
		x %= s;
		x %= S;
		x %= by;
		x %= By;
		x %= i;
		x %= I;
		x %= l;
		x %= L;
		x %= f;
		x %= F;
		x %= D;
		x %= d;
	}

	public void testFloat(Float x){
		x = f;
		x = F;

		x += c;
		x += C;
		x += s;
		x += S;
		x += by;
		x += By;
		x += i;
		x += I;
		x += l;
		x += L;
		x += f;
		x += F;

		x -= c;
		x -= C;
		x -= s;
		x -= S;
		x -= by;
		x -= By;
		x -= i;
		x -= I;
		x -= l;
		x -= L;
		x -= f;
		x -= F;

		x *= c;
		x *= C;
		x *= s;
		x *= S;
		x *= by;
		x *= By;
		x *= i;
		x *= I;
		x *= l;
		x *= L;
		x *= f;
		x *= F;

		x /= c;
		x /= C;
		x /= s;
		x /= S;
		x /= by;
		x /= By;
		x /= i;
		x /= I;
		x /= l;
		x /= L;
		x /= f;
		x /= F;

		x %= c;
		x %= C;
		x %= s;
		x %= S;
		x %= by;
		x %= By;
		x %= i;
		x %= I;
		x %= l;
		x %= L;
		x %= f;
		x %= F;
	}

	public void testdouble(double x){
		x = c;
		x = C;
		x = s;
		x = S;
		x = by;
		x = By;
		x = i;
		x = I;
		x = l;
		x = L;
		x = f;
		x = F;
		x = D;
		x = d;

		x += c;
		x += C;
		x += s;
		x += S;
		x += by;
		x += By;
		x += i;
		x += I;
		x += l;
		x += L;
		x += f;
		x += F;
		x += D;
		x += d;

		x -= c;
		x -= C;
		x -= s;
		x -= S;
		x -= by;
		x -= By;
		x -= i;
		x -= I;
		x -= l;
		x -= L;
		x -= f;
		x -= F;
		x -= D;
		x -= d;

		x *= c;
		x *= C;
		x *= s;
		x *= S;
		x *= by;
		x *= By;
		x *= i;
		x *= I;
		x *= l;
		x *= L;
		x *= f;
		x *= F;
		x *= D;
		x *= d;

		x /= c;
		x /= C;
		x /= s;
		x /= S;
		x /= by;
		x /= By;
		x /= i;
		x /= I;
		x /= l;
		x /= L;
		x /= f;
		x /= F;
		x /= D;
		x /= d;

		x %= c;
		x %= C;
		x %= s;
		x %= S;
		x %= by;
		x %= By;
		x %= i;
		x %= I;
		x %= l;
		x %= L;
		x %= f;
		x %= F;
		x %= D;
		x %= d;
	}

	public void testDouble(Double x){
		x = D;
		x = d;

		x += c;
		x += C;
		x += s;
		x += S;
		x += by;
		x += By;
		x += i;
		x += I;
		x += l;
		x += L;
		x += f;
		x += F;
		x += D;
		x += d;

		x -= c;
		x -= C;
		x -= s;
		x -= S;
		x -= by;
		x -= By;
		x -= i;
		x -= I;
		x -= l;
		x -= L;
		x -= f;
		x -= F;
		x -= D;
		x -= d;

		x *= c;
		x *= C;
		x *= s;
		x *= S;
		x *= by;
		x *= By;
		x *= i;
		x *= I;
		x *= l;
		x *= L;
		x *= f;
		x *= F;
		x *= D;
		x *= d;

		x /= c;
		x /= C;
		x /= s;
		x /= S;
		x /= by;
		x /= By;
		x /= i;
		x /= I;
		x /= l;
		x /= L;
		x /= f;
		x /= F;
		x /= D;
		x /= d;

		x %= c;
		x %= C;
		x %= s;
		x %= S;
		x %= by;
		x %= By;
		x %= i;
		x %= I;
		x %= l;
		x %= L;
		x %= f;
		x %= F;
		x %= D;
		x %= d;
	}
}
