/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan_5;

/**
 *
 * @author ISWARA DAFFA
 */
import java.util.Scanner;

public class PermataPratama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("********************************");
        System.out.println("PT. PERMATA “PRATAMA”");
        System.out.println("********************************");
        System.out.print("Masukan Nama Petugas: ");
        String namaPetugas = input.nextLine();
        System.out.print("Tanggal: ");
        String tanggal = input.nextLine();
        System.out.println("---------------------------------");
        System.out.print("Jumlah Data yang akan di masukan: ");
        int jumlahData = input.nextInt();
        input.nextLine(); // Consume newline left-over

        String[] kodeBarang = {"P001", "P002", "P003"};
        String[] namaBarang = {"Printer", "VGA Card", "Motherboard"};
        int[] hargaBarang = {700000, 750000, 950000};

        String[] kodeInput = new String[jumlahData];
        int[] jumlahInput = new int[jumlahData];
        int totalPendapatan = 0;

        for (int i = 0; i < jumlahData; i++) {
            System.out.println("Data Ke - " + (i + 1) + ":");
            System.out.print("Kode Barang: ");
            kodeInput[i] = input.nextLine();
            System.out.print("Jumlah: ");
            jumlahInput[i] = input.nextInt();
            input.nextLine(); // Consume newline left-over
        }

        System.out.println("********************************");
        System.out.println("PT. PERMATA “PRATAMA”");
        System.out.println("********************************");
        System.out.println("Nama Petugas: " + namaPetugas);
        System.out.println("Tanggal: " + tanggal);
        System.out.println("---------------------------------");
        System.out.println("Jumlah Data yang akan di masukan: " + jumlahData);
        System.out.println("---------------------------------");
        System.out.println("Data Ke\tKode Barang\tNama Barang\tJumlah Barang\tTotal Harga");

        for (int i = 0; i < jumlahData; i++) {
            int indexBarang = -1;
            for (int j = 0; j < kodeBarang.length; j++) {
                if (kodeBarang[j].equals(kodeInput[i])) {
                    indexBarang = j;
                    break;
                }
            }

            if (indexBarang != -1) {
                int totalHarga = hargaBarang[indexBarang] * jumlahInput[i];
                totalPendapatan += totalHarga;
                System.out.println((i + 1) + "\t" + kodeBarang[indexBarang] + "\t\t" + namaBarang[indexBarang] + "\t\t" + jumlahInput[i] + "\t\t" + "Rp." + totalHarga);
            } else {
                System.out.println("Kode barang tidak ditemukan.");
            }
        }

        System.out.println("\nTotal Pendapatan Pada Tanggal " + tanggal + " adalah sebesar Rp." + totalPendapatan);
    }
}
package com.mycompany.pertemuan_5;