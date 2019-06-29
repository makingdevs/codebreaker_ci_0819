package com.makingdevs.codebreaker.services;
import org.springframework.stereotype.Component;
import com.makingdevs.codebreaker.model.CodeBreaker;
import java.util.*;

@Component
public class GameService {

  public String digitIsInSecret(String digit, int secret) {
    String secretString = Integer.toString(secret);
    if (secretString.contains(digit)) {
      return "*";
    }
    return "";
  }

  public String[] getDigitList(int number) {
    String numberString = Integer.toString(number);
    return numberString.split("");
  }

  public String processGuessNumber(int guess, int secret) {
    String[] guessArray = getDigitList(guess);
    String[] secretArray = getDigitList(secret);
    List<String> inPosition = new ArrayList<String>();
    List<String> inNoPosition = new ArrayList<String>();
    for (int i = 0; i < 4; i++) {
      String digitGuess = guessArray[i];
      if (digitGuess.equals(secretArray[i])) {
        inPosition.add("_");
      } else {
        inNoPosition.add(digitIsInSecret(digitGuess, secret));
      }
    }

    String resultInPosition = String.join("", inPosition);
    String resultInNoPosition = String.join("", inNoPosition);
    return resultInPosition.concat(resultInNoPosition);
  }

  public CodeBreaker initGameWith(Integer number){
    return new CodeBreaker(number);
  }

  public String guess(CodeBreaker game, int guessNumber){
    int secret = game.getSecret();
    if (guessNumber == secret) {
      return "____";
    }
    return processGuessNumber(guessNumber, secret);
  }
  
}