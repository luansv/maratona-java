package jiraya.introduction;

public class ConditionalsStructure03 {
    public static void main(String[] args) {
        //Print days of the week considering 1 as sunday

        int day = 0;
        switch (day){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            default:
                System.out.println("Invalid!");
                break;
        }
    }
}
