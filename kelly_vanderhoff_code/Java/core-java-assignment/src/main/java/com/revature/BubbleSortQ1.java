package com.revature;

import java.util.Arrays;

public class BubbleSortQ1 {

    private int[] arr;

    public BubbleSortQ1(int[] source) throws NegativeArraySizeException, NullPointerException {
        this.arr = new int[source.length];
        System.arraycopy(source, 0, this.arr, 0, arr.length);

    }

    public void loadArray(int[] source) {
        if (source.length < 1) {
            return;
        }
        this.arr = new int[source.length];
        System.arraycopy(source, 0, this.arr, 0, arr.length);
    }

    public void sort() {
        boolean swapped;
        int i = 0, swapMe;
        if (this.arr.length < 2) {
            return;
        }
        do {
            swapped = false;
            for (int j = 0; j < this.arr.length - 1; j++) {
                if (this.arr[j] > this.arr[j+1]) {
                    swapMe = this.arr[j];
                    this.arr[j] = this.arr[j+1];
                    this.arr[j+1] = swapMe;
                    swapped = true;
                }
            }
            i++;
        } while (swapped & i < this.arr.length);
    }

    public void print() {
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] sample = { 1, 0, 5, 6, 3, 2, 3, 7, 9, 8, 4 };
        BubbleSortQ1 bubSort = new BubbleSortQ1(sample);
        bubSort.sort();
        System.out.println("Sorted array: ");
        bubSort.print();
    }

    public int[] getArr() {
        return arr;
    }

    @Override
    public String toString() {
        return "BubbleSortQ1{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BubbleSortQ1 that = (BubbleSortQ1) o;
        return Arrays.equals(arr, that.arr);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(arr);
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }
}
