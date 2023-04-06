package main;

import java.util.Scanner;

public class BinarySearch {

  static Scanner scanner = new Scanner(System.in);

  public int[] input() {
    int n = scanner.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = scanner.nextInt();
    }
    return arr;
  }

  int binarySearch(int[] arr, int n, int m, int x) {
    if (m >= n) {
      int mid = n + (m - 1) / 2;
      if (arr[mid] == x) {
        return mid;
      }
      if (arr[mid] > x) {
        return binarySearch(arr, n, mid - 1, x);
      }
      return binarySearch(arr, mid + 1, m, x);
    }
    return -1;
  }

  public void display(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  public static void main(String[] args) {
    BinarySearch binarySearch = new BinarySearch();
    int[] arr = binarySearch.input();
    int x = scanner.nextInt();
    int result = binarySearch.binarySearch(arr, 0, arr.length - 1, x);
    if (result == -1) {
      System.out.println("Khong ton tai");
    } else {
      System.out.print(result);
    }
  }
}
