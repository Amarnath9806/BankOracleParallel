package com.cg.BankAppOracleParallel.dao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class TransactionDaoImplTest {
	static TransactionDaoImpl td;
	@BeforeAll
	public static void init() {
		td = new TransactionDaoImpl();
	}
	@Test
	void testWithdraw() {
		assertEquals(1700, td.withdraw(132, 300, 2000));
	}

	@Test
	void testDeposit() {
		assertEquals(600, td.deposit(130, 300, 300));
	}

	@Test
	void testShowBalance() {
		assertEquals(10, td.showBalance(131));
	}

	@Test
	void testFundTransfer() {
		assertEquals(600, td.fundTransfer(127, 128, 100));
	}

}
