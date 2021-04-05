package com.easy.day3;

import java.util.PriorityQueue;

public class SortArrDistanceLessK {
    public void sortedArrDistanceLessK(int[] arr, int k) {

        //java中的小根堆可以直接用
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        int index = 0;
        for (; index < Math.min(arr.length, k); index++) {
            heap.add(arr[index]);
        }
        int i = 0;
        for (; index < arr.length; i++, index++) {
            heap.add(arr[index]);
            arr[i] = heap.poll();
        }
        while (!heap.isEmpty()) {
            arr[i++] = heap.poll();
        }
    }
}
