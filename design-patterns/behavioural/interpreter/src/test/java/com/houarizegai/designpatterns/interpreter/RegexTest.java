package com.houarizegai.designpatterns.interpreter;

import org.junit.jupiter.api.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RegexTest {

    @Test
    void testPatternMatches() {
        String in = "Cat, lion, and tiger! these are animals.";
        Pattern pattern = Pattern.compile("(cat|lion|tiger)");
        Matcher matcher = pattern.matcher(in);
        while (matcher.find())
            System.out.println("Found a " + matcher.group());
    }
}
