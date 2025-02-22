package jiraya.javacore.collection.test;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest {
    public static void main(String[] args) {
        Queue<String> row = new PriorityQueue<>();
        row.add("D");
        row.add("B");
        row.add("A");
        row.add("C");

        while (!row.isEmpty()){
            System.out.println(row.poll());
        }


//        for (String s : row) {
//            System.out.println(s);
//        }


    }
}
