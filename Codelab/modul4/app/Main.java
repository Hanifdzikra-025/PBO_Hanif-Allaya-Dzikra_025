package Codelab.modul4.app;

import Codelab.modul4.perpustakaan.*;

public class Main {
    public static void main(String[] args) {
        Buku buku1 = new Nonfiksi("Hasil karya Tan Malaka", "Tan Malaka", "Sejarah & Ilmu Pengetahuan");
        Buku buku2 = new Fiksi("Hainuwelle: Sang Putri Kelapa", "Lilis Hu", "Dongeng");

        buku1.displayInfo();
        buku2.displayInfo();
        System.out.println();

        Anggota anggota1 = new Anggota("Dian Octavian", "B003");
        Anggota anggota2 = new Anggota("Hanif Allaya Dzikra", "B025");

        System.out.println("Anggota: " + anggota1.getNama() + " (ID: " + anggota1.getIdAnggota() + ")");
        System.out.println("Anggota: " + anggota2.getNama() + " (ID: " + anggota2.getIdAnggota() + ")");
        System.out.println();

        anggota1.pinjamBuku("Hasil karya Tan Malaka");
        anggota2.pinjamBuku("Hainuwelle: Sang Putri Kelapa", 7);
        System.out.println();

        anggota1.kembalikanBuku("Hasil karya Tan Malaka");
        anggota2.kembalikanBuku("Hainuwelle: Sang Putri Kelapa");
    }
}
