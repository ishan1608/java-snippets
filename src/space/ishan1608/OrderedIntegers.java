package space.ishan1608;

import java.util.Collections;
import java.util.PriorityQueue;

public class OrderedIntegers {
    public static void main(String[] args) {
        PriorityQueue<Integer> integerPriorityQueue = new PriorityQueue<>(Collections.reverseOrder());

        integerPriorityQueue.add(10);
        integerPriorityQueue.add(400);
        integerPriorityQueue.add(30);
        integerPriorityQueue.add(40);

        System.out.println(integerPriorityQueue.poll());
        System.out.println(integerPriorityQueue.poll());
        System.out.println(integerPriorityQueue.poll());
        System.out.println(integerPriorityQueue.poll());
    }
}
