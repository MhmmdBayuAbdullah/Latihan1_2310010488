package latihan3;

public class RumusBeraksi {
    public static void main(String[] args) {
        Rumus bayu = new Rumus();
        
        // Mengatur nilai sisi, panjang, dan lebar
        bayu.setSisi(4);        // untuk persegi
        bayu.setPanjang(5);     // untuk persegi panjang
        bayu.setLebar(3);       // untuk persegi panjang

        // Menghitung luas
        double luasPersegi = bayu.setLuasPersegi();
        double luasPersegiPanjang = bayu.setLuasPersegiPanjang();

        // Menampilkan hasil
        System.out.println("Luas Persegi: " + luasPersegi);
        System.out.println("Luas Persegi Panjang: " + luasPersegiPanjang);
    }
}
