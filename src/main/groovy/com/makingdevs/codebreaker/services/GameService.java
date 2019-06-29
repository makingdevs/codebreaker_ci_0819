package com.makingdevs.codebreaker.services;

import org.springframework.stereotype.Service;

import com.makingdevs.codebreaker.model.CodeBreaker;
import java.util.List;
import java.util.Arrays;

@Service
public class GameService {

  public CodeBreaker initGameWith(Integer number){
    return new CodeBreaker(number);
  }

  public String guess(CodeBreaker game, int guessNumber){
    String[] guessedNumbers = ("" + guessNumber + "").split("");
    StringBuffer resultPositionAndNumber = new StringBuffer();
    StringBuffer resultOnlyNumber = new StringBuffer();
    for(int i = 0; i < guessedNumbers.length; i++){
      if(guessedNumbers[i].equals(game.getNumbersInList()[i])) {
        resultPositionAndNumber.append("_");
      } else {
        List<String> numberList = Arrays.asList(game.getNumbersInList());
        if(numberList.contains(guessedNumbers[i])){
          resultOnlyNumber.append("*");
        }
      }
    }

    return resultPositionAndNumber.toString() + resultOnlyNumber.toString();
  }

}