package com.Bobur;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

//                                                   4 ways to reverse String

public class Main {

    //When calling a method that requires a parameter, you would just simply add the parameter in the parethesis after the method name.
    // For example:"someMethod(5)" or "someMethod(n)" if "n" is an integer.
    // If the method requires a reference object, simply enter the name of the object in the open and closed parenthesis.
    // For example, "someMethod(4, thing)".

    private static void strreverse(String input, char[] try1) {
        for (int i = try1.length - 1; i >= 0; i--)
            System.out.print(try1[i]);
    }


    private static void strreverse2(String input2, char[] hello) {
        List<Character> trial1 = new ArrayList<>();

        for (char c : hello)
            trial1.add(c);

        Collections.reverse(trial1);
        ListIterator li = trial1.listIterator();
        while (li.hasNext())
            System.out.print(li.next());
    }


    private static void ReverseString(String input3) {
        StringBuilder input1 = new StringBuilder();

        input1.append(input3);
        input1.reverse();

        System.out.println(input1);
    }


    private static void Reverse(String str) {
        StringBuffer sbr = new StringBuffer(str);

        sbr.reverse();
        System.out.println(sbr);
    }


    public static void main(String[] args) {
        String input = "ipod";
        strreverse("ipod", input.toCharArray());

        String input2  = "ipod";
        strreverse2("ipod", input2.toCharArray());

        ReverseString("ipod");

        Reverse("ipod");
    }
}


