package com.makingdevs.codebreaker.CodeBreaker;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
import org.junit.Ignore;

import com.makingdevs.codebreaker.model.CodeBreaker;
import com.makingdevs.codebreaker.services.GameService;


@RunWith(SpringRunner.class)
@SpringBootTest
public class CodeBreakerApplicationTests {

	GameService gameService = new GameService();

	@Test
	public void contextLoads() {
	}

	@Test
	public void testInitializeGame(){
		CodeBreaker game = gameService.initGameWith(4351);
		assert(game.getSecret() == 4351);
	}

	@Test
	public void testTry1(){
		CodeBreaker game = gameService.initGameWith(4351);
		String result = gameService.guess(game, 4701);
		assertEquals("__", result);
	}

	@Test
	public void testTry2(){
		CodeBreaker game = gameService.initGameWith(4351);
		String result = gameService.guess(game, 2107);
		assertEquals("*", result);
	}
	@Test
	public void testTry3(){
		CodeBreaker game = gameService.initGameWith(4351);
		String result = gameService.guess(game, 1538);
		assertEquals("***", result);
	}
	@Test
	public void testTry4(){
		CodeBreaker game = gameService.initGameWith(4351);
		String result = gameService.guess(game, 5341);
		assertEquals("__**", result);
	}
	@Test
	public void testTry5(){
		CodeBreaker game = gameService.initGameWith(4351);
		String result = gameService.guess(game, 3541);
		assertEquals("_***", result);
	}
}
