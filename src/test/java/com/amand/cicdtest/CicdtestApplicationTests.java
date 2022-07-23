package com.amand.cicdtest;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CicdtestApplicationTests {

	@Test
	void contextLoads() {
		Assertions.assertThat(2).isEqualTo(2);
	}

	@Test
	void contextLoads2() {
		int actual = 3;
		Assertions.assertThat(actual).isEqualTo(3);
	}
}
