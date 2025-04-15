
package javaapplication32;
import java.util.Scanner;
public class JavaApplication32 {
    
    public static void main(String[] args) {
        
        Scanner klavye = new Scanner(System.in);
        
        String giris;
        
        do{
            System.out.println("Lütfen bir kelime girin.");
            giris = klavye.nextLine();
            
            System.out.println("Girdiğiniz kelime: " + giris);
        } while(!giris.equalsIgnoreCase("exit"));
        System.out.println("Program sonlandı.");
    }
    
}

