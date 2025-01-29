package jiraya.javacore.collection.test;
import jiraya.javacore.collection.domain.Smartphone;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SmartphoneListTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("!ABC1", "Apple");
        Smartphone s2 = new Smartphone("22222", "Google");
        Smartphone s3 = new Smartphone("33333", "Samsung");

        List<Smartphone> smartphoneList = new ArrayList<>(5);
        smartphoneList.add(s1);
        smartphoneList.add(s2);
        smartphoneList.add(0, s3); // it will be the first printed

        for (Smartphone sp : smartphoneList) {
            System.out.println(sp);
        }
        Smartphone s4 = new Smartphone("33333", "Samsung");
        System.out.println(smartphoneList.contains(s4)); //true

        Smartphone s5 = new Smartphone("44444", "Pixel");
        System.out.println(smartphoneList.contains(s5)); //false

        int indexSmartphone4 = smartphoneList.indexOf(s4);
        System.out.println(indexSmartphone4); // 2


    }
}
