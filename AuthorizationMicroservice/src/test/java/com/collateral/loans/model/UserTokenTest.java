
package com.collateral.loans.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class UserTokenTest {

	UserToken auth = new UserToken();
	UserToken auth1 = new UserToken("ad", "ad");

	@Test
	void testUid() {
		auth.setUid("Uid");
		assertEquals(auth.getUid(), "Uid");
	}

	@Test
	void testName() {
		auth.setAuthToken("Name");
		assertEquals(auth.getAuthToken(), "Name");
	}

	@Test
	void testoString() {
		String string = auth1.toString();
		assertEquals(string,auth1.toString());
	}
}
