package ru.alexgeniusman.java2020.badTasks.part_5.ex8;


public class Main {
    public static boolean isPalindrome(String s) {
        if (s == null)
            return false;
        else if (s.length() == 0 || s.length() == 1)
            return true;

        if (s.charAt(0) == s.charAt(s.length() - 1))
            return isPalindrome(s.substring(1, s.length() - 1));

        return false;
    }

    public static void main(String[] arg) {
        System.out.println(isPalindrome("radar"));
    }

}
