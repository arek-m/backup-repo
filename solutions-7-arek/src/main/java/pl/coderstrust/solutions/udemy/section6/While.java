package pl.coderstrust.solutions.udemy.section6;

public class While {
    public static void main(String[] args) {
        int count = 1;
        while (count != 6) {
            System.out.println("Count value is " + count);
            count++;
        }
        count = 6;
        do {
            System.out.println("Count value was " + count);
        } while (count != 6);

//        count = 1;
//        while (true){
//            if (count == 6){
//                break;
//            }
//            System.out.println("Count value is " + count);
//            count++;
//        }

        int number = 4;
        int numberStop = 25;
        int counter = 0;

        while (number < numberStop && counter != 5){
            number++;
            if(!isEven(number)){
                continue;
            }
            System.out.println("Number " + number + " is even");
            counter ++;
        }
        System.out.println(" Total number of even numbers = " + counter);
    }

    public static boolean isEven(int n){
        if ((n % 2) == 0){
            return true;
        }
        return false;
    }
}
