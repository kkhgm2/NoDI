package com.example.demo;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class ModelTest {

	private MockMvc mockMvc;

	//テストしたい対象を記載
	@Autowired
	ShainController target;

	@Before
	public void setUp() {
		mockMvc = MockMvcBuilders.standaloneSetup(target).build();
	}

	@MockBean
	private ShainService shainService;

	@Test
	public void isModelTest() throws Exception{
		//modelにセットされているかをテスト
		when(shainService.findByNo("100")).thenReturn("sato");
		mockMvc.perform(post("/output?number=100"))
		.andExpect(model().attribute("name", "sato"));
	}
}
