package latihan3;

public class Rumus {
    //Muhammad Bayu Abdullah, NPM : 2310010488, Kelas : 4C TI REGP BJB
    private double sisi, panjang, lebar, hasil;
    
    public Rumus(double sisi, double panjang, double lebar, double hasil){
        this.sisi = sisi;
        this.panjang= panjang;
        this.panjang= lebar;
        this.panjang= hasil;
    }
    
    double setLuasPersegi(){
        return sisi * sisi;
    }
    
    double setLuasPersegiPanjang(){
        return panjang * lebar;
    }
}
