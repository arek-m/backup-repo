package pl.coderstrust.solutions.udemy.section6;

public class ParseValueFromString {
    public static void main(String[] args) {
        String numberAsString = "2018.222" ;
        System.out.println("numberAsString = " + numberAsString);
        // parsing string to intereger

        double number = Double.parseDouble(numberAsString);
        System.out.println("number *2 = "+number*2);

        numberAsString += 1;
        number += 1;

        System.out.println("numberAsString = " + numberAsString);
        System.out.println("number = " + number);



    }



}
