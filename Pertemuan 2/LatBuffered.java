/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.belajarjavap3;
import java.io.*;
/**
 *
 * @author ISWARA DAFFA
 */
public class LatBuffered {
    public static void main(String args[])throws Exception
 {
    
InputStreamReader keyreader = new InputStreamReader (System.in);
BufferedReader input = new BufferedReader (keyreader);

String kata1, kata2;

System.out.print("Masukan Kata Pertama : ");
kata1 = input.readLine();
System.out.print("Masukan Kata Kedua : ");
kata2 = input.readLine();
System.out.println("\nHasil Input String " + kata1 + "" + kata2);

}
        
}

