package aritmatika;
import java.util.Scanner;
public class DeretAritmatika {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan batas awal : ");
        int awal = input.nextInt();
        System.out.print("Masukkan batas akhir : ");
        int akhir = input.nextInt();
        System.out.print("Masukkan beda : ");
        int beda = input.nextInt();
        
        System.out.println(" , ");
        System.out.println("Hasil deret aritmatika : ");
        
        int nilai = awal;
        while(nilai <= akhir) {
            System.out.print(nilai + " ");
            nilai += beda;
        }
        
        System.out.println("");
        System.out.println("Hasil deret aritmatika (for) : ");
        
        for(nilai = awal; nilai <= akhir; nilai+=beda) {
            System.out.print(nilai + " ");
        }
        
    }
}
