package com.aq.pilot;

import java.util.Random;

import org.junit.Test;

public class AppTest {
	
	@Test
	public void doTest() {
		Random random = new Random();
		int i = random.nextInt(100);
		if(i%4 == 0) {
			throw new RuntimeException("test fails i="+i);
		}
	}
	
}
