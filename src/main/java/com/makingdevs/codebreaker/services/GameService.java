package com.makingdevs.codebreaker.services;

import org.springframework.stereotype.Component;
import com.makingdevs.codebreaker.model.CodeBreaker;

import java.util.ArrayList;
import java.util.List;

@Component
public class GameService {

    public CodeBreaker initGameWith(Integer number) {
        return new CodeBreaker(number);
    }

    public String guess(CodeBreaker game, int guessNumber) {

        String resp = "";

        String secret = String.valueOf(game.getSecret());
        String strGuessNumber = String.valueOf(guessNumber);

        List<Character> secretsCharacterList = new ArrayList<>();
        List<Character> guessCharacterList = new ArrayList<>();

        for (int x = 0; x < secret.length(); x++) {
            secretsCharacterList.add(secret.charAt(x));
        }

        for (int x = 0; x < strGuessNumber.length(); x++) {
            for (Character c : secretsCharacterList) {
                if (strGuessNumber.charAt(x) == c) {
                    resp += "_";
                }
            }
        }

        return resp;
    }
}