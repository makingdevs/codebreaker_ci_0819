package com.makingdevs.codebreaker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class GameController {

    ModelAndView index(){
        return new ModelAndView("index");
    }
}