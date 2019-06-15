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
    
    String guess = String.valueOf(game.getSecret());
    char[] arraychartguess = guess.toCharArray();
    String rsponguion = "";
    String rsponast = "";
    for (int i=0; i<arraychartsecret.length; i++) {
      if (arraychartsecret[i] == arraychartguess[i]) {
        rsponguion += "+";
      }else{
      for (char item:arraychartsecret) {
        if(item == arraychartguess[i])
          rsponast+="*";
      }
      }
    }
    String rs= rsponguion + rsponast;
    return rs;
  }

}