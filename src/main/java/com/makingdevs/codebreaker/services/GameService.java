package com.makingdevs.codebreaker.services;
import org.springframework.stereotype.Component;
import com.makingdevs.codebreaker.model.CodeBreaker;
import java.util.Arrays; 

@Component
public class GameService {

  public CodeBreaker initGameWith(Integer number){
    return new CodeBreaker(number);
  }

  public String guess(CodeBreaker game, int guessNumber){
    int secret = game.getSecret();
    String output = "";
    int[] number = convertToArray(guessNumber);
    int[] secretArray = convertToArray(secret);

        	int strContains = 0;
        	int strMatch = 0;

    for(int i = 0; i < number.length; i++){
    	boolean contains = contains(secretArray, number[i]);
    	if(contains && number[i]!=secretArray[i]) strContains++;
		  if(contains && number[i]==secretArray[i]) strMatch ++;
    }
    for(int i = 0; i < strMatch; i++) output += "_";
    for(int i = 0; i <strContains; i++)	output += "*";
    return output;
  }

  private int[] convertToArray(int number){
  	String temp = Integer.toString(number);
    int[] array = new int[temp.length()];
    for (int i = 0; i < temp.length(); i++)
        array[i] = temp.charAt(i) - '0';
    return array;
  }

  public static boolean contains(final int[] array, final int v) {
    boolean result = false;
    for(int i : array){
      if(i == v){
        result = true;
        break;
      }
    }
    return result;
  }

}