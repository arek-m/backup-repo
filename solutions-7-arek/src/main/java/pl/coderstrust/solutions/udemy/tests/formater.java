package pl.coderstrust.solutions.udemy.tests;

public class formater {
    public static void main(String[] args) {
        String word1 = "abcd";
        String word2 = "abc";
        String word3 = "ab";
        int i=100;
        System.out.format("%5d",i);
        System.out.format("%5s",word1);
        System.out.printf("%1s",word2);
        System.out.printf("%4s",word3);
    }
}
