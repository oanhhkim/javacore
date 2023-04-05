package main;

import java.util.Scanner;

public class BubbleSort {

  Scanner scanner = new Scanner(System.in);

  public int[] input() {
    int n = scanner.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = scanner.nextInt();
    }
    return arr;
  }
//  public void swap(int x, int y){
//    int temp = x;
//    x = y;
//    y = temp;
//  }


  public int[] bubbleSort(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = arr.length - 1; j > i; j--) {
        if (arr[j] < arr[j - 1]) {
          int temp = arr[j];
          arr[j] = arr[j-1];
          arr[j-1] = temp;
        }
      }
    }
    return arr;
  }
  public void display(int[] arr){
    for(int i = 0; i<arr.length; i++){
      System.out.print(arr[i]+" ");
    }
  }

  public static void main(String[] args) {
    BubbleSort bubbleSort = new BubbleSort();
    int[] arr = bubbleSort.input();
    int[] b = bubbleSort.bubbleSort(arr);
    bubbleSort.display(b);


  }

}
