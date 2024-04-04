package com.mycompany.belajarjava;

public class OpPemberiNilai {
    
    public static void main(String[] args) {
        int a, c, d, e;
        double b;
        a = 3; b = 5; c = 13; d = 4; e = 6;
        
        // Pengunaan assignment operator
        a *= 2;
        b /= 2;
        c %= 2;
        d += 2;
        e -= 2;
        
        System.out.println("Nilai a *= 2 : " + a);
        System.out.println("Nilai b /= 2 : " + b);
        System.out.println("Nilai c %= 2 : " + c);
        System.out.println("Nilai d += 2 : " + d);
        System.out.println("Nilai e -= 2 : " + e);
    }
    
}