package jiraya.introduction;

public class Operators {
    public static void main(String[] args) {
        // + - * /
        int a = 10;
        int b = 20;
        int sum = a + b;
        System.out.println("Sum: "+ sum);

        // %
        int rest = 25 % 5;
        System.out.println(rest);

        // < > <= >= == !=
        boolean isTenEqualsToTen = 10==10;
        System.out.println(isTenEqualsToTen);

        // && (AND) || (OR)

        int age = 25;
        float salary = 500f;
        boolean isBigger = age > 20 && salary > 1000;
        System.out.println(isBigger);

        boolean isUnderage = age < 20 || salary < 1000;
        System.out.println(isUnderage);

        // += -= /= *=
        int total = 0;
        total += 1;
        System.out.println("Total: " + total);
    }
}
