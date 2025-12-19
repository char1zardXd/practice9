package com.algorithmization.practice9;

import java.util.Arrays;
import java.util.Scanner;

public class MAIN {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        String string;

        check();

        System.out.println("Введите строку для переворота строки: ");
        string = scanner.nextLine();
        System.out.println("Выберите какую функцию вызвать (1 или 2): ");
        n = scanner.nextInt();

        switch (n) {
            case 1: reverse_words1(string);
            break;
            case 2: reverse_words2(string);
            break;
            default:
                System.out.println("Неверный выбор!");
        }
    }
    public static String check() {
        Scanner scanner = new Scanner(System.in);
        String text;
        boolean isCorrect;
        String[] words;

        do {
            isCorrect = true;
            System.out.println("Введите строку для проверки: ");
            text = scanner.nextLine().trim();
            words = text.split(" ");

            if (words.length < 2) {
                isCorrect = false;
            } else {
                for (int i = 0; i < words.length; i++) {
                    if (words[i].length() < 3) {
                        isCorrect = false;
                        break;
                    }
                }
            }
            if (!isCorrect) {
                System.out.println("Строка не прошла проверку!!!");
            }
        }while (!isCorrect);

        System.out.println("Строка прошла проверку");
        return text;
    }

    public static String reverse_words1 (String text) {
        String[] words = text.split(" ");

        String[] reversedWords = new String[words.length];
        for (int i = 0; i < words.length; ++i) {
            reversedWords[i] = new String("");
            for (int j = words[i].length() - 1; j >= 0; j--)
            {
                reversedWords[i] += words[i].charAt(j);
            }
        }
        return Arrays.toString(reversedWords);
    }

    public static String reverse_words2 (String text) {
        String result = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            result += text.charAt(i);
        }
        return result;
    }
}