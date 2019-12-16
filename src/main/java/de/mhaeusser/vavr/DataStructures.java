package de.mhaeusser.vavr;

import io.vavr.collection.List;
import io.vavr.collection.Queue;

public class DataStructures {

    public static void main(String[] args) {
        lists();
        queues();
    }

    public static void lists() {
        // = List(1, 2, 3)
        List<Integer> list1 = List.of(1, 2, 3);
        System.out.println(list1);

        // = List(0, 2, 3)
        List<Integer> list2 = list1.tail().prepend(0);
        System.out.println(list2);
    }

    public static void queues() {
        Queue<Integer> queue = Queue.of(1, 2, 3)
                .enqueue(4)
                .enqueue(5);
        System.out.println(queue);
    }
}
