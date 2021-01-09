package com.revature.questions;

public class Q55RectInCircle {
	public boolean rectangleInCircle(int w, int h, int r){
		return 4*r*r >= w*w+h*h;
	}
}
