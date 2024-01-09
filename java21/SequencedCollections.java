package java21;

import java.util.List;

public class SequencedCollections {

    public static void main(String[] args){
        System.out.println("SequencedCollections");

        var arrayList = List.of(0,1,2,3,4,5);

        // Before - Java 17
        var lastItemBefore = arrayList.get(arrayList.size() - 1);

        // After - Java 21
        var lastItemAfter = arrayList.getLast();

        System.out.printf("Last: %d, %d%n", lastItemBefore, lastItemAfter);

    }
}