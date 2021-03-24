package com.codecool.whattoprint;

class Challenge {
    public static String decideAndSay(String[] words, int number) {
        String result = (number % 3 == 0 && number % 7 == 0)? words[0] + words[1] : (number % 3 == 0)? words[0] : (number % 7 == 0)? words[1] : "";
        return result;
    }
}
