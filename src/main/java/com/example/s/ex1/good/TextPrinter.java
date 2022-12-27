package com.example.s.ex1.good;

public class TextPrinter {

    private String text;

    public TextPrinter(String text) {
        this.text = text;
    }


    public void printText(){
        System.out.printf("""
                ########################
                %s
                ########################
                                
                %n""", this.text);
    }

    public void printOutEachWord(){

    }
    public void printRangeOfChars(){

    }

}
