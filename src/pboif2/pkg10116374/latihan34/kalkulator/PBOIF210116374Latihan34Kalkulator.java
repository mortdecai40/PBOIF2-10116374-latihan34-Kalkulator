package pboif2.pkg10116374.latihan34.kalkulator;
import java.util.Scanner;
/**
 *
 * @author Acromyrmex
 */
public class PBOIF210116374Latihan34Kalkulator {

    /**
 * @author Acromyrmex
 * NAMA                 : TEUKU RIZKI NABIL
 * KELAS                : PBO2
 * NIM                  : 10116374
 * Deskripsi Program    : Program untuk melakukan prose berhitung
 *
 */
    public static void main(String[] args) {
        // TODO code application logic here
         Kalkulator kal = new Kalkulator();
        
        System.out.println("===Aplikasi Kalkulator Bilangan===");
        System.out.print("Masukkan Angka ke-1 : ");
        Scanner input = new Scanner(System.in);
        kal.value1 = input.nextDouble();
        System.out.print("Masukkan Angka ke-2 : ");
        kal.value2 = input.nextDouble();
        
        System.out.println("");
        System.out.println("Hasil Pertambahan : " + kal.tambahBilangan());
        System.out.println("Hasil Pengurangan : " + kal.kurangBilangan());
        System.out.println("Hasil Perkalian : " + kal.kaliBilangan());
        System.out.println("Hasil Pembagian : " + kal.bagiBilangan());
        System.out.println("Hasil Sisa : " + kal.sisaBilagan());
        System.out.println("(Developed by : Aufa Ilyasha)");
    }
    
}
