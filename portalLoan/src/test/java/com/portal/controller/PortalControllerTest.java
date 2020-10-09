package com.portal.controller;

import static org.junit.jupiter.api.Assertions.fail;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import com.google.gson.Gson;
import com.portal.pojo.UserLoginCredential;

class PortalControllerTest {

	@Autowired
	PortalController portalController;

	@Autowired
	MockMvc mvc;

	@Test
	void testRedirectLogin() throws Exception {
		fail("Not yet implemented");
	}

	@Test
	void testPostLogin() throws Exception {
		UserLoginCredential user = new UserLoginCredential("admin", "admin");
		Gson g = new Gson();
		String s = g.toJson(user);
		mvc.perform(post("/postloan").contentType(MediaType.APPLICATION_JSON).param("user", s)).andExpect(status().isOk());
	}

	@Test
	void testPostLoginFailed() {
		/*
		 * UserLoginCredential user = new UserLoginCredential("admin","admin");
		 * when(authClient.login(user)).thenReturn(null); ModelAndView postLogin =
		 * portalController.postLogin(user, request);
		 * assertEquals(postLogin.getViewName(), "login");
		 */
	}

	@Test
	void testViewAllBranch() {
		fail("Not yet implemented");
	}

	@Test
	void testGetLoanPage() {
		fail("Not yet implemented");
	}

	@Test
	void testPostLoanPage() {
		fail("Not yet implemented");
	}

	@Test
	void testGetRiskPage() {
		fail("Not yet implemented");
	}

	@Test
	void testPostRiskPage() {
		fail("Not yet implemented");
	}

	@Test
	void testGetRealEstatePage() {
		fail("Not yet implemented");
	}

	@Test
	void testPostRealEstatePage() {
		fail("Not yet implemented");
	}

	@Test
	void testGetDepositePage() {
		fail("Not yet implemented");
	}

	@Test
	void testPostDepositePage() {
		fail("Not yet implemented");
	}

	@Test
	void testLogout() {
		fail("Not yet implemented");
	}

}
