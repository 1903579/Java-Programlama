public class Deneme(){
  
package javaapplication32;
import java.util.Scanner; //Kullanıcıdan girdi alabilmek için scanner sınıfını projeye dahil ettik.
public class JavaApplication32 {
    
    public static void main(String[] args) {
        
        Scanner oku = new Scanner(System.in); // Scanner sınıfıı kullanabilmek için nesne oluşturduk.
        int sayi; //sayi adında bir değişken tanımladık.
        
        System.out.println("Lütfen bir sayi giriniz.");
        sayi = oku.nextInt(); //kullanıcıdan sayi değişkenini aldık.
        
        if(sayi%2==0){
            System.out.println("Sayınız çift sayıdır.");
        }
        else{
            System.out.println("Sayınız tek sayıdır.");
        }
    }
    
}
