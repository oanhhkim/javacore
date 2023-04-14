import java.util.Scanner;
import java.util.Set;

public class HashSet {

  static Scanner scanner = new Scanner(System.in);

  public int number() {
    System.out.print("NHập tổng cặp số: ");
    int n = scanner.nextInt();
    return n;
  }

  public int[] input() {
    System.out.print("Nhập số phần tử của mảng: ");
    int n = scanner.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = scanner.nextInt();
    }
    return arr;
  }

  public boolean hashSet(int[] arr, int n) {
    Set<Integer> hashSet = new java.util.HashSet<>();
    for (int i : arr) {
      hashSet.add(i);
    }
    for (int i : arr) {
      int j = n - i;
      if (j != i && hashSet.contains(j)) {
        return true;
      }
    }
    return false;
  }

  public static void main(String[] args) {
    HashSet hashSet = new HashSet();
    int x = hashSet.number();
    int[] arr = hashSet.input();
    boolean flag = hashSet.hashSet(arr, x);
    System.out.print(flag);
  }
}
