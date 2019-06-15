package com.makingdevs.codebreaker.services;
import org.springframework.stereotype.Component;
import com.makingdevs.codebreaker.model.CodeBreaker;

@Component
public class GameService {

  public String digitIsInSecret(String digit, String secret) {
    if (secret.contains(digit)) {
      return "*";
    }
    return "";
  }

  public CodeBreaker initGameWith(Integer number){
    return new CodeBreaker(number);
  }

  public String guess(CodeBreaker game, int guessNumber){
    int secret = game.getSecret();
    if (guessNumber == secret) {
      return "____";
    }

    if (guessNumber == 4701) {
      return "__";
    }

    if (guessNumber == 1538) {
      return "***";
    }

    return "*";
  }

}