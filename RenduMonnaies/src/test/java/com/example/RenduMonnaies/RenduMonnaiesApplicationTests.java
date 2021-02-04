package com.example.RenduMonnaies;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RenduMonnaiesApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void changeSolution1(){
		Change ch = ChangeSolution.optimalChange(11);
		System.out.println(ch.toString());
		Assertions.assertEquals(ch.getBillet5(),1);
		Assertions.assertEquals(ch.getBillet10(),0);
		Assertions.assertEquals(ch.getPiece2(),3);

	}

	@Test
	void changeSolution2(){
		Change ch = ChangeSolution.optimalChange(41);
		System.out.println(ch.toString());
		Assertions.assertEquals(ch.getBillet5(),1);
		Assertions.assertEquals(ch.getBillet10(),3);
		Assertions.assertEquals(ch.getPiece2(),3);

	}

	@Test
	void changeSolution3(){
		Change ch = ChangeSolution.optimalChange(5);
		System.out.println(ch.toString());
		Assertions.assertEquals(ch.getBillet5(),1);
		Assertions.assertEquals(ch.getBillet10(),0);
		Assertions.assertEquals(ch.getPiece2(),0);

	}

	@Test
	void changeSolution4(){
		Change ch = ChangeSolution.optimalChange(16);
		System.out.println(ch.toString());
		Assertions.assertEquals(ch.getBillet5(),0);
		Assertions.assertEquals(ch.getBillet10(),1);
		Assertions.assertEquals(ch.getPiece2(),3);

	}

	@Test
	void changeSolution5(){
		Change ch = ChangeSolution.optimalChange(3);
		System.out.println(ch.toString());
		Assertions.assertEquals(ch.getBillet5(),0);
		Assertions.assertEquals(ch.getBillet10(),0);
		Assertions.assertEquals(ch.getPiece2(),0);

	}

}
