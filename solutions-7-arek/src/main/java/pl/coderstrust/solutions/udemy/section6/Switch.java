package pl.coderstrust.solutions.udemy.section6;

public class Switch {
    public static void main(String[] args) {
//        int value = 2;
//        if (value == 1){
//            System.out.println("Value was 1");
//        } else if (value == 2) {
//            System.out.println("Value was 2");
//        } else {
//            System.out.println("Value was not 1 or not 2");
//        }

//        int switchValue = 2;
//
//        switch(switchValue){
//            case 1:
//                System.out.println("Value was 1");
//                break;
//
//            case 2:
//                System.out.println("Value was 2");
//                break;
//
//            case 3: case 4: case 5:
//                System.out.println("was 3 or 4 or 5");
//                System.out.println("Actually it was a " + switchValue);
//                break;
//
//            default:
//                 System.out.println("Was not 1 or 2");
//                 break;
//
//        }

        char switchLetter = 'a';
        switch(switchLetter){
            case 'A':
                System.out.println("Letter is A");
                break;
            case 'B': case 'C': case 'D':
                System.out.println("Letter is B");
                break;
            default:
                System.out.println("Letter is not A nor B,C,D");
                break;
        }

        //more code here
        String month = "JanUAry";
        switch(month.toLowerCase()){
            case "january":
                System.out.println("Jan");
                break;
            case "february":
                System.out.println("Feb");
                break;
            default:
                System.out.println("not sure ");
                break;
        }
    }
}
