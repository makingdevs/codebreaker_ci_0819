package com.makingdevs.codebreaker.CodeBreaker;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

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

}
