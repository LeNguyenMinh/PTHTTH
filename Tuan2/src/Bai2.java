import java.util.Scanner;
public class Bai2 {
    public static void main (String[] arg){
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap so: ");
        int n = s.nextInt();
        if (isPrime(n)) {
            System.out.println(n + " la so nguyen to");
        } else {
            System.out.println(n + " khong phai la so nguyen to");
            s.close();
        }
    }
        public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
 }
  