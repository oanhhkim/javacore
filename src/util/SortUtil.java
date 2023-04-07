package util;
public class SortUtil {
  public static int[] bubbleSort(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = arr.length - 1; j > i; j--) {
        if (arr[j] < arr[j - 1]) {
          int temp = arr[j];
          arr[j] = arr[j - 1];
          arr[j - 1] = temp;
        }
      }
    }
    return arr;
  }

  public static int[] insertSort(int[] arr) {
    for (int i = 1; i < arr.length; i++) {
      int val = arr[i];
      int index = i - 1;
      while (index >= 0 && arr[index] > val) {
        arr[index + 1] = arr[index];
        index = index - 1;
      }
      arr[index + 1] = val;
    }
    return arr;
  }
}
