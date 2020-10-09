
package com.collateral.loans.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class UserLoginCredentialTest {

	UserLoginCredential auth = new UserLoginCredential();
	UserLoginCredential auth1 = new UserLoginCredential("ad", "ad");

	@Test
	void testUid() {
		auth.setUid("Uid");
		assertEquals(auth.getUid(), "Uid");
	}

	@Test
	void testPassword() {
		auth.setPassword("Name");
		assertEquals(auth.getPassword(), "Name");
	}
	
	@Test
	void testoString() {
		String string = auth1.toString();
		assertEquals(string,auth1.toString());
	}

}
