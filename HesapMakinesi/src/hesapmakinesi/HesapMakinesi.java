
package hesapmakinesi;

import java.util.Scanner;

public class HesapMakinesi {

   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ilk Sayıyı Girin:");
        int Sayı1 = input.nextInt();
        System.out.println("Ikinci Sayıyı Girin:");
        int Sayı2 = input.nextInt();
        System.out.println("İşlemi Seçin: \n 1.Toplama \n 2.Çıkartma \n 3.Çarpma \n 4.Bölme");
        byte ishlem = input.nextByte();
        
        if(ishlem == 1){
        
            System.out.println("Cavab: " + (Sayı1 +  Sayı2));
    
        }
        else if(ishlem == 2) {
            System.out.println("Cavab:" + (Sayı1 - Sayı2));
        
        }
        else if(ishlem == 3) {
            System.out.println("Cavab:" + (Sayı1 * Sayı2));
        }
        else if(ishlem == 4){
            System.out.println("Cavab:" + (Sayı1 / Sayı2));
        } 
        
    }
    
    
    
}
