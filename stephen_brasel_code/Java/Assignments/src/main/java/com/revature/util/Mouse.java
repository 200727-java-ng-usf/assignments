package com.revature.util;

import java.awt.*;
import java.util.Objects;

public class Mouse {
	private String name;
	private Color furColor;

	public Mouse() {
	}

	public Mouse(String name, Color furColor) {

		this.name = name;
		this.furColor = furColor;
	}

	public String getName() {

		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Color getFurColor() {
		return furColor;
	}

	public void setFurColor(Color furColor) {
		this.furColor = furColor;
	}

	public static void main(String[] args) {
		Mouse m = new Mouse();
		System.out.println(m.name);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Mouse mouse = (Mouse) o;
		return Objects.equals(name, mouse.name) && Objects.equals(furColor, mouse.furColor);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, furColor);
	}

	@Override
	public String toString() {
		return "Mouse{" +
				"name='" + name + '\'' +
				", furColor=" + furColor +
				'}';
	}
}
