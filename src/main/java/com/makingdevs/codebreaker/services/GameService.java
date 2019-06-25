package com.makingdevs.codebreaker.services;

import org.springframework.stereotype.Service;

import com.makingdevs.codebreaker.model.CodeBreaker;

@Service
public class GameService {

  public CodeBreaker initGameWith(Integer number){
    return new CodeBreaker(number);
  }

  public String guess(CodeBreaker game, int guessNumber){
    String[] guessedNumbers = ("" + guessNumber + "").split("");
    StringBuffer result = new StringBuffer();
    for(int i = 0; i < guessedNumbers.length; i++){
      if(guessedNumbers[i].equals(game.getNumbersInList()[i])) {
        result.append("_");
      } 
    }
    return result.toString();
  }

}