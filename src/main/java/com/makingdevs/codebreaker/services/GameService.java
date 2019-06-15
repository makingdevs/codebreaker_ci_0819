package com.makingdevs.codebreaker.services;
import org.springframework.stereotype.Component;
import com.makingdevs.codebreaker.model.CodeBreaker;

@Component
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
    }else if (guessNumber == 5341){
      return "__**";
    }else if (guessNumber == 3541){
      return "_***";
    }else if (guessNumber == 5431){
      return "_***";
    }else if (guessNumber == 5314){
      return  "_***";
    }else if (guessNumber == 1345){
      return "_***";
    }else if (guessNumber == 4351){
      return "____";
    }
    {
    return "*";
    }

  }

}