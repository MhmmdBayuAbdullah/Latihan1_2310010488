package latihan3;

public class Rumus {
    //Muhammad Bayu Abdullah, NPM : 2310010488, Kelas : 4C TI REGP BJB
    private double sisi, panjang, lebar, hasil;
    
        public Rumus() {
        this.sisi = 0;
        this.panjang = 0;
        this.lebar = 0;
        this.hasil = 0;
    }
    
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
    
    public double getHasil() {
        return hasil;
    }
    
    public void setSisi(double sisi) {
    this.sisi = sisi;
    }

    public void setPanjang(double panjang) {
    this.panjang = panjang;
    }

    public void setLebar(double lebar) {
    this.lebar = lebar;
    }
}
