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
public class arrayduadimensi {
  
    public static void main(String[] args) {
        // Deklarasi dan inisialisasi array dua dimensi
        int[][] nilai = {
            {80, 75, 90}, // Nilai siswa 1
            {85, 70, 88}, // Nilai siswa 2
            {78, 82, 84}  // Nilai siswa 3
        };

        // Menampilkan isi array
        System.out.println("Daftar Nilai Siswa:");
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Siswa " + (i + 1) + ": ");
            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print(nilai[i][j] + " ");
            }
            System.out.println(); // Pindah baris
        }
    }
}
  

