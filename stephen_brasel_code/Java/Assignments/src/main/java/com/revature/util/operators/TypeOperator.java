package com.revature.util.operators;

public interface TypeOperator<T> extends Operator{
	T execute(T... o);
}
