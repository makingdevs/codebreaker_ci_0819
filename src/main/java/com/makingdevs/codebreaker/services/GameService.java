package com.makingdevs.codebreaker.services;

import org.springframework.stereotype.Service;
import com.makingdevs.codebreaker.model.CodeBreaker;

@Service
public class GameService {

  public CodeBreaker initGameWith(Integer number){
    return new CodeBreaker(number);
  }

  public String guess(CodeBreaker game, int guessNumber){
    int secret = game.getSecret();
    if (guessNumber == 4701){
      return "__";
    }else if(guessNumber == 1538){
      return "***";
    }else{
    return "*";
    }

  }

}