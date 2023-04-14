import java.util.Scanner;

public class Eratosthenes {
  Scanner scanner = new Scanner(System.in);
  public void input(){
    System.out.print("n = ");
    int n = scanner.nextInt();
  }
  public void eratosthenes(int check){
    int n = 1000;
    check = new boolean[n];
    for(int i = 2; i<=n; i++){
      check[i] = true;
    }
    for(int i = 2; i<=n; i++){
      if(check[i]==true){
        for(int j =2*i; j<=n; j+=i){
          check[j] = false;
        }
      }
    }
  }

  public static void main(String[] args) {
    for(int i = 2; i<n; i++){
      if(check[i]==true)
    }
  }


}
