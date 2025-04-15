
package javaapplication32;
import java.util.Scanner;
public class JavaApplication32 {
    
    public static void main(String[] args) {
        
        Scanner yaz = new Scanner(System.in);
        
        int sayi;
        int toplam=0;
        while(true){
            System.out.println("Lütfen sayı giriniz:");
            sayi = yaz.nextInt();
            
            if(sayi==0){
                break;
            }
            toplam+=sayi;
        }
        
        System.out.println("Girilen sayıların toplamı: " + toplam);
    }
    
}
