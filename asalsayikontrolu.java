
package javaapplication32;
import java.util.Scanner;
public class JavaApplication32 {
    
    public static boolean isAsal(int sayi) {
        if (sayi <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(sayi); i++) {
            if (sayi % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("İlk sayıyı girin: ");
        int sayi1 = scanner.nextInt();

        System.out.print("İkinci sayıyı girin: ");
        int sayi2 = scanner.nextInt();

        System.out.println("Girilen sayılardan asal olanlar:");

        if (isAsal(sayi1)) {
            System.out.println(sayi1);
        }

        if (isAsal(sayi2)) {
            System.out.println(sayi2);
        }

        scanner.close();
    }

    }
    

