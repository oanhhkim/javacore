package main;

import java.util.Scanner;

public class Sort {

  Scanner scanner = new Scanner(System.in);

  public int[] input() {
    int n = scanner.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = scanner.nextInt();
    }
    return arr;
  }



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
  public int[] insertSort(int[] arr){
    for(int i = 1; i<arr.length; i++){
      int val = arr[i];
      int index = i - 1;
      while(index>=0 && arr[index]>val){
        arr[index+1] = arr[index];
        index = index - 1;
      }
      arr[index+1] = val;
    }

    return arr;
  }
  public void display(int[] arr){
    for(int i = 0; i<arr.length; i++){
      System.out.print(arr[i]+" ");
    }
  }

  public static void main(String[] args) {
    Sort sort = new Sort();
    int[] arr = sort.input();
//    int[] b = bubbleSort.bubbleSort(arr);
    int[] b = sort.insertSort(arr);
    sort.display(b);


  }

}
