package pewarisan;

/**
 *
 * @author lenovo
 */
class sepeda {
    int kecepatan = 0;
    int gir = 0;
    //method
    void ubahgir(int pertambahangir){
        gir = gir + pertambahangir;
        System.out.println("Gir ; "+gir);
    }
    void tambahkecepatan(int pertambahankecepatan){
        kecepatan = kecepatan + pertambahankecepatan;
        System.out.println("Kecepatan : "+kecepatan);
    }
    
}
