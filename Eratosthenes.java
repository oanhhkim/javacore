import java.util.Scanner;

public class Eratosthenes {

  Scanner scanner = new Scanner(System.in);
  int[] prime = new int[1000001];

  public int input() {
    System.out.print("n = ");
    int n = scanner.nextInt();
    return n;
  }

  public void eratosthenes(int n) {
    for (int i = 0; i <= n; i++) {
      prime[i] = 1;
    }
    prime[0] = prime[1] = 0;
    for (int i = 2; i <= n; i++) {
      if (prime[i] == 1) {
        for (int j = i * i; j <= 1000001; j += i) {
          prime[j] = 0;
        }
      }
    }
  }

  public void display(int n) {
    for (int i = 0; i <= n; i++) {
      if (prime[i] == 1) {
        System.out.print(i + " ");
      }
    }
  }

  public static void main(String[] args) {
    Eratosthenes sieve = new Eratosthenes();
    int n = sieve.input();
    sieve.display(n);
  }
}
