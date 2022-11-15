package BangunDatar;



public class Lingkaran extends BangunDatar{
    
    // jari-jari lingkaran
    float r;
    
    @Override
    float luas(){
        float luas = (float) (Math.PI * r * r);
        System.out.println("Luas lingkaran: " + luas);
        return luas;
    }
}