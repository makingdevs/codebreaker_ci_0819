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
        rspon += "_";
      }else{
        for (char item:arraychartsecret) {
          if (item == arraychartguess[i]){rspon+="*";}
        }

      }
    }
    return rspon;
  }

}