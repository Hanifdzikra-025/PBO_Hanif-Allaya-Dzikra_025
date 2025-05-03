package Codelab.Modul3;

// Kelas Main (Kelas Utama)
public class Main {
    public static void main(String[] args) {
        // Membuat objek KarakterGame, Pahlawan, dan Musuh
        KarakterGame KarakterUmum = new KarakterGame ("Karakter Umum", 100);
        Pahlawan brimstone = new Pahlawan("Brimstone", 150);
        Musuh viper = new Musuh("Viper", 200);


        // Menampilkan status awal kesehatan Pahlawan dan Musuh
        System.out.println("Status awal:");
        System.out.println(KarakterUmum.getNama() + "Darah: " + KarakterUmum.getKesehatan());
        System.out.println(brimstone.getNama() + " memiliki kesehatan: " + brimstone.getKesehatan());
        System.out.println(viper.getNama() + " memiliki kesehatan: " + viper.getKesehatan());

        // Mensimulasikan pertarungan
        brimstone.serang(viper);
        viper.serang(brimstone);
    }
}
