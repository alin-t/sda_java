package sda.main;

import sda.sorting.Bubble;
import sda.sorting.MergeSort;

/**
 * User: Alin-Desktop
 * Date: 9/20/13
 * Time: 9:29 PM
 */
public class MainRunner {
    public static void main(String[] args) {

    }

    private static void CallBubble() {
        Bubble bubble = new Bubble(new int[]{1, 5, 9, 2, 3, 11, 13, 21, 4, 10});

        int[] bubbleResult = bubble.doSort();

        for (int i = 0; i < bubbleResult.length; i++) {
            System.out.println(bubbleResult[i]);
        }
    }

    private static void CallMerge() {
        MergeSort mergeSort = new MergeSort();

        int[] toMerge = new int[]{1, 5, 9, 2, 3, 11, 13, 21, 4, 10};
        mergeSort.mergeSort(toMerge, 0, 9, "root");

        for (int i = 0; i < toMerge.length; i++) {
            System.out.println(toMerge[i]);
        }
    }
}
