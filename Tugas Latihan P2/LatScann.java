/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pertemuan_5;

import java.util.Scanner;

/**
 *
 * @author ISWARA DAFFA
 */
public class LatihanScanner {
    public static void main(String args[])
    {
    //membuat objek baru
        Scanner input = new Scanner (System.in);
    //deklarasi variabel
    String nama, nim;
    int nt,nuts,nuas;
    double na, nrata;
    
        System.out.print("Masukkan Nama : ");
        nama = input.nextLine();
        System.out.print("Masukaan NIM : ");
        nim = input.nextLine();
        System.out.print("Masukkan Nilai Absen : ");
        na = input.nextDouble();
        System.out.print("Masukan Nilai Tugas : ");
        nt = input.nextInt();
        System.out.print("Masukkan Nilai UTS : ");
        nuts = input.nextInt();
        System.out.print("Masukkan Nilai UAS : ");
        nuas = input.nextInt();
        
        nrata = (0.1*na)+(0.2*nt)+(0.3*nuts)+(0.4*nuas);
        System.out.println("\nNIM :"+nim);
        System.out.println("\nNama Mahasiswa :"+nama);
        System.out.println("\nNilai Absen :"+na);
        System.out.println("\nNilai Tugas :"+nt);
        System.out.println("\nNilai UTS :"+nuts);
        System.out.println("\nNilai UAS :"+nuas);
    }
}
