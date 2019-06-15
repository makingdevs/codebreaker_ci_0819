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
    for(int i = 0; i < number.length; i++){
    	String str = "";
    	boolean contains = Arrays.asList(secretArray).contains(number[i]);
    	if(contains) str = "*";
		if(number[i]==secretArray[i]) str = "_";
		output += str;
    }
    return output;
  }

  private int[] convertToArray(int number){
  	String temp = Integer.toString(number);
	int[] array = new int[temp.length()];
	for (int i = 0; i < temp.length(); i++)
	    array[i] = temp.charAt(i) - '0';
  	return array;
  }

}