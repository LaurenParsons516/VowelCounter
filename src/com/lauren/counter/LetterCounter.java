package com.lauren.counter;

public class LetterCounter {
    public static void main(String[] args) {

        String book = "Galatians";
        int vowelNum = 0;
        char[] vowels = {'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u'};

        for (int i = 0; i < book.length(); i++) {
            for (int j = 0; j < vowels.length; j++) {
                if (book.charAt(i) == vowels[j]) {
                    vowelNum++;
                }
            }
        }
        System.out.println("The number of vowels in the book \"" + book + "\" is: " + vowelNum);
    }
}

