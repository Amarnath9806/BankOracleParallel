package com.cg.BankAppOracleParallel.dao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.cg.BankAppOracleParallel.model.CustomerDetails;

class UserEntryDaoImplTest {
	static UserEntryDaoImpl user;
	static CustomerDetails cd;
	@BeforeAll
	public static void init()
	{
		user = new UserEntryDaoImpl();
		cd = new CustomerDetails();
	}
	@Test
	void testRegister() {
		cd.setAccountNo(0);
		cd.setFirstName("amar");
		cd.setLastName("nath");
		cd.setEmailId("amar@");
		cd.setPassword("amar");
		cd.setPancardNo(1234345);
		cd.setAadharNo("123236789876");
		cd.setAddress("hyd");
		cd.setMobileNo("7842289657");
		cd.setBalance(0);
		int id = user.register(cd);
		assertEquals(136, id);
	}

	@Test
	void testLogin() {
		cd = user.login(127, "amar");
		assertEquals(127, cd.getAccountNo());
	}

}
