package com.example.s.ex1.bad;

public class TextManipulator {

    private String text;

    public TextManipulator(String text) {
        this.text = text;
    }

    public void appendText(String newText){

    }

    public String findWordAndReplace(String word, String replacement){

        return text;
    }

    public String findWordAndDelete(String word){

        return text;
    }

    public void printText(){
        System.out.printf("""
                ########################
                %s
                ########################
                                
                %n""", this.text);
    }


}
