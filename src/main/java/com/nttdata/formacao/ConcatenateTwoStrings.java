package com.nttdata.formacao;

public class ConcatenateTwoStrings {

    public String concatenateTwoStrings(String string1, String string2) {

        String concatenatedString = string1 + " " + string2;

        return concatenatedString;
    }

    public String concatenateTwoStringsWithConcat(String string1, String string2) {

        String concatenatedString = string1.concat(" " + string2);

        return concatenatedString;
    }
}
