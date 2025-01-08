package jiraya.javacore.exception.runtime.test;

public class RunTimeException02 {
    public static void main(String[] args) {
        divisao(4, 0);
    }

    //it´s a ArithmeticException(RunTimeException) that can be fixed or not, it´s optional!
    private static int divisao(int a, int b) {
        try {
            return a / b; //print it if works out

        } catch (ArithmeticException e) {
            e.printStackTrace(); // otherwise print this
        }
        return 0; // or this if it doesn´t work again
    }
}
