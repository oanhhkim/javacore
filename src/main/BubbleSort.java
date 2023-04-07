package main;

import java.util.Scanner;
import util.ScannerUtil;
import util.SortUtil;

public class BubbleSort {

  public static int[] input() {
    int n = ScannerUtil.SCANNER.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = ScannerUtil.SCANNER.nextInt();
    }
    return arr;
  }


  public static void display(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  public static void main(String[] args) {
    int[] arr = input();
    int[] b = SortUtil.bubbleSort(arr);
    display(b);
  }
}
