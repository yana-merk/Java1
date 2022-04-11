/**
* Java 1. Homework 2
*
* @author Yana Merkulova
* @version 25.03.2022
*/
class HomeWorkJava2 {
    public static void main(String[] args) {
        System.out.println(checkSum(2, 3));
        positiveOrNegative(-5);
        System.out.println(whichNumber(6));
        lineRepeat("Hello_everybody", 8);
    }

    static boolean checkSum(int a, int b) {
        int c = a + b;
        return c >= 10 && c<= 20;
    }

    static void positiveOrNegative(int a) {
        System.out.println( a > 0? "Positive" : "Negative");
    }

    static boolean whichNumber(int a) {
        return a < 0;
    }
    
    public static void lineRepeat(String Hello_everybody, int b) {
        for (int a = 0; a < 8; a++) {
            System.out.println(Hello_everybody);
        }
    }
}