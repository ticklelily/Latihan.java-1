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
public class AksiScanner {
    public static void main(String args[])
            
{
    
ClassScanner scan=new ClassScanner();

scan.inputScanner();
System.out.println("\nNama Anda :" + scan.getnama());
System.out.println("Nilai Anda : " + scan.rata());

}
    
    
}


