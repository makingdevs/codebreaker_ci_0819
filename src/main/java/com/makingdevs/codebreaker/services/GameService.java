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
        String strGuessNumber = String.valueOf(guessNumber);
        List<Character> charactersFound = new ArrayList<>();

        List<Character> secretsCharacterList = getCharactersFromInteger(game.getSecret());

        for (int x = 0; x < strGuessNumber.length(); x++) {
            if (strGuessNumber.charAt(x) == secretsCharacterList.get(x)) {
                charactersFound.add(strGuessNumber.charAt(x));
                resp += "_";
            }
        }

        //Revisamos que el numero este en la lista
        for (int x = 0; x < strGuessNumber.length(); x++) {
            if (secretsCharacterList.contains(strGuessNumber.charAt(x))
                    && !charactersFound.contains(strGuessNumber.charAt(x))) {
                resp += "*";
            }
        }

        return resp;
    }

    private List<Character> getCharactersFromInteger(int number){
        String strNumber = String.valueOf(number);
        List<Character> characterList = new ArrayList<>();
        for (int x = 0; x < strNumber.length(); x++) {
            characterList.add(strNumber.charAt(x));
        }
        return characterList;
    }
}