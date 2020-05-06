package com.example.demo;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest

public class ShainServiceImplTest {

	@MockBean
	private ShainRepository shainRepository;

	@Test
	public void findByNoTest() throws Exception{
		//shainRepositoryをモックにして、findbyNoが機能するかをテスト
		when(shainRepository.serchByNo("100")).thenReturn("sato");
		ShainService shainService = new ShainServiceImpl();
		String emp = shainService.findByNo("100");
		assertThat(emp, is("sato"));
	}
}
