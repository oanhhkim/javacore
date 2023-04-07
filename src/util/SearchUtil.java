package util;

public class SearchUtil {

  public static int binarySearch(int[] arr, int n, int m, int x) {
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
}
