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

        MergeSort mergeSort = new MergeSort();

        int[] toMerge = new int[]{1, 5, 9, 2,3, 11, 13, 21, 4};
        mergeSort.mergeSort(toMerge, 0, 8, "root");
        /*
        for(int i = 0; i < toMerge.length; i++) {
            System.out.println(toMerge[i]);
        }
        */

    }
}
