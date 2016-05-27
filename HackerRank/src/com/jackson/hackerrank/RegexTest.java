package com.jackson.hackerrank;

import java.io.InputStream;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {
    public void checker (String regexPattern, InputStream source) {
        Scanner input = new Scanner(source);
        String testString = input.nextLine();
        Pattern p = Pattern.compile(regexPattern);
        Matcher m = p.matcher(testString);
        int count = 0;
        while (m.find()) {
            count += 1;
        }
        System.out.format("Number of matches: %d", count);
    }
}
