
package javaapplication32;
import java.util.Scanner; //Kullanıcıdan girdi alabilmek için scanner sınıfını projeye dahil ettik.
public class JavaApplication32 {
    
    public static void main(String[] args) {
        
        Scanner klavye = new Scanner(System.in);
        int gun;
        
        System.out.println("Haftanın gün sayısını yazınız.");
        gun = klavye.nextInt();
        
        switch(gun){
            case 1:
                System.out.println("Pazartesi");
                break;
            case 2:
                System.out.println("Salı");
                break;
            case 3:
                System.out.println("Çarşamba");
                break;
            case 4:
                System.out.println("Perşembe");
                break;
            case 5:
                System.out.println("Cuma");
                break;
            case 6:
                System.out.println("Cumartesi");
                break;
            case 7:
                System.out.println("Pazar");
                break;
            default:
                System.out.println("Lütfen 1-7 arası bir sayı giriniz.");
        }
       
    }
    
}
