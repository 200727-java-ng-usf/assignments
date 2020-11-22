package com.revature.questions;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class T36StockMaxTradeTest {
	Q36StockMaxTrade sut;

	@Before
	public void setUp() throws Exception {
		sut = new Q36StockMaxTrade();
	}

	@After
	public void tearDown() throws Exception {
		sut = null;
	}

	@Test
	public void tradeStockNotNull() {
		assertNotNull(sut);
	}

	@Test
	public void tradeStockNull() {
		assertEquals(0, sut.tradeStock(null));
	}

	@Test
	public void tradeStockEmpty() {
		assertEquals(0, sut.tradeStock(new int[]{}));
	}

	@Test
	public void tradeStock0() {
		assertEquals(0, sut.tradeStock(new int[]{0}));
	}

	@Test
	public void tradeStockNoGoodTrade0() {
		assertEquals(0, sut.tradeStock(new int[]{10, 9, 8, 7, 5, 4, 3, 2, 1, 0}));
	}

	@Test
	public void tradeStockAllGoodTrade0() {
		assertEquals(10, sut.tradeStock(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
	}

	@Test
	public void tradeStockOneGoodTrade0() {
		assertEquals(1, sut.tradeStock(new int[]{10, 9, 7, 8, 6, 5, 2, 1, 0}));
	}

	@Test
	public void tradeStockTwoGoodTrade() {
		assertEquals(1, sut.tradeStock(new int[]{10, 9, 7, 8, 6, 5, 4, 2, 3, 1, 0}));
	}

	@Test
	public void tradeStockGreatTrade() {
		assertEquals(9, sut.tradeStock(new int[]{1, 7, 8, 6, 5, 4, 3, 2, 10, 0}));
	}

	@Test
	public void tradeStockGivenExample() {
		assertEquals(5, sut.tradeStock(new int[]{9, 11, 8, 5, 7, 10}));
	}

	@Test
	public void tradeStockGoodGreatTrade() {
		assertEquals(9, sut.tradeStock(new int[]{1, 9, 7, 8, 6, 4, 1, 2, 3, 10}));
	}

	@Test
	public void tradeStockOptimizingNull() {
		assertEquals(0, sut.tradeStockOld(null));
	}

	@Test
	public void tradeStockOptimizingEmpty() {
		assertEquals(0, sut.tradeStockOld(new int[]{}));
	}

	@Test
	public void tradeStockOptimizing0() {
		assertEquals(0, sut.tradeStockOld(new int[]{0}));
	}

	@Test
	public void tradeStockOptimizingNoGoodTrade0() {
		assertEquals(0, sut.tradeStockOld(new int[]{10, 9, 8, 7, 5, 4, 3, 2, 1, 0}));
	}

	@Test
	public void tradeStockOptimizingAllGoodTrade0() {
		assertEquals(10, sut.tradeStockOld(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
	}

	@Test
	public void tradeStockOptimizingOneGoodTrade0() {
		assertEquals(1, sut.tradeStockOld(new int[]{10, 9, 7, 8, 6, 5, 2, 1, 0}));
	}

	@Test
	public void tradeStockOptimizingTwoGoodTrade() {
		assertEquals(1, sut.tradeStockOld(new int[]{10, 9, 7, 8, 6, 5, 4, 2, 3, 1, 0}));
	}

	@Test
	public void tradeStockOptimizingGreatTrade() {
		assertEquals(9, sut.tradeStockOld(new int[]{1, 7, 8, 6, 5, 4, 3, 2, 10, 0}));
	}

	@Test
	public void tradeStockOptimizingGoodGreatTrade() {
		assertEquals(9, sut.tradeStockOld(new int[]{1, 9, 7, 8, 6, 4, 1, 2, 3, 10}));
	}

	@Test
	public void tradeStockOptimizingGivenExample() {
		assertEquals(5, sut.tradeStockOld(new int[]{9, 11, 8, 5, 7, 10}));
	}

	@Test
	public void tradeStocksNull() {
		assertEquals(0, sut.tradeStocks(null));
	}

	@Test
	public void tradeStocksEmpty() {
		assertEquals(0, sut.tradeStocks(new int[]{}));
	}

	@Test
	public void tradeStocks0() {
		assertEquals(0, sut.tradeStocks(new int[]{0}));
	}

	@Test
	public void tradeStocksNoGoodTrade0() {
		assertEquals(0, sut.tradeStocks(new int[]{10, 9, 8, 7, 5, 4, 3, 2, 1, 0}));
	}

	@Test
	public void tradeStocksAllGoodTrade0() {
		assertEquals(10, sut.tradeStocks(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
	}

	@Test
	public void tradeStocksOneGoodTrade0() {
		assertEquals(1, sut.tradeStocks(new int[]{10, 9, 7, 8, 6, 5, 2, 1, 0}));
	}

	@Test
	public void tradeStocksTwoGoodTrade() {
		assertEquals(2, sut.tradeStocks(new int[]{10, 9, 7, 8, 6, 5, 4, 2, 3, 1, 0}));
	}

	@Test
	public void tradeStocksGreatTrade() {
		assertEquals(15, sut.tradeStocks(new int[]{1, 7, 8, 6, 5, 4, 3, 2, 10, 0}));
	}

	@Test
	public void tradeStocksGivenExample() {
		assertEquals(7, sut.tradeStocks(new int[]{9, 11, 8, 5, 7, 10}));
	}

	@Test
	public void tradeStocksGivenExampleG4G() {
		assertEquals(865, sut.tradeStocks(new int[]{100, 180, 260, 310, 40, 535, 695}));
	}

	@Test
	public void tradeStocksGivenExampleG4G2() {
		assertEquals(7, sut.tradeStocks(new int[]{7, 1, 5, 3, 6, 4}));
	}

	@Test
	public void tradeStocksGoodGreatTrade() {
		assertEquals(18, sut.tradeStocks(new int[]{1, 9, 7, 8, 6, 4, 1, 2, 3, 10}));
	}
}