package com.example.train;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class TrainApplicationTests {

	@Test
	void contextLoads() {
		int x = 2;
		assertEquals(4, x * 2);
	}

}



