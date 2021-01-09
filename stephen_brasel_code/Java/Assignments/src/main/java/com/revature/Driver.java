package com.revature;

import com.revature.util.Mouse;
import com.revature.util.Timer;
import com.revature.util.operators.VoidOperator;

import java.awt.*;
import java.util.Arrays;
import java.util.Random;

class A{
	public void method(int methodScope){
		int methodScope2 = 0;
		for (int loopScopeApparently = 0; loopScopeApparently < 1; loopScopeApparently++) {
			int loopScopeasWellButAlsoBlockScope = 0;
			instanceScope = 2;
			{
				int blockScope;
				System.out.println("hi!");
			}
		}
	}
	static int classScope = 0;
	int instanceScope = 0;
	{
		// cannot use static, private, protected, public, volatile, or transient
		// can only use final keyword
		final int blockScope1;
		int blockScope2;
	}

	static{
		// cannot use static, private, protected, public, volatile, or transient
		// can only use final keyword
		final int blockyScopey;
		int blockyScopey2;
	}
}

public class Driver {//	private int Señor = 0;
	private int Señor = 0;
	private static int $this = -8;
	private static int _this = 0;
	private Integer x = new Integer(Integer.MAX_VALUE);
	static int count = 0;

	public static void main(String[] args) {
		String val = args.length > 0 ? args[0] : "null";
		switch(val){
			default:
			case "mousetrap":
				Mouse tim = new Mouse("Tim", Color.DARK_GRAY);
				Object o = new Object();
				mousetrap(tim);
				mousetrap(o);
				o = tim;
				mousetrap(o);
				if(!val.equals("null")) break;
			case "shortCircuitZeroMult":
				System.out.println(0*(giveIncrement()));
				count--;
				if(!val.equals("null")) break;
			case "rhombus":
				rhombus(args.length > 1 ? Integer.parseInt(args[1]) : 7, 1);
				if(!val.equals("null")) break;
			case "rightTriangle":
				int rtn = args.length > 1 ? Integer.parseInt(args[1]) : 10;
				rightTriangle(rtn, "SW");
				rightTriangle(rtn, "NW");
				rightTriangle(rtn, "SE");
				rightTriangle(rtn, "NE");
				if(!val.equals("null")) break;
			case "-+": case "negPos": case "negativePositive":
				negativePositive();
				if(!val.equals("null")) break;
			case "scope": case "A":
				A thing = new A();
				thing.method(0);
				if(!val.equals("null")) break;
			case "num":
				int aNumber = args.length > 1 ? Integer.parseInt(args[1]) : 0;
				if (aNumber >= 0) {
					if (aNumber == 0) {
						System.out.println("first string");
					}
				}
				else {
					System.out.println("second string");
				}
				System.out.println("third string");
				if(!val.equals("null")) break;
			case "timedCheck":
				TimedCheck();
				if(!val.equals("null")) break;
			case "randomBoard":
				randomizeBoard();
				if(!val.equals("null")) break;
			case "loopTest":
				testLoopingConditionals();
				if(!val.equals("null")) break;
			case "recur":
				recurse(0, 4);
				if(!val.equals("null")) break;
		}
	}

	public static void mousetrap(Object o){
		if(o instanceof Mouse) System.out.println("We caught a mouse!");
		else System.out.println("We did not catch a mouse.");
	}

	public static void rhombus(int n, int x){
		for (int i = 0; i < n-x; i++) {
			System.out.print(" ");
		}
		palinNumber(x);
		System.out.println();
		if(x == n) return;
		rhombus(n,x+1);
		for (int i = 0; i < n-x; i++) {
			System.out.print(" ");
		}
		palinNumber(x);
		System.out.println();
	}

	public static void palinNumber(int n){
		System.out.print(n);
		if(n == 1) return;
		palinNumber(n-1);
		System.out.print(n);
	}

	public static void rightTriangle(int n, String type){
		for (int i = 1; i <= n; i++) {
			switch (type){
				default:
				case "NW":
					rightTriangleNW(n, i);
					break;
				case "NE":
					rightTriangleNE(n, i);
					break;
				case "SW":
					rightTriangleSW(n, i);
					break;
				case "SE":
					rightTriangleSE(n, i);
					break;
			}
			System.out.println();
		}
	}

	public static void rightTriangleNE(int n, int i){
		for (int j = 1; j <= i; j++) {
			System.out.print(j);
		}
	}

	public static void rightTriangleNW(int n, int i){
		for (int j = 0; j < n-i; j++) {
			System.out.print(" ");
		}
		for (int j = i; j >= 1; j--) {
			System.out.print(j);
		}
	}

	public static void rightTriangleSW(int n, int i){
		for (int j = 0; j < i-1; j++) {
			System.out.print(" ");
		}
		for (int j = n-i+1; j >= 1; j--) {
			System.out.print(j);
		}
	}

	public static void rightTriangleSE(int n, int i){
		for (int j = n-i+1; j >= 1; j--) {
			System.out.print(j);
		}
	}

	public static void negativePositive() {
		System.out.println($this++ + " " + _this++);
		System.out.println(-$this + " " + +$this);
		int res = ((Integer.MIN_VALUE + 1147483648));
		System.out.println(-res);
		res = +res;
		System.out.println(res);
	}

	private static void TimedCheck() {
		count = 100;
		Timer.printTime((VoidOperator)Driver::ifElseCheck);
		Timer.printTime((VoidOperator)Driver::switchCheck);
	}

	private static void randomizeBoard() {
		int heads = 1, tails = 0;
		Random random = new Random();
		int[][] board = new int[8][8];
		for (int i = 0; i < board.length; i++) {
			board[i] = new int[8];
			for (int j = 0; j < board[i].length; j++) {
				board[i][j] = ((random.nextInt() & 1) == 0) ? heads : tails;
			}
			System.out.println(Arrays.toString(board[i]));
		}
	}

	private static void testLoopingConditionals() {
		int i = 0;
		int k = 2;
		int[] ar = new int[10];
		int increment = ar.length + k - giveIncrement();
		for (System.out.println("hi!"); i+giveIncrement() < ar.length; i+=giveIncrement()) {

		}
		i = 0;
		while(i+giveIncrement() < ar.length){
			System.out.println(i+=giveIncrement());
		}
		i = 0;
		do{

		}while((i+=giveIncrement()) < ar.length);
	}

	public static int giveIncrement(){
		System.out.println("in giveIncrement: " + count++);
		return 1;
	}

	private static void recurse(int depth, int maxDepth){
		if(depth < maxDepth){
			for(int i = 0; i < depth; i++){
				System.out.print("    ");
			}
			System.out.println("starting at depth " + depth);
			for(int i = 0; i < 2; i++){
				recurse(depth + giveIncrement(), maxDepth);
			}
			for(int i = 0; i < depth; i++){
				System.out.print("    ");
			}
			System.out.println("ending at depth " + depth);
		}
	}

	public static void switchCheck(Object... args) {
		switch (count){
			case 1:
				System.out.println(count);
				break;
			case 2:
				System.out.println(count);
				break;
			case 3:
				System.out.println(count);
				break;
			case 4:
				System.out.println(count);
				break;
			case 5:
				System.out.println(count);
				break;
			case 6:
				System.out.println(count);
				break;
			case 7:
				System.out.println(count);
				break;
			case 8:
				System.out.println(count);
				break;
			case 9:
				System.out.println(count);
				break;
			case 10:
				System.out.println(count);
				break;
			case 11:
				System.out.println(count);
				break;
			case 12:
				System.out.println(count);
				break;
			case 13:
				System.out.println(count);
				break;
			case 14:
				System.out.println(count);
				break;
			case 15:
				System.out.println(count);
				break;
			case 16:
				System.out.println(count);
				break;
			case 17:
				System.out.println(count);
				break;
			case 18:
				System.out.println(count);
				break;
			case 19:
				System.out.println(count);
				break;
			case 20:
				System.out.println(count);
				break;
			case 21:
				System.out.println(count);
				break;
			case 22:
				System.out.println(count);
				break;
			case 23:
				System.out.println(count);
				break;
			case 24:
				System.out.println(count);
				break;
			case 25:
				System.out.println(count);
				break;
			case 26:
				System.out.println(count);
				break;
			case 27:
				System.out.println(count);
				break;
			case 28:
				System.out.println(count);
				break;
			case 29:
				System.out.println(count);
				break;
			case 30:
				System.out.println(count);
				break;
			case 31:
				System.out.println(count);
				break;
			case 32:
				System.out.println(count);
				break;
			case 33:
				System.out.println(count);
				break;
			case 34:
				System.out.println(count);
				break;
			case 35:
				System.out.println(count);
				break;
			case 36:
				System.out.println(count);
				break;
			case 37:
				System.out.println(count);
				break;
			case 38:
				System.out.println(count);
				break;
			case 39:
				System.out.println(count);
				break;
			case 40:
				System.out.println(count);
				break;
			case 41:
				System.out.println(count);
				break;
			case 42:
				System.out.println(count);
				break;
			case 43:
				System.out.println(count);
				break;
			case 44:
				System.out.println(count);
				break;
			case 45:
				System.out.println(count);
				break;
			case 46:
				System.out.println(count);
				break;
			case 47:
				System.out.println(count);
				break;
			case 48:
				System.out.println(count);
				break;
			case 49:
				System.out.println(count);
				break;
			case 50:
				System.out.println(count);
				break;
			case 51:
				System.out.println(count);
				break;
			case 52:
				System.out.println(count);
				break;
			case 53:
				System.out.println(count);
				break;
			case 54:
				System.out.println(count);
				break;
			case 55:
				System.out.println(count);
				break;
			case 56:
				System.out.println(count);
				break;
			case 57:
				System.out.println(count);
				break;
			case 58:
				System.out.println(count);
				break;
			case 59:
				System.out.println(count);
				break;
			case 60:
				System.out.println(count);
				break;
			case 61:
				System.out.println(count);
				break;
			case 62:
				System.out.println(count);
				break;
			case 63:
				System.out.println(count);
				break;
			case 64:
				System.out.println(count);
				break;
			case 65:
				System.out.println(count);
				break;
			case 66:
				System.out.println(count);
				break;
			case 67:
				System.out.println(count);
				break;
			case 68:
				System.out.println(count);
				break;
			case 69:
				System.out.println(count);
				break;
			case 70:
				System.out.println(count);
				break;
			case 71:
				System.out.println(count);
				break;
			case 72:
				System.out.println(count);
				break;
			case 73:
				System.out.println(count);
				break;
			case 74:
				System.out.println(count);
				break;
			case 75:
				System.out.println(count);
				break;
			case 76:
				System.out.println(count);
				break;
			case 77:
				System.out.println(count);
				break;
			case 78:
				System.out.println(count);
				break;
			case 79:
				System.out.println(count);
				break;
			case 80:
				System.out.println(count);
				break;
			case 81:
				System.out.println(count);
				break;
			case 82:
				System.out.println(count);
				break;
			case 83:
				System.out.println(count);
				break;
			case 84:
				System.out.println(count);
				break;
			case 85:
				System.out.println(count);
				break;
			case 86:
				System.out.println(count);
				break;
			case 87:
				System.out.println(count);
				break;
			case 88:
				System.out.println(count);
				break;
			case 89:
				System.out.println(count);
				break;
			case 90:
				System.out.println(count);
				break;
			case 91:
				System.out.println(count);
				break;
			case 92:
				System.out.println(count);
				break;
			case 93:
				System.out.println(count);
				break;
			case 94:
				System.out.println(count);
				break;
			case 95:
				System.out.println(count);
				break;
			case 96:
				System.out.println(count);
				break;
			case 97:
				System.out.println(count);
				break;
			case 98:
				System.out.println(count);
				break;
			case 99:
				System.out.println(count);
				break;
			case 100:
				System.out.println(count);
				break;
		}
	}

	private static void ifElseCheck(Object... args) {
//		for (int i = 1; i < 100; i++) {
//			if(count == i){
//				System.out.println(count);
//			}
//		}
		if(count == 1){
			System.out.println(count);
		} else if(count == 2){
			System.out.println(count);
		} else if(count == 3){
			System.out.println(count);
		} else if(count == 4){
			System.out.println(count);
		} else if(count == 5){
			System.out.println(count);
		} else if(count == 6){
			System.out.println(count);
		} else if(count == 7){
			System.out.println(count);
		} else if(count == 8){
			System.out.println(count);
		} else if(count == 9){
			System.out.println(count);
		} else if(count == 10){
			System.out.println(count);
		} else if(count == 11){
			System.out.println(count);
		} else if(count == 12){
			System.out.println(count);
		} else if(count == 13){
			System.out.println(count);
		} else if(count == 14){
			System.out.println(count);
		} else if(count == 15){
			System.out.println(count);
		} else if(count == 16){
			System.out.println(count);
		} else if(count == 17){
			System.out.println(count);
		} else if(count == 18){
			System.out.println(count);
		} else if(count == 19){
			System.out.println(count);
		} else if(count == 20){
			System.out.println(count);
		} else if(count == 21){
			System.out.println(count);
		} else if(count == 22){
			System.out.println(count);
		} else if(count == 23){
			System.out.println(count);
		} else if(count == 24){
			System.out.println(count);
		} else if(count == 25){
			System.out.println(count);
		} else if(count == 26){
			System.out.println(count);
		} else if(count == 27){
			System.out.println(count);
		} else if(count == 28){
			System.out.println(count);
		} else if(count == 29){
			System.out.println(count);
		} else if(count == 30){
			System.out.println(count);
		} else if(count == 31){
			System.out.println(count);
		} else if(count == 32){
			System.out.println(count);
		} else if(count == 33){
			System.out.println(count);
		} else if(count == 34){
			System.out.println(count);
		} else if(count == 35){
			System.out.println(count);
		} else if(count == 36){
			System.out.println(count);
		} else if(count == 37){
			System.out.println(count);
		} else if(count == 38){
			System.out.println(count);
		} else if(count == 39){
			System.out.println(count);
		} else if(count == 40){
			System.out.println(count);
		} else if(count == 41){
			System.out.println(count);
		} else if(count == 42){
			System.out.println(count);
		} else if(count == 43){
			System.out.println(count);
		} else if(count == 44){
			System.out.println(count);
		} else if(count == 45){
			System.out.println(count);
		} else if(count == 46){
			System.out.println(count);
		} else if(count == 47){
			System.out.println(count);
		} else if(count == 48){
			System.out.println(count);
		} else if(count == 49){
			System.out.println(count);
		} else if(count == 50){
			System.out.println(count);
		} else if(count == 51){
			System.out.println(count);
		} else if(count == 52){
			System.out.println(count);
		} else if(count == 53){
			System.out.println(count);
		} else if(count == 54){
			System.out.println(count);
		} else if(count == 55){
			System.out.println(count);
		} else if(count == 56){
			System.out.println(count);
		} else if(count == 57){
			System.out.println(count);
		} else if(count == 58){
			System.out.println(count);
		} else if(count == 59){
			System.out.println(count);
		} else if(count == 60){
			System.out.println(count);
		} else if(count == 61){
			System.out.println(count);
		} else if(count == 62){
			System.out.println(count);
		} else if(count == 63){
			System.out.println(count);
		} else if(count == 64){
			System.out.println(count);
		} else if(count == 65){
			System.out.println(count);
		} else if(count == 66){
			System.out.println(count);
		} else if(count == 67){
			System.out.println(count);
		} else if(count == 68){
			System.out.println(count);
		} else if(count == 69){
			System.out.println(count);
		} else if(count == 70){
			System.out.println(count);
		} else if(count == 71){
			System.out.println(count);
		} else if(count == 72){
			System.out.println(count);
		} else if(count == 73){
			System.out.println(count);
		} else if(count == 74){
			System.out.println(count);
		} else if(count == 75){
			System.out.println(count);
		} else if(count == 76){
			System.out.println(count);
		} else if(count == 77){
			System.out.println(count);
		} else if(count == 78){
			System.out.println(count);
		} else if(count == 79){
			System.out.println(count);
		} else if(count == 80){
			System.out.println(count);
		} else if(count == 81){
			System.out.println(count);
		} else if(count == 82){
			System.out.println(count);
		} else if(count == 83){
			System.out.println(count);
		} else if(count == 84){
			System.out.println(count);
		} else if(count == 85){
			System.out.println(count);
		} else if(count == 86){
			System.out.println(count);
		} else if(count == 87){
			System.out.println(count);
		} else if(count == 88){
			System.out.println(count);
		} else if(count == 89){
			System.out.println(count);
		} else if(count == 90){
			System.out.println(count);
		} else if(count == 91){
			System.out.println(count);
		} else if(count == 92){
			System.out.println(count);
		} else if(count == 93){
			System.out.println(count);
		} else if(count == 94){
			System.out.println(count);
		} else if(count == 95){
			System.out.println(count);
		} else if(count == 96){
			System.out.println(count);
		} else if(count == 97){
			System.out.println(count);
		} else if(count == 98){
			System.out.println(count);
		} else if(count == 99){
			System.out.println(count);
		} else if(count == 100){
			System.out.println(count);
		}
	}

}
