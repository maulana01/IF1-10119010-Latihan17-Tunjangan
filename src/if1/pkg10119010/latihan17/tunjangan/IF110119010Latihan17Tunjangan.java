/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119010.latihan17.tunjangan;

import java.util.Scanner;

/**
 *
 * @author Maulana Imam Malik
 * NAMA     : Maulana Imam Malik
 * KELAS    : IF1
 * NIM      : 10119010
 * Deskripsi Program : Program ini berisi program untuk menghitung &
 *                     menampilkan tunjangan
 */
public class IF110119010Latihan17Tunjangan {

    /**
     * @param args the command line arguments
     */
    public static String status;
    public static Double gaji, tunjangan;
    
    public static void inputData() {
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("==========Program Tunjangan==========");
        System.out.print("Berapa gaji pokok anda perbulan?: Rp. ");
        gaji = scanner.nextDouble();
        
        System.out.print("Status Anda?(Menikah/Belum)\t: ");
        status = scanner.next();
        while (!(status.toUpperCase().equals("MENIKAH") || status.toUpperCase().equals("BELUM"))) {
            System.out.print("Status Anda?(Menikah/Belum)\t: ");
                status = scanner.next();
        }
    }
    
    public static void cekStatus() {
        tunjangan = (status.toUpperCase().equals("MENIKAH")) ? hitungTunjangan(gaji):0.0;
    }
    
    public static double hitungTunjangan(double gaji) {
        double hitungTunjangan = 0.35 * gaji;
        return hitungTunjangan;
    }
    
    public static void tampilFormat() {
        System.out.println("=====Hasil Perhitungan Gaji Anda=====");
        System.out.println("Gaji Pokok\t\t\t: Rp. " + gaji);
        System.out.printf("Tunjangan\t\t\t: Rp. %.1f%n", tunjangan);
        double totalGaji = gaji + tunjangan;
        System.out.println("Total Gaji\t\t\t: Rp. " + totalGaji);
        System.out.println("(Developed by : Maulana Imam Malik)");
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        inputData();
        cekStatus();
        tampilFormat();
    }   
}
