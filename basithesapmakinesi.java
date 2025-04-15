
package javaapplication32;
import java.util.Scanner; //Kullanıcıdan girdi alabilmek için scanner sınıfını projeye dahil ettik.
public class JavaApplication32 {
    
    public static void main(String[] args) {
        
        Scanner klavye = new Scanner(System.in);
        char islem;
        int sayi1, sayi2;
        
        System.out.println("Birinci sayıyı giriniz.");
        sayi1 = klavye.nextInt();
        
        System.out.println("İkinci sayıyı giriniz.");
        sayi2 = klavye.nextInt();
        
        System.out.println("Lütfen seçim yapınız:");
        System.out.println("+,-,*,/,%");
        islem = klavye.next().charAt(0);
        
        switch(islem){
            case '+' :
                System.out.println(sayi1 + sayi2);
                break;
            case '-':
                System.out.println(sayi1-sayi2);
                break;
            case '*':
                System.out.println(sayi1*sayi2);
                break;
            case '/':
                System.out.println(sayi1/sayi2);
                break;
            case '%':
                System.out.println(sayi1%sayi2);
                break;
            default:
                System.out.println("Geçersiz işlem karakteri girdiniz.");
        }
       
    }
    
}
