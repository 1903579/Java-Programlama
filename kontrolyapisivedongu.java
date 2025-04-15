
package javaapplication32;
import java.util.Scanner; //Kullanıcıdan girdi alabilmek için scanner sınıfını projeye dahil ettik.
public class JavaApplication32 {
    
    public static void main(String[] args) {
        
        Scanner klavye = new Scanner(System.in);
        int sayi;
        
        System.out.println("Lütfen bir sayı giriniz:");
        sayi = klavye.nextInt();
        
        while(sayi>=5){
            if(sayi>5){
            System.out.println("Girdiğiniz sayı 5'ten büyüktür.");
            }
            else{
                System.out.println("Girdiğiniz sayı 5'e eşittir.");
            }
            System.out.println("Lütfen tekrar deneyiniz.");
            sayi=klavye.nextInt();
        }
        System.out.println("Sayınız 5'ten küçüktür.");
    }
    
}
