package Tugas.Modul4.com.praktikum.main;

import Tugas.Modul4.com.praktikum.users.Admin;
import Tugas.Modul4.com.praktikum.users.Mahasiswa;
import Tugas.Modul4.com.praktikum.users.User;

import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Data dummy untuk contoh
        Admin admin = new Admin("Admin Utama", "A001", "admin", "admin123");
        Mahasiswa mahasiswa = new Mahasiswa("Hanif", "025");
        System.out.println("=== Sistem Login Sederhana ===");
        System.out.println("1. Login sebagai Admin");
        System.out.println("2. Login sebagai Mahasiswa");
        System.out.print("Pilih role (1/2): ");
        int pilihan = scanner.nextInt();
        scanner.nextLine(); // Membersihkan newline

        User user = null;
        if (pilihan == 1) {
            // Login Admin
            System.out.print("Username: ");
            String username = scanner.nextLine();
            System.out.print("Password: ");
            String password = scanner.nextLine();

            if (admin.login(username, password)) {
                admin.displayInfo();
                user = admin;
            } else {
                System.out.println("Login gagal! Username atau password salah.");
            }
        } else if (pilihan == 2) {
            // Login Mahasiswa
            System.out.print("Nama: ");
            String nama = scanner.nextLine();
            System.out.print("NIM: ");
            String nim = scanner.nextLine();

            if (mahasiswa.login(nama, nim)) {
                mahasiswa.displayInfo();
                user = mahasiswa;
            } else {
                System.out.println("Login gagal! Nama atau NIM salah.");
            }
        } else {
            System.out.println("Pilihan tidak valid!");
        }

        // Polimorfisme: Memanggil displayAppMenu() berdasarkan role
        if (user != null) {
            user.displayAppMenu();
        }

        scanner.close();
    }
}