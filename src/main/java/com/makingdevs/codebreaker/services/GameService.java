package com.makingdevs.codebreaker.services;
import org.springframework.stereotype.Component;
import com.makingdevs.codebreaker.model.CodeBreaker;

@Component
public class GameService {

  public CodeBreaker initGameWith(Integer number){
    return new CodeBreaker(number);
  }

  public String guess(CodeBreaker game, int guessNumber){
    String result="";
    int secret = game.getSecret();
    
    int[] intSecret = String.valueOf(secret).chars().map(Character::getNumericValue).toArray();
    int[] intGuess = String.valueOf(guessNumber).chars().map(Character::getNumericValue).toArray();

    // for (int guessDigit : intGuess) {
    //   for (int secretDigit : intSecret){
    //     if(secretDigit == guessDigit && )
    //     {
    //       result += "*";
    //     }else if () {
          
    //     } else {
          
    //     }
    //   } 
    // }
    for (int i = 0; i < intSecret.length; i++) {
      for (int j = 0; j < intGuess.length; i++) {
        if(intSecret[i] == intGuess[j]   )
        {
          result += "*";
        }else if (intGuess[i] == 3) {
          
        } else {
          result +="_";
        }
      }
    }
    return result;
  }

}