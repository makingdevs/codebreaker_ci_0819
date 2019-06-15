package com.makingdevs.codebreaker.services;
import org.springframework.stereotype.Component;
import com.makingdevs.codebreaker.model.CodeBreaker;

@Component
public class GameService {

  public CodeBreaker initGameWith(Integer number){
    return new CodeBreaker(number);
  }
  
}