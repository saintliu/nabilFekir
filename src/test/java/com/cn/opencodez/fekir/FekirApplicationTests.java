package com.cn.opencodez.fekir;

import com.cn.opencodez.fekir.service.impl.FizzBuzzGamePrinciple;
import com.cn.opencodez.fekir.services.GamePrinciple;
import com.cn.opencodez.fekir.utils.GameUtil;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = FekirApplication.class)
public class FekirApplicationTests {

	public List<Integer> listOfNum;

	@Autowired
	GamePrinciple fizzBuzzGamePrinciple;

	@Autowired
	GamePrinciple fizzThreeGamePrinciple;

	@Autowired
	GamePrinciple buzzFiveGamePrinciple;

	@Before
	public void generateNumbers(){

		listOfNum = new ArrayList<>();
		for(int i=1; i<=100; i++) {
			listOfNum.add(i);
		}
	}

	@Test
	public void contextLoads() {
	}

	/**
	 * Test case for number, which is multiple of 3, or multiple of 5, or multiple of both
	  * @{author} liuyusheng
	  * @{date} 2018/5/24 22:09
	  * @{param} []
	  * @{returnType} void
	 */
	@Test
	public void testIsMultiThreeAndFive() {
		listOfNum.forEach(x->fizzBuzzGamePrinciple.generateCroak(x));
	}

	/**
	 * Test case for number, which is divisible for 3, or has a 3 in it
	  * @{author} liuyusheng
	  * @{date} 2018/5/24 22:13
	  * @{param} []
	  * @{returnType} void
	 */
	@Test
	public void testIsThreeOrHasThree(){
		listOfNum.forEach(x->fizzThreeGamePrinciple.generateCroak(x));
	}

	/**
	 * Test case for number, which is divisible for 5, or has a 5 in it.
	  * @{author} liuyusheng
	  * @{date} 2018/5/24 22:22
	  * @{param} []
	  * @{returnType} void
	 */
	@Test
	public void testIfFiveOrHasFive(){
		listOfNum.forEach(x->buzzFiveGamePrinciple.generateCroak(x));
	}

}
