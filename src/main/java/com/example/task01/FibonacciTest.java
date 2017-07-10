package com.example.task01;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class FibonacciTest {

	@Test
	public void shouldReturnEightForSix() {
		Fibonacci fib = new Fibonacci();
		int test = fib.fibonacci(6);
		Assert.assertEquals(8, test);
	}
	
	@Test
	public void shouldReturnZeroForZero() {
		Fibonacci fib = new Fibonacci();
		int test = fib.fibonacci(0);
		Assert.assertEquals(0, test);
	}

	@Test
	public void shouldReturnOneForOne() {
		Fibonacci fib = new Fibonacci();
		int test = fib.fibonacci(1);
		Assert.assertEquals(1, test);
	}
	
	@Test
	public void shouldReturnOneForTwo() {
		Fibonacci fib = new Fibonacci();
		int test = fib.fibonacci(2);
		Assert.assertEquals(1, test);
	}
	
	@Test
	public void shouldReturnTwoForThree() {
		Fibonacci fib = new Fibonacci();
		int test = fib.fibonacci(3);
		Assert.assertEquals(2, test);
	}
	
	@Test
	public void shouldReturnThirtyFourForNine() {
		Fibonacci fib = new Fibonacci();
		int test = fib.fibonacci(9);
		Assert.assertEquals(34, test);
	}
}
