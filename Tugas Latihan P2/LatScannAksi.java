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
public class LatScannerAksi {
    public static void main(String args[])
    
    {
    //membuat objek baru
        ClassLatihanScanner scan=new ClassLatihanScanner();
        
        scan.inputScanner();
        System.out.println("PROGRAM NILAI MAHASISWA");
        System.out.println("--------------------------------");
        System.out.println("NIM :"+scan.getnim());
        System.out.println("Nama Mahasiswa : "+scan.getnama());
        System.out.println("Nilai Absen : "+scan.na);
        System.out.println("Nilai Tugas : "+scan.nt);
        System.out.println("Nilai UTS : "+scan.nuts);
        System.out.println("Nilai UAS : "+scan.nuas);
        System.out.println("-------------------------------");
        System.out.println("Rata-rata : "+scan.nrata());
    }
}
