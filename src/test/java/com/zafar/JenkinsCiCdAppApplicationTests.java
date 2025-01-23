package com.zafar;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
@WebMvcTest
class JenkinsCiCdAppApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void testGreetingEndpoint() throws Exception {
		String name = "zafar";
		mockMvc.perform(MockMvcRequestBuilders.get("/greet/{name}", name))
				.andExpect(MockMvcResultMatchers.status().isOk())
				.andExpect(MockMvcResultMatchers.content().string( "Hello" + name + "How are you?"));

	}

	@Test
	void contextLoads() {
	}

}
