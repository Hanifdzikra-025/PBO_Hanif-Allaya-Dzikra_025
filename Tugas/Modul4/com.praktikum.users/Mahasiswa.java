package Tugas.Modul4.com.praktikum.users;

import Tugas.Modul4.com.praktikum.actions.MahasiswaActions;
import java.util.Scanner;

public class Mahasiswa extends User implements MahasiswaActions {
    public Mahasiswa(String nama, String nim) {
        super(nama, nim);
    }

    @Override
    public boolean login(String inputNama, String inputNim) {
        return getNama().equals(inputNama) && getNim().equals(inputNim);
    }

    @Override
    public void displayInfo() {
        System.out.println("Role: Mahasiswa");
        System.out.println("Login berhasil sebagai Mahasiswa!");
    }

    @Override
    public void reportItem() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n=== Laporkan Barang ===");
        System.out.print("Nama Barang: ");
        String namaBarang = scanner.nextLine();
        System.out.print("Deskripsi Barang: ");
        String deskripsi = scanner.nextLine();
        System.out.print("Lokasi Terakhir/Ditemukan: ");
        String lokasi = scanner.nextLine();
        System.out.println("Barang berhasil dilaporkan: " + namaBarang + ", Deskripsi: " + deskripsi + ", Lokasi: " + lokasi);
    }

    @Override
    public void viewReportedItems() {
        System.out.println(">> Fitur Lihat Laporan Belum Tersedia <<");
    }

    @Override
    public void displayAppMenu() {
        Scanner scanner = new Scanner(System.in);
        int pilihan;
        do {
            System.out.println("\n=== Menu Mahasiswa ===");
            System.out.println("1. Laporkan Barang Temuan/Hilang");
            System.out.println("2. Lihat Daftar Laporan");
            System.out.println("0. Logout");
            System.out.print("Pilih aksi (0-2): ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); // Membersihkan newline

            switch (pilihan) {
                case 1:
                    reportItem();
                    break;
                case 2:
                    viewReportedItems();
                    break;
                case 0:
                    System.out.println("Logout berhasil!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 0);
    }
}