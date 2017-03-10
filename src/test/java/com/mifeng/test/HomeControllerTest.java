package com.mifeng.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;

public class HomeControllerTest {
	
	MockMvc mockMvc;
	@Before
	public void setupMock(){
		HomeController controller = new HomeController();
		mockMvc = standaloneSetup(controller).build();
	}

	@Test
	public void test() throws Exception {
		//fail("Not yet implemented");
		mockMvc.perform(get("/")).andExpect(view().name("home"));
	}

}
