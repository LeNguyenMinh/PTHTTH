import java.util.Scanner;
public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String message;
        System.out.println("\n\nNhap vao chuoi can in hoa: ");
        message = sc.nextLine();
        System.out.println("Chuoi sau khi in hoa: ");
        System.out.println(message.toUpperCase());
        sc.close();
      }
    }