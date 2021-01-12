package com.example.demo.di;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@SpringBootTest
@ExtendWith(SpringExtension.class)
public class AddCalcTest {
	@Autowired
	Calculator calculator;
	@Test
	void addTest() {
		//AddCalc addCalc = new AddCalc();
		Integer result = calculator.calc(10, 20);
		assertEquals(30, result); // テスト評価
	}
}
