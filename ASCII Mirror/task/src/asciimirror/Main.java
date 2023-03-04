package asciimirror;

import java.util.Arrays;
import java.util.Scanner;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;
import java.util.List;
import java.lang.Math;

public class Main {

    public static int maxLen(List<String> list) {
        int maxl = 0;
        for (String element : list) {
            maxl = Math.max(maxl, element.length());
        }
        return maxl;
    }

    public static String padRight(String s, int width) {
        return s + " ".repeat(width - s.length());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the file path:");
        String fileName = scanner.nextLine();
        try {
            List<String> allLines = Files.readAllLines(Paths.get(fileName));
            int maxLineLength = maxLen(allLines);
            for (String element : allLines) {
                System.out.print(padRight(element, maxLineLength));
                System.out.print(" | ");
                System.out.println(reverse(padRight(element, maxLineLength)));
            }
        } catch (IOException e) {
            System.out.println("File not found!");
        }

    }

    private static String reverse(String s) {
        StringBuilder sb = new StringBuilder();
        String[] split = s.split("");
        for (int i = s.length() - 1; i >= 0; i--) {
            String temp = split[i];
            if ("<".equals(temp)) {
                temp = ">";
            } else if (">".equals(temp)) {
                temp = "<";
            }
            if ("[".equals(temp)) {
                temp = "]";
            } else if ("]".equals(temp)) {
                temp = "[";
            }
            if ("{".equals(temp)) {
                temp = "}";
            } else if ("}".equals(temp)) {
                temp = "{";
            }
            if ("(".equals(temp)) {
                temp = ")";
            } else if (")".equals(temp)) {
                temp = "(";
            }
            if ("/".equals(temp)) {
                temp = "\\";
            } else if ("\\".equals(temp)) {
                temp = "/";
            }
            sb.append(temp);
        }
        return sb.toString();
    }
}