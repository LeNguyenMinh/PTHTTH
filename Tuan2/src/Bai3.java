import java.util.Scanner;
public class Bai3 {
    private static Scanner scanner = new Scanner(System.in);
        public static void main(String[] args) {
        System.out.print("Nhap so a: ");
        float a = Bai3.scanner.nextFloat();
        System.out.print("Nhap so b: ");
        float b = Bai3.scanner.nextFloat();
        System.out.print("Nhap so c: ");
        float c = scanner.nextFloat();
        Bai3.giaiPTBac2(a, b, c);
    }
    public static void giaiPTBac2(float a, float b, float c) {
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong trinh vo nghiem!");
            } else {
                System.out.println("Phuonng trinh co mot nghiem: "
                        + "x = " + (-c / b));
            }
            return;
        }
        float delta = b*b - 4*a*c;
        float x1;
        float x2;
        if (delta > 0) {
            x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
            x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
            System.out.println("Phuong trinh co 2 nghiem la: "
                    + "x1 = " + x1 + " và x2 = " + x2);
        } else if (delta == 0) {
            x1 = (-b / (2 * a));
            System.out.println("Phuong trinh co nghiem kep: "
                    + "x1 = x2 = " + x1);
        } else {
            System.out.println("Phuong trinh vo nghiem!");
        }
    }
}
    