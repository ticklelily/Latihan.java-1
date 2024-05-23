/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pertemuan_5;
import java.util.Scanner;
/**
 *
 * @author lenovo
 */
public class ClassLatihanScanner {
    public String nama,nim;
    public double na;
    public int nt,nuts,nuas;
    Scanner input = new Scanner(System.in);
    
    public String getnama(){
        return nama;
    }
    public String getnim(){
        return nim;
    }
    
    public void inputScanner(){
        
        System.out.print("Masukan NIM Anda : ");
        nim = input.nextLine();
        System.out.print("Masukan Nama Anda : ");
        nama = input.nextLine();
        System.out.print("Masukan Nilai Absen : ");
        na = input.nextDouble();
        System.out.print("Masukan Nilai Tugas : ");
        nt = input.nextInt();
        System.out.print("Masukan Nilai UTS : ");
        nuts = input.nextInt();
        System.out.print("Masukan Nilai UAS : ");
        nuas = input.nextInt();
    }
    
    public double nrata(){
        return ((0.1*na)+(0.2*nt)+(0.3*nuts)+(0.4*nuas));
    }
}
