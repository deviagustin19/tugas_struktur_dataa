/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan_II;

/**
 *
 * @author ACER
 */

    import java.util.Scanner;

public class percabanganswitchcase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menampilkan pilihan menu
        System.out.println("Menu Makanan:");
        System.out.println("1. Nasi Goreng");
        System.out.println("2. Mie Ayam");
        System.out.println("3. Sate Ayam");
        System.out.print("Pilih menu (1-3): ");
        
        int pilihan = scanner.nextInt();

        // Percabangan switch-case
        switch (pilihan) {
            case 1:
                System.out.println("Kamu memilih Nasi Goreng.");
                break;
            case 2:
                System.out.println("Kamu memilih Mie Ayam.");
                break;
            case 3:
                System.out.println("Kamu memilih Sate Ayam.");
                break;
            default:
                System.out.println("Menu tidak tersedia.");
                break;
        }

        scanner.close();
    }
}


