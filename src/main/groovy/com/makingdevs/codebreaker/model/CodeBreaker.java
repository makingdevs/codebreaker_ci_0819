package com.makingdevs.codebreaker.model;

public class CodeBreaker {
    private Integer secret;

    public CodeBreaker(Integer number){
        this.secret = number;
    }

    public Integer getSecret(){
        return this.secret;
    } 

    public void setSecret(Integer secret){
        this.secret = secret;
    } 
       
}