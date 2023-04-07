package main;

import java.util.Scanner;import util.ScannerUtil;import util.SearchUtil;

public class BinarySearch {


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
    int x = ScannerUtil.SCANNER.nextInt();
    int result = SearchUtil.binarySearch(arr, 0, arr.length - 1, x);
    if (result == -1) {
      System.out.println("Khong ton tai");
    } else {
      System.out.print(result);
    }
  }
}
