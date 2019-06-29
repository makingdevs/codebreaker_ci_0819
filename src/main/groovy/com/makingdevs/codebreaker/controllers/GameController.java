package com.makingdevs.codebreaker.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.makingdevs.codebreaker.services.GameService;
import com.makingdevs.codebreaker.model.CodeBreaker;
import java.util.*;

@Controller
@RequestMapping("/")
public class GameController {

    @Autowired
    private GameService gameService;

    @RequestMapping("/{number}")
    ModelAndView index(@PathVariable("number") Integer number){
        ModelAndView modelAndView = new ModelAndView("index");
        CodeBreaker game = gameService.initGameWith(number);
        String result = gameService.guess(game, number);
        Map model = new HashMap();
        modelAndView.addObject("results", number + " - " + result);
        return modelAndView;
    }
}