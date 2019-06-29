package com.makingdevs.codebreaker.model;

public class CodeBreaker {
    private Integer secret;
    private String[] numbersInList;

    public CodeBreaker(Integer number){
        this.secret = number;
        this.numbersInList = ("" + number + "").split("");
    }

    public Integer getSecret(){
        return this.secret;
    } 

    public void setSecret(Integer secret){
        this.secret = secret;
    } 

    public String[] getNumbersInList() {
        return numbersInList;
    }
       
}