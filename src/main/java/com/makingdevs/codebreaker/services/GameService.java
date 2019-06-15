package com.makingdevs.codebreaker.services;
import org.springframework.stereotype.Component;
import com.makingdevs.codebreaker.model.CodeBreaker;

@Component
public class GameService {

  public CodeBreaker initGameWith(Integer number){
    return new CodeBreaker(number);
  }

  public String guess(CodeBreaker game, int guessNumber){

    String secret = String.valueOf(game.getSecret());
    char[] arraychartsecret = secret.toCharArray();
    
    String guess = String.valueOf(guessNumber);
    char[] arraychartguess = guess.toCharArray();
    String rsponguion = "";
    String rspon = "";
    for (int i=0; i<4; i++) {
      if (arraychartsecret[i] == arraychartguess[i]) {
        arraychartguess[i] = ' ';
        rspon += "_";
      }
    }

    for (char item:arraychartguess) {
      for (char item2:arraychartsecret) {
        if (item == item2){rspon+="*";}
      }
    }
    return rspon;
  }

}