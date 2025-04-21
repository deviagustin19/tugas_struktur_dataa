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
public class arraysatudimensi {
    
    public static void main(String[] args) {
        // Deklarasi dan inisialisasi array satu dimensi
        String[] buah = {"Apel", "Jeruk", "Mangga", "Pisang", "Semangka"};

        // Menampilkan isi array
        System.out.println("Daftar Buah:");
        for (int i = 0; i < buah.length; i++) {
            System.out.println((i + 1) + ". " + buah[i]);
        }
    }
}


