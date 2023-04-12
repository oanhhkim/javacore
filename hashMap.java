import java.util.HashMap;
import java.util.Scanner;

public class hashMap {
  Scanner scanner = new Scanner(System.in);
  public int[] input(){
    System.out.println("Nhập số lượng phần tử của mảng: ");
    int n = scanner.nextInt();
    int[] arr = new int[n];
    for(int i = 0; i< arr.length; i++){
      arr[i] = scanner.nextInt();
    }
    return arr;
  }
  public HashMap<Integer, Integer> countingNumber(int[] arr){
    HashMap<Integer, Integer> count = new HashMap<Integer, Integer>();
    for(int i= 0; i<arr.length; i++){
      if(count.containsKey(i)){
        count.put(i, count.get(i)+1);
      }
      else {
        count.put(i, 1);
      }
    }
    return count;
  }

  public static void main(String[] args) {
    hashMap hash = new hashMap();
    int[] arr = hash.input();
    HashMap<Integer, Integer> integerIntegerHashMap = hash.countingNumber(arr);
    System.out.println(integerIntegerHashMap);


  }


}
