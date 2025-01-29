package jiraya.javacore.collection.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String>names = new ArrayList(16);
        names.add("abc");
        names.add("cba");
        names.remove(1);

        for(String nomes: names){
            System.out.println(nomes);
        }

        names.add("pov");
        System.out.println("-------------");
        for (int i = 0; i < names.size(); i++){
            System.out.println(names.get(i));
        }
    }

}
