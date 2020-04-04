package com.learn.testcases;

import com.learn.junit.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

class Test1 {
	
	@BeforeAll
	static void initilize()
	{
		Implementation obj=new Implementation();
		obj.setDiscount(30);
	}

	@Test
	void test1() {
		assertEquals(70, Implementation.FindPayable(100));
	}

	@Test
	void test2() {
		assertEquals(70, Implementation.FindPayable(200));
	}
}
