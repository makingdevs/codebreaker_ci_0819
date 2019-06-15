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
    System.out.println("**********");
    System.out.println("number: "+Arrays.toString(number));
    System.out.println("secretArray: "+Arrays.toString(secretArray));
    for(int i = 0; i < number.length; i++){
    	String str = "";
    	boolean contains = contains(secretArray, number[i]);
    	System.out.println(contains);
    	System.out.println("number["+i+"]: "+number[i]+", secretArray: ["+i+"]: "+secretArray[i]);    	
    	if(contains) str = "*";
		if(contains && number[i]==secretArray[i]) str = "_";
		output += str;
		System.out.print("str: "+str);
		System.out.println(", output: "+output);
		System.out.println("\n\n");
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