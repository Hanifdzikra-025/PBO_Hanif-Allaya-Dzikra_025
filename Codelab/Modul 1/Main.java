package Codelab.Modul1;

import java.util.Scanner;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // membuat scanner untuk membaca input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // meminta input nama
        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine();

        //meminta input jenis kelamin
        System.out.print("Masukkan jenis kelamin (P/L): ");
        char jeniskelamin = scanner.next().charAt(0);

        // meminta input tahun lahir
        System.out.print("Masukkan tahun lahir: ");
        int tahunlahir = scanner.nextInt();

        // menutup scanner setelah selesai digunakan
        scanner.close();

        //mendapatkan tahun saat ini
        int tahunsekarang = LocalDate.now().getYear();

        // menghitung umur
        int umur = tahunsekarang - tahunlahir;

        // menentukan jenis kelamin
        String jeniskelaminstr;
        if (jeniskelamin == 'L' || jeniskelamin == 'l') {
            jeniskelaminstr = "Laki-laki";
        } else if (jeniskelamin == 'P' || jeniskelamin == 'p') {
            jeniskelaminstr = "Perempuan";
        } else {
            jeniskelaminstr = "Tidak diketahui";
        }

        // menampilkan hasil
        System.out.println("\nData Diri:");
        System.out.println("Nama          : " + nama);
        System.out.println("Jenis Kelamin : " + jeniskelaminstr);
        System.out.println("umur          : " + umur + " tahun");
    }
}
