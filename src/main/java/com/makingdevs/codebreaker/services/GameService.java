package com.makingdevs.codebreaker.services;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

import com.makingdevs.codebreaker.model.CodeBreaker;

@Component
public class GameService {

  public CodeBreaker initGameWith(Integer number) {
    return new CodeBreaker(number);
  }

  public String guess(CodeBreaker game, int guessNumber) {
    int secret = game.getSecret();

    String result = calculateGuess(secret, guessNumber);

    return result;

  }

  public String calculateGuess(int numberSecret, int number) {

    String resultAste = "", resulGuion = "";
    String sNumber = String.valueOf(number);
    String sSecret = String.valueOf(numberSecret);
    int position = 0;
    int positionS = 0;

    for (char n : sNumber.toCharArray()) {
      positionS = 0;
        for (char s : sSecret.toCharArray()) {
          if(n == s && position == positionS) {
            resulGuion += "_";
          } else if (n == s) {
            resultAste += "*";
          }
          positionS ++;
        }
        position ++;
    }

    return resulGuion + resultAste;
  }

}