/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.belajarjavap3;
import java.util.Scanner;
/**
 *
 * @author ISWARA DAFFA
 */
public class LatIfElse {
     public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String keterangan,nama;
    int nilai;
    
    System.out.print("Masukan Nama Siswa:");
    nama = input.nextLine();
    System.out.print("Masukan Nilai Akhir :");
    nilai = input.nextInt();
        if(nilai > 70){
            keterangan="lulus";
        }else{
            keterangan="Gagal";
        }
      System.out.print("Hasil Akhir");
      System.out.print("==========================================");
      System.out.print("Nama Siswa                  :"+nama);
      System.out.print("Nilai Akhir Yang di dapat   :"+nilai);
      System.out.print("Keterangan                  :"+keterangan);
      System.out.print("==========================================");
      
     }
}
