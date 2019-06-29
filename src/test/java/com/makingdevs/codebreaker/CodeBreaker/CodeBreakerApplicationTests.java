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
	public void testTry4(){
		String result = gameService.guess(game, 5341);
		assertEquals("__**", result);
	}
	@Test
	public void testTry5(){
		String result = gameService.guess(game, 2345);
		assertEquals("_**", result);
	}

	@Test
	public void testGetDigitList() {
		int guess = 4351;
		String[] result = gameService.getDigitList(guess);
		assertEquals("4", result[0]);
		assertEquals("3", result[1]);
		assertEquals("5", result[2]);
		assertEquals("1", result[3]);
	}

	@Test
	public void testGuessNumberIsSecret() {
		String result = gameService.guess(game, 4351);
		assertEquals("____", result);
	}

	@Test
	public void testIfDigitIsInSecret() {
		String resultYes= gameService.digitIsInSecret("4", game.getSecret());
		String resultNo = gameService.digitIsInSecret("8", game.getSecret());
		assertEquals("*", resultYes);
		assertEquals("", resultNo);
	}
}
