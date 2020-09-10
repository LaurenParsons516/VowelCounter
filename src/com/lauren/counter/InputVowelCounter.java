package com.lauren.counter;

import java.util.Scanner;

public class InputVowelCounter {
    public static void main(String[] args) {

        Scanner inputScanner = new Scanner(System.in);
        int vowelNum = 0;
        char[] vowels = {'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u'};

        System.out.println("Enter word:");

        String input = inputScanner.nextLine();

        for (int i = 0; i < input.length(); i++) {
            for (int j = 0; j < vowels.length; j++) {
                if (input.charAt(i) == vowels[j]) {
                    vowelNum++;
                }
            }
        }
        System.out.println("The number of vowels in your word is: " + vowelNum);
    }
}
