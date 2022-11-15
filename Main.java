
package BangunDatar;
public class Main {

    public static void main(String[] args) {
        
        // membuat objek bangun datar
        BangunDatar bangunDatar = new BangunDatar();
       
        
        // membuat objek Lingkaran dan mengisi nilai properti
        Lingkaran lingkaran = new Lingkaran();
        lingkaran.r = 22;
        
        // memanggil method luas dan keliling
        bangunDatar.luas();
        bangunDatar.keliling();
           
}   
}
