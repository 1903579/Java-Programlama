
package javaapplication32;
import java.util.Scanner; //Kullanıcıdan girdi alabilmek için scanner sınıfını projeye dahil ettik.
public class JavaApplication32 {
    
    public static void main(String[] args) {
        
        Scanner oku = new Scanner(System.in); // Scanner sınıfıı kullanabilmek için nesne oluşturduk.
        int not; 
        
        System.out.println("Lütfen bir not giriniz.");
        not = oku.nextInt(); //kullanıcıdan not değişkenini aldık.
        
        if(not >= 90){
            System.out.println("AA");
        }
        else if(not >= 85){
            System.out.println("BA");
        }
        else if (not >= 80){
            System.out.println("BB");
        }
        else{
            System.out.println("Diğer50");
        }
    }
    
}
