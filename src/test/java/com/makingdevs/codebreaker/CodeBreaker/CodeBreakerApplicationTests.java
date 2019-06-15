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
	CodeBreaker game = gameService.initGameWith(4351);

	@Test
	public void contextLoads() {
	}

	@Test
	public void testInitializeGame(){
		assert(game.getSecret() == 4351);
	}

	@Test
	public void testTry1(){
		String result = gameService.guess(game, 4701);
		assertEquals("__", result);
	}
	@Test
	public void testTry2(){
		String result = gameService.guess(game, 2107);
		assertEquals("*", result);
	}
	@Test
	public void testTry3(){
		String result = gameService.guess(game, 1538);
		assertEquals("***", result);
	}
	@Test
	@Ignore
	public void testTry4(){
		String result = gameService.guess(game, 5341);
		assertEquals("__**", result);
	}

	@Test
	public void testGuessNumberIsSecret() {
		String result = gameService.guess(game, 4351);
		assertEquals("____", result);
	}

	@Test
	public void testIfDigitIsInSecret() {
		String secret = game.getSecret().toString();
		String resultYes= gameService.digitIsInSecret("4", secret);
		String resultNo = gameService.digitIsInSecret("8", secret);
		assertEquals("*", resultYes);
		assertEquals("", resultNo);
	}
}
