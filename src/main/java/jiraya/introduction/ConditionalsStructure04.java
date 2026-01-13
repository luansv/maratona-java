package jiraya.introduction;

public class ConditionalsStructure04 {
    public static void main(String[] args) {
        //Given the values from 1 to 7, print whether if the day is a weekday or a weekend
        //Considering 1 as sunday
        
        int day = 7;
        switch (day){
            case 1:
            case 7:
                System.out.println("Weekend!");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Weekday");
                break;
            default:
                System.out.println("Invalid!");
                break;
        }
    }
}
