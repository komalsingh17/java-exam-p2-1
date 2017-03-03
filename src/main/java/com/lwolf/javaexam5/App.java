package com.lwolf.javaexam5;

import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(13, 10, 7);
        String result;

        if (args.length > 0) result = sum(list, args[0]);
        else result = "No addition method specified.";

        System.out.println(result);
    }

    public static String sum(List<Integer> list, String method) {
        String result = "Sum with " + method + ": ";
        switch (method) {
            case "for":
                return result + sumWithFor(list);
            case "while":
                return result + sumWithWhile(list);
            case "recursion":
                return result + sumWithRecursion(list);
            default:
                return "Addition method not supported";
        }
    }

    public static int sumWithFor(List<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum;
    }

    public static int sumWithWhile(List<Integer> list) {
        int sum = 0, index = 0;
        while (index < list.size()) {
            sum += list.get(index++);
        }
        return sum;
    }

    public static int sumWithRecursion(List<Integer> list) {
        if (list.size() == 1) return list.get(0);
        return list.get(0) + sumWithRecursion(list.subList(1, list.size()));
    }
}
