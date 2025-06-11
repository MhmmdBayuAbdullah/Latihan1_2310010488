package hitung;

public class MatematikaBeraksi {
    public static void main(String[] args) {
        Matematika bayu = new Matematika(2,3);
        
        System.out.println("Hasil Penjumlahan : " + bayu.setPenjumlahan());
        System.out.println("Hasil Pengurangan : " + bayu.setPengurangan());
        System.out.println("Hasil Perkalian : " + bayu.setPerkalian());
        System.out.println("Hasil Pembagian : " + bayu.setPembagian());
    }
}
