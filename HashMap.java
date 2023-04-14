import java.util.Scanner;

public class HashMap {

  Scanner scanner = new Scanner(System.in);

  public int[] input() {
    System.out.println("Nhập số lượng phần tử của mảng: ");
    int n = scanner.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = scanner.nextInt();
    }
    return arr;
  }

  public java.util.HashMap<Integer, Integer> countingNumber(int[] arr) {
    java.util.HashMap<Integer, Integer> count = new java.util.HashMap<>();
    for (int i = 0; i < arr.length; i++) {
      if (count.containsKey(arr[i])) {
        count.put(i, count.get(i) + 1);
      } else {
        count.put(i, 1);
      }
    }
    return count;
  }

  public static void main(String[] args) {
    HashMap hash = new HashMap();
    int[] arr = hash.input();
    java.util.HashMap<Integer, Integer> integerIntegerHashMap = hash.countingNumber(arr);
    System.out.println(integerIntegerHashMap);


  }


}
