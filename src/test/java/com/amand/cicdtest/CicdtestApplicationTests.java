package com.amand.cicdtest;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CicdtestApplicationTests {

	@Test
	void contextLoads() {
		int actual = 2;
		Assertions.assertThat(actual).isEqualTo(2);
	}

}
