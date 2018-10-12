package com.company;

public class Switch {
    public static void main (String[] args) {
        String test = "ERFDSAZXCVBGTBNBOLPHG";
        System.out.println(encrypt(test, 2));
        System.out.println(encrypt2(test, 2));
    }
    public static String encrypt (String cases, int counts) {
        String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char[] word = cases.toCharArray();
        String newWord = "";
        for (char i : word) {
            int index = alpha.indexOf(i);
            int newIndex = index + counts;
            if (newIndex >= alpha.length()) {
                newIndex = newIndex - alpha.length();
            } else if (newIndex < 0) {
                newIndex = alpha.length() + newIndex;
            } else {
                newIndex = index + counts;
            }
            newWord = newWord + alpha.charAt(newIndex);
        }
        cases = newWord;
        return cases;
    }
    public static String encrypt2 (String cases, int counts) {
        char[] word = cases.toCharArray();
        String newWord = "";
        for (char i : word) {
            int letter = (int) i + counts;
            if (letter > 'Z') {
                letter = letter + (int) 'A' - (int) 'Z' - 1;
            } else if (letter < 'A') {
                letter = letter + (int) 'Z' - (int) 'A' + 1;
            } else {
                letter = (int) i + counts;
            }
            newWord = newWord + (char) letter;
        }
        cases = newWord;
        return cases;
    }
}
